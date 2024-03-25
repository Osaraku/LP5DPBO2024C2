# LP5DPBO2024C2
## Janji
Saya Muhamad Tio Ariyanto [2201718] mengerjakan soal Latihan Praktikum 5
dalam mata kuliah DPBO untuk keberkahanNya saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin

## Deskripsi Program
Program ini adalah sebuah aplikasi Java Swing GUI yang dirancang untuk mengelola data mahasiswa. Dengan menggunakan program ini, pengguna dapat melakukan operasi CRUD yaitu Create (membuat), Read (membaca), Update (memperbarui), dan Delete (menghapus) data mahasiswa.

## Desain Program
Pada kelas Mahasiswa, terdapat 5 atribut yaitu:
- `nim`: Menyimpan nomor induk mahasiswa (NIM) dalam bentuk string.
- `nama`: Menyimpan nama lengkap mahasiswa dalam bentuk string.
- `jenisKelamin`: Menyimpan jenis kelamin mahasiswa dalam bentuk string.
- `jalurMasuk`: Menyimpan jalur masuk mahasiswa ke perguruan tinggi dalam bentuk string.
- `status`: Menyimpan status mahasiswa saat ini dalam bentuk string.

Pada kelas Menu, terdapat 2 atribut yaitu:
- `listMahasiswa`: ArrayList untuk manampung semua objek Mahasiswa.
- `selectedIndex`: Menyimpan indeks baris yang sedang dipilih pada tabel dalam bentuk integer.

sementara untuk elemen GUI yang digunakan antara lain:
-  `JLabel`: Digunakan untuk memberikan label pada elemen-elemen GUI seperti NIM, nama, jenis kelamin, jalur masuk, dan status.
-  `JTextField`: Digunakan untuk memasukkan nilai NIM dan nama mahasiswa.
-  `JComboBox`: Digunakan untuk memilih jenis kelamin dan jalur masuk mahasiswa.
-  `JRadioButton`: Digunakan untuk memilih status mahasiswa, yaitu "Aktif" atau "Cuti".
-  `JButton`: Digunakan untuk membuat tombol yang bisa ditekan seperti tombol Add, Update, Cancel, Delete.
-  `JTable`: Digunakan untuk menampilkan data mahasiswa yang telah dimasukkan atau diperbarui.

Terdapat penambahan beberapa fitur dari versi sebelumnya seperti:
1. Semua proses CRUD sudah terhubung ke dalam database.
2. Terdapat dialog/prompt error jika masih ada input yang kosong saat insert/update.
3. Terdapat dialog/prompt error jika sudah ada NIM yang sama saat insert.

## Penjelasan Alur
1. Pada saat program dijalankan, pengguna akan ditampilkan dengan tabel yang menampilkan data mahasiswa yang telah disimpan.
2. Pengguna memiliki opsi untuk menambahkan data mahasiswa baru dengan mengisi formulir yang tersedia lalu menekan tombol `Add`.
3. Data tidak dapat ditambahkan apabila masih ada form yang belum diisi dan juga sudah ada mahasiswa yang menggunakan NIM yang sama sebelumnya.
4. Pengguna dapat menekan tombol `Cancel` untuk membersihkan formulir.
5. Jika pengguna menekan salah satu entri mahasiswa di tabel, formulir akan terisi dengan data mahasiswa yang dipilih.
6. Pengguna dapat melakukan pengeditan pada formulir kemudian menekan tombol `Update` untuk mengubah data mahasiswa.
7. Sama seperti penambahan data, pengubahan data tidak dapat dilakukan apabila ada bagian form yang kosong.
8. Pengguna juga dapat menghapus data mahasiswa yang dipilih dengan menekan tombol `Delete`, dan program akan meminta konfirmasi pengguna untuk menghapus data.
9. Jika pengguna mengonfirmasi penghapusan, data mahasiswa yang dipilih akan dihapus dari tabel.
10. Pengguna dapat menekan tombol `Cancel` pada saat memilih salah satu mahasiswa untuk membatalkan pilihan.

## Dokumentasi
### Screen record
https://github.com/Osaraku/LP5DPBO2024C2/assets/117560099/d9c4c5ba-547d-4d9c-84b1-2096c23c163f

### Screenshots
![Screenshot1](https://github.com/Osaraku/LP5DPBO2024C2/assets/117560099/7f484bb9-3209-4e8f-b20f-2fd1666c3eb4)
![Screenshot2](https://github.com/Osaraku/LP5DPBO2024C2/assets/117560099/135086ea-5d5b-4073-8ca9-51d58ada9ea7)
![Screenshot3](https://github.com/Osaraku/LP5DPBO2024C2/assets/117560099/9bb9ca4c-cf1f-404d-b2fd-9b70a409c94c)
