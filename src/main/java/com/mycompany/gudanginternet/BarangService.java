/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gudanginternet;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
public class BarangService {
    private ArrayList<Barang> daftarBarang;
    private int nextId;

    public BarangService() {
        this.daftarBarang = new ArrayList<>();
        this.nextId = 1;
    }
    int ambilIdBerikutnya() {
        return nextId;
    }
    public Barang tambahBarang(String namaBarang, String kategori, double harga, int stok) {
        Barang barangBaru = new Barang(nextId, namaBarang, kategori, harga, stok);
        daftarBarang.add(barangBaru);
        nextId++;
        return barangBaru;
    }
    public Barang tambahBarang(String namaBarang, String kategori, double harga, int stok,
            String merek, int garansiBulan) {
        Barang barangBaru = new PerangkatJaringan(nextId, namaBarang, kategori, harga, stok, merek, garansiBulan);
        daftarBarang.add(barangBaru);
        nextId++;
        return barangBaru;
    }
    public Barang tambahBarang(String namaBarang, String kategori, double harga, int stok,
            double panjangMeter, String jenisKabel) {
        Barang barangBaru = new KabelJaringan(nextId, namaBarang, kategori, harga, stok, panjangMeter, jenisKabel);
        daftarBarang.add(barangBaru);
        nextId++;
        return barangBaru;
    }

    public void tampilkanSemuaBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Belum ada data barang di gudang.");
            return;
        }
        System.out.println("=====================================================================");
        for (Barang b : daftarBarang) {
            b.tampilkanInfo();
            System.out.println("---------------------------------------------------------------------");
        }
    }

    public Barang cariBarangById(int id) {
        for (Barang b : daftarBarang) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public boolean updateBarang(int id, String namaBarang, String kategori, double harga, int stok) {
        Barang barang = cariBarangById(id);
        if (barang == null) {
            return false;
        }
        barang.setNamaBarang(namaBarang);
        barang.setKategori(kategori);
        barang.setHarga(harga);
        barang.setStok(stok);
        return true;
    }

    public boolean hapusBarang(int id) {
        Barang barang = cariBarangById(id);
        if (barang == null) {
            return false;
        }
        return daftarBarang.remove(barang);
    }

    public int getJumlahBarang() {
        return daftarBarang.size();
    }
}
