<h1>Gudang Internet Comtelindo</h1>

<h1>MINPRO 2 PBO</h1>

## 👤 Identitas

| | |
|---|---|
| **Nama** | Muhammad Syawal Samir |
| **NIM** | 2509116079 |
| **Kelas** | Sistem Informasi 25'B |
| **Tema** | Gudang Internet  |
| **Minpro PBO** | 2 |

<h3>1. Deskripsi Sigkat Program</h3>

Sistem Gudang Internet Comtelindo adalah program Java sederhana berbasis console yang dipakai untuk mengelola data barang atau perangkat di gudang, seperti modem, kabel, router, dan sejenisnya. Program ini pakai ArrayList untuk nyimpan data selama aplikasinya jalan, jadi data akan hilang lagi begitu program ditutup (belum tersimpan permanen ke database atau file).

Lewat program ini, pengguna bisa nambah barang baru, lihat semua barang yang ada, cari barang tertentu pakai ID-nya, update data barang kalau ada perubahan, sampai hapus barang yang sudah tidak dipakai lagi. Semua fitur itu dikemas dalam satu menu utama yang tinggal dipilih pakai angka 1 sampai 6.

Program ini memiliki fitur CRUD (Create, Read, Update, Delete) yang terdiri dari enam menu utama, yaitu:

- Tambah Barang, digunakan untuk menambahkan data barang baru ke dalam gudang.

- Tampilkan Semua Barang, digunakan untuk melihat seluruh data barang yang tersimpan.

- Cari Barang berdasarkan ID, digunakan untuk mencari data barang tertentu secara spesifik.

- Update Barang, digunakan untuk mengubah data barang yang sudah ada.

- Hapus Barang, digunakan untuk menghapus data barang dari sistem.

- Keluar, digunakan untuk mengakhiri program.


<h3>2. Penjelasan alur program</h3>

- Saat program dijalankan, sistem langsung menampilkan Menu Utama yang berisi 6 pilihan: Tambah Barang, Tampilkan Semua Barang, Cari Barang berdasarkan ID, Update Barang, Hapus Barang, dan Keluar. Pengguna tinggal mengetik angka 1 sampai 6 sesuai menu yang mau dipilih.

- Kalau  memilih 1 (Tambah Barang), sistem akan minta input nama barang, kategori, harga, dan stok. Setelah semua diisi, data langsung disimpan ke dalam ArrayList dan sistem otomatis kasih ID baru untuk barang tersebut, lalu menampilkan pesan konfirmasi kalau barang berhasil ditambahkan.

- Kalau memilih 2 (Tampilkan Semua Barang), sistem akan menampilkan seluruh data barang yang sudah tersimpan dalam bentuk tabel, lengkap dengan ID, nama, kategori, harga, dan stoknya.

- Kalau memilih 3 (Cari Barang berdasarkan ID), pengguna diminta memasukkan ID barang yang dicari. Sistem akan mencari data dengan ID tersebut di ArrayList, lalu menampilkan detail barang itu saja kalau ditemukan.

- Kalau memilih 4 (Update Barang), sistem dulu menampilkan daftar semua barang supaya pengguna tahu ID mana yang mau diubah. Setelah ID dimasukkan, sistem menampilkan data lama barang tersebut, lalu meminta input data baru (nama, kategori, harga, stok). Data lama kemudian ditimpa dengan data baru itu.

- Kalau memilih 5 (Hapus Barang), sistem juga menampilkan daftar barang dulu, lalu meminta ID barang yang mau dihapus. Sebelum benar-benar dihapus, ada pertanyaan konfirmasi (y/n) supaya tidak salah hapus data. Kalau dijawab "y", barang langsung dihapus dari ArrayList yang ada di kode

Kalau memilih 6 (Keluar), sistem menampilkan pesan penutup lalu program berhenti berjalan.

Proses ini terus berulang (looping) kembali ke Menu Utama setiap selesai menjalankan satu menu, sampai pengguna memilih untuk keluar.

<h3>3. DOKUMENTASI PROGRAM</h3>

</h3>A.Menu Gudang Internet Comtelindo</h3>


Sistem Gudang Internet Comtelindo adalah aplikasi command-line interface (CLI) sederhana yang digunakan untuk mengelola data inventaris barang di gudang internet Comtelindo. Aplikasi ini menyediakan menu interaktif dengan enam pilihan utama: menambahkan barang baru ke dalam sistem, menampilkan seluruh daftar barang yang tersedia, mencari barang berdasarkan ID tertentu, memperbarui data barang yang sudah ada, menghapus barang dari daftar, serta keluar dari program. Dengan antarmuka berbasis teks yang ringan dan mudah digunakan, sistem ini cocok untuk membantu pengelolaan stok barang secara cepat tanpa memerlukan tampilan grafis yang kompleks.


<p align="center">
  <img width="510" height="285" alt="Cuplikan layar 2026-09-23 180721" src="https://github.com/user-attachments/assets/6d61cb86-d863-42ad-b3fb-5a84ed91bdb7" />
</p>

<h3>B.Menampilkan Menu Tambah Barang</h3>





