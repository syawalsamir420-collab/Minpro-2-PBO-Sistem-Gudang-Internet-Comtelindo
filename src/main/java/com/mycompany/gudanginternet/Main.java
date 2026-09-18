/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gudanginternet;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BarangService service = new BarangService();

        // ===== DUMMY DATA AWAL (wajib minimal 1, di sini 5 data) =====
        // memanfaatkan overloading tambahBarang() dan inheritance/polymorphism
        service.tambahBarang("Kabel UTP Cat 6", "Kabel", 5000, 200, 100.0, "UTP Cat 6");
        service.tambahBarang("Modem ZTE F609", "Perangkat Jaringan", 350000, 25, "ZTE", 12);
        service.tambahBarang("Router Mikrotik RB750", "Perangkat Jaringan", 620000, 10, "Mikrotik", 24);
        service.tambahBarang("Kabel Fiber Optik Dropcore", "Kabel", 750000, 15, 100.0, "Fiber Optik");
        service.tambahBarang("Konektor RJ45", "Aksesoris", 1500, 500);

        boolean running = true;

        while (running) {
            tampilkanMenu();
            int pilihan = Validator.inputPilihanMenu(sc, "Pilih menu (1-6): ", 1, 6);

            switch (pilihan) {
                case 1:
                    tambahBarang(sc, service);
                    break;
                case 2:
                    System.out.println("\n=== DAFTAR BARANG GUDANG ===");
                    service.tampilkanSemuaBarang();
                    break;
                case 3:
                    cariBarang(sc, service);
                    break;
                case 4:
                    updateBarang(sc, service);
                    break;
                case 5:
                    hapusBarang(sc, service);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan Sistem Gudang Internet Comtelindo!");
                    running = false;
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
            System.out.println();
        }

        sc.close();
    }

    private static void tampilkanMenu() {
        System.out.println("===========================================");
        System.out.println("   SISTEM GUDANG INTERNET COMTELINDO");
        System.out.println("===========================================");
        System.out.println("1. Tambah Barang");
        System.out.println("2. Tampilkan Semua Barang");
        System.out.println("3. Cari Barang berdasarkan ID");
        System.out.println("4. Update Barang");
        System.out.println("5. Hapus Barang");
        System.out.println("6. Keluar");
        System.out.println("===========================================");
    }

    private static void tambahBarang(Scanner sc, BarangService service) {
        System.out.println("\n=== TAMBAH BARANG GUDANG ===");
        System.out.println("Jenis barang:");
        System.out.println("1. Barang Biasa");
        System.out.println("2. Perangkat Jaringan (punya merek & garansi)");
        System.out.println("3. Kabel Jaringan (punya panjang & jenis kabel)");
        int jenis = Validator.inputPilihanMenu(sc, "Pilih jenis (1-3): ", 1, 3);

        String nama = Validator.inputString(sc, "Nama barang: ");
        String kategori = Validator.inputString(sc, "Kategori: ");
        double harga = Validator.inputDoubleMin(sc, "Harga (Rp): ", 0);
        int stok = Validator.inputIntMin(sc, "Stok: ", 0);

        Barang barangBaru;
        switch (jenis) {
            case 2:
                String merek = Validator.inputString(sc, "Merek: ");
                int garansi = Validator.inputIntMin(sc, "Garansi (bulan): ", 0);
                barangBaru = service.tambahBarang(nama, kategori, harga, stok, merek, garansi);
                break;
            case 3:
                double panjang = Validator.inputDoubleMin(sc, "Panjang (meter): ", 0.1);
                String jenisKabel = Validator.inputString(sc, "Jenis kabel: ");
                barangBaru = service.tambahBarang(nama, kategori, harga, stok, panjang, jenisKabel);
                break;
            default:
                barangBaru = service.tambahBarang(nama, kategori, harga, stok);
        }
        System.out.println("Barang berhasil ditambahkan dengan ID: " + barangBaru.getId());
    }

    private static void cariBarang(Scanner sc, BarangService service) {
        System.out.println("\n=== CARI BARANG ===");
        int id = Validator.inputIntMin(sc, "Masukkan ID barang: ", 1);
        Barang barang = service.cariBarangById(id);
        if (barang == null) {
            System.out.println("Barang dengan ID " + id + " tidak ditemukan.");
        } else {
            System.out.println("Barang ditemukan:");
            barang.tampilkanInfo();
        }
    }

    private static void updateBarang(Scanner sc, BarangService service) {
        System.out.println("\n=== UPDATE BARANG ===");
        service.tampilkanSemuaBarang();
        int id = Validator.inputIntMin(sc, "Masukkan ID barang yang ingin diupdate: ", 1);
        Barang barang = service.cariBarangById(id);
        if (barang == null) {
            System.out.println("Barang dengan ID " + id + " tidak ditemukan.");
            return;
        }

        System.out.println("Data saat ini:");
        barang.tampilkanInfo();
        String nama = Validator.inputString(sc, "Nama barang baru: ");
        String kategori = Validator.inputString(sc, "Kategori baru: ");
        double harga = Validator.inputDoubleMin(sc, "Harga baru (Rp): ", 0);
        int stok = Validator.inputIntMin(sc, "Stok baru: ", 0);

        boolean berhasil = service.updateBarang(id, nama, kategori, harga, stok);
        if (berhasil) {
            System.out.println("Barang berhasil diupdate.");
        } else {
            System.out.println("Gagal mengupdate barang.");
        }
    }

    private static void hapusBarang(Scanner sc, BarangService service) {
        System.out.println("\n=== HAPUS BARANG ===");
        service.tampilkanSemuaBarang();
        int id = Validator.inputIntMin(sc, "Masukkan ID barang yang ingin dihapus: ", 1);
        Barang barang = service.cariBarangById(id);
        if (barang == null) {
            System.out.println("Barang dengan ID " + id + " tidak ditemukan.");
            return;
        }
        System.out.print("Yakin ingin menghapus '" + barang.getNamaBarang() + "'? (y/n): ");
        String konfirmasi = sc.nextLine().trim().toLowerCase();
        if (konfirmasi.equals("y")) {
            service.hapusBarang(id);
            System.out.println("Barang berhasil dihapus.");
        } else {
            System.out.println("Penghapusan dibatalkan.");
        }
    }
}
