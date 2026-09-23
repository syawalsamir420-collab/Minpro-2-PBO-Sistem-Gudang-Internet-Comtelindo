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

<h3>A.Menu Gudang Internet Comtelindo</h3>

Sistem Gudang Internet Comtelindo adalah aplikasi command-line interface (CLI) sederhana yang digunakan untuk mengelola data inventaris barang di gudang internet Comtelindo. Aplikasi ini menyediakan menu interaktif dengan enam pilihan utama: menambahkan barang baru ke dalam sistem, menampilkan seluruh daftar barang yang tersedia, mencari barang berdasarkan ID tertentu, memperbarui data barang yang sudah ada, menghapus barang dari daftar, serta keluar dari program. Dengan antarmuka berbasis teks yang ringan dan mudah digunakan, sistem ini cocok untuk membantu pengelolaan stok barang secara cepat tanpa memerlukan tampilan grafis yang kompleks.

<p align="center">
  <img width="510" height="285" alt="Cuplikan layar 2026-09-23 180721" src="https://github.com/user-attachments/assets/6d61cb86-d863-42ad-b3fb-5a84ed91bdb7" />
</p>


<h3>B.Menampilkan Menu Tambah Barang Biasa</h3>

Fitur Tambah Barang memungkinkan pengguna menambahkan data barang baru ke dalam sistem gudang. Saat memilih menu ini, pengguna akan diminta menentukan jenis barang terlebih dahulu, yaitu Barang Biasa, Perangkat Jaringan (yang memiliki atribut merek dan garansi), atau Kabel Jaringan (yang memiliki atribut panjang dan jenis kabel). Setelah jenis dipilih, sistem akan meminta input berupa nama barang, kategori, harga, dan jumlah stok. Setiap barang yang berhasil ditambahkan akan otomatis diberikan ID unik oleh sistem sebagai penanda identitas barang tersebut di dalam gudang.

<p align="center">
 <img width="543" height="548" alt="Cuplikan layar 2026-09-23 191503" src="https://github.com/user-attachments/assets/6edf203c-172a-4e30-944f-a64e5da44e88" />
</p>

<h3>C.Menampilkan Menu Tambah Barang punya merek & garansi</h3>

Untuk jenis Perangkat Jaringan, sistem akan meminta dua informasi tambahan di luar data barang standar, yaitu merek dan masa garansi (dalam bulan). Contohnya, barang bernama "Splicer" dengan kategori Elektronik, harga Rp100.000.000, stok 20 unit, merek "Signal Fire Original", dan garansi 12 bulan berhasil ditambahkan dengan ID 7. Atribut khusus ini membedakan Perangkat Jaringan dari Barang Biasa, karena informasi merek dan garansi penting untuk keperluan klaim atau pelacakan kualitas perangkat jaringan yang digunakan.

<p align="center">
<img width="571" height="582" alt="image" src="https://github.com/user-attachments/assets/5fb6797d-19c6-4b8a-a955-1ff77090e745" />
</p>

<h3>D.Menampilkan Menu Tambah Barang punya panjang & jenis kabeli</h3>

Untuk jenis Kabel Jaringan, sistem meminta dua informasi tambahan berupa panjang kabel (dalam meter) dan jenis kabel. Contohnya, barang "Kabel 96 core" dengan kategori Kabel, harga Rp1.000.000, stok 10, panjang 150 meter, dan jenis kabel FO (Fiber Optik) berhasil ditambahkan dengan ID 8. Atribut ini penting untuk membedakan spesifikasi teknis antar jenis kabel, seperti UTP, Fiber Optik, atau jenis lainnya, sehingga memudahkan pencarian kabel sesuai kebutuhan instalasi jaringan.

<p align="center">
<img width="537" height="597" alt="Cuplikan layar 2026-09-23 192104" src="https://github.com/user-attachments/assets/83610f30-fe9d-4b90-8177-a75bb05aa625" />
</p>

<h3>E.Tampilkan Semua Barang</h3>

Fitur Tampilkan Semua Barang digunakan untuk menampilkan seluruh daftar barang yang tersimpan di gudang secara lengkap dan terperinci. Setiap barang ditampilkan beserta ID, nama, kategori, harga, dan stoknya, ditambah atribut khusus sesuai jenisnya masing-masing — misalnya barang jenis Kabel Jaringan akan menampilkan informasi panjang dan jenis kabel, sedangkan Perangkat Jaringan menampilkan informasi merek dan lama garansi. Fitur ini memudahkan pengguna untuk melihat kondisi gudang secara menyeluruh dalam satu tampilan, termasuk barang biasa yang hanya menampilkan data standar tanpa atribut tambahan.

<p align="center">
<img width="571" height="945" alt="Cuplikan layar 2026-09-23 192422" src="https://github.com/user-attachments/assets/5a2e363b-475a-4a1d-85ce-6ed898471ffc" />
</p>

<h3>F.Cari Barang berdasarkan ID</h3>

Fitur Cari Barang berdasarkan ID memungkinkan pengguna menemukan data barang tertentu dengan cepat cukup dengan memasukkan ID barang yang dicari. Jika barang dengan ID tersebut ditemukan, sistem akan menampilkan seluruh detail informasinya, mulai dari nama, kategori, harga, dan stok, hingga atribut khusus sesuai jenis barangnya. Sebagai contoh, pencarian dengan ID 2 menampilkan data lengkap "Modem ZTE F609" yang termasuk kategori Perangkat Jaringan, lengkap dengan informasi merek dan garansinya. Fitur ini sangat berguna untuk mempercepat proses pengecekan barang tanpa harus menelusuri seluruh daftar barang di gudang.

<p align="center">
<img width="548" height="600" alt="Cuplikan layar 2026-09-23 192705" src="https://github.com/user-attachments/assets/75afef52-a23d-4175-ba4b-39d7d1f96132" />
</p>





