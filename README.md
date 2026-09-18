<h1>Gudang Internet Comtelindo</h1>

Nama : Muhammad Syawal Samir

Kelas : B

Nim : 2509116079

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

<h3>3.Dokmentasi Program</h3>

</h3>A.Menu Gudang Internet Comtelindo</h3>

berikut screnshoot tampilan menu Gudang Internet Comtelindo yang menyediakan fitur untuk menambah, melihat, mengubah,menghapus, Dan Keluar. Dari Tampilan Gudang Internet Comtelindo.

<img width="532" height="200" alt="Cuplikan layar 2026-09-08 162830" src="https://github.com/user-attachments/assets/aa230600-5fb3-4361-b5fc-cf26f99a0fad" />



B.Tampilan Menu Menambah Barang

berikut screnshoot tampilan menu Nomor 1 yaitu MeNambah Sebuah Barang contohnya saya disini menambahkahkan barang starlink ada nama barang,kategori,harga, dan Stok barang


<img width="485" height="376" alt="Cuplikan layar 2026-09-08 162740" src="https://github.com/user-attachments/assets/d2c62fe8-dd4d-4826-8095-879cd5b014d8" />


C.Tampilan Menu Melihat Barang

Berikut Screnshoot tampilan Menu Nomor 2 Yaitu Melihat Barang Yang Ada Didalam Gudang Internet Tersebut.


<img width="710" height="412" alt="Cuplikan layar 2026-09-08 163435" src="https://github.com/user-attachments/assets/b5737287-f801-4e00-afef-b6f2914e6e75" />


D.Tampilan Menu Mencari Barang

berikut screnshoot tampilan menu Nomor 3 yaitu Mencari Sebuah Barang berdasarkan ID Maka nanti akan keluar menu barang,jumlah stok dan lain-lain


<img width="711" height="368" alt="Cuplikan layar 2026-09-08 163613" src="https://github.com/user-attachments/assets/ae84bc37-51f9-49cb-9244-d0d2500ea6d8" />


E.Tampilan Menu Update Barang


berikut screnshoot tampilan menu Nomor 4 yaitu Mengupdate Barang semisalnya Jika ada Barang Yang Menambah Stok Atau Mengurangi Stok Dari Gudang Internet Comtelindo


<img width="837" height="295" alt="Cuplikan layar 2026-09-08 164225" src="https://github.com/user-attachments/assets/09ec4a4a-8c06-42ae-8422-942db873474b" />


F.Tampilan Menghapus Barang


berikut screnshoot tampilan menu Nomor 5 yaitu Menghapus Barang semisalnya Jika ada Barang Yang Ingin Dihapus Atau Ada Yang Stock Nya Sudah habis.


<img width="666" height="223" alt="Cuplikan layar 2026-09-08 164426" src="https://github.com/user-attachments/assets/5af725f6-5a61-4a3b-821b-d49d69b120e4" />


G.Tampilan Keluar Dari Sistem Gudang


berikut screnshoot tampilan menu Nomor 6 yaitu Saya Mendanambahkan fitur Keluar karena Jika ada Di sistem kepencet jadi bisa keluar dengan menu ini jadi tidak perlu ribet lagi.


<img width="702" height="381" alt="Cuplikan layar 2026-09-08 164602" src="https://github.com/user-attachments/assets/8a8fb5b0-e094-48eb-a206-40e64ea18436" />







 




