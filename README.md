 Tugas 1 — Implementasi Class `Mobil` dengan Java & PHP

Nama: Muchamad Rava Alvriansyah
NPM: 4525210040

 1. Deskripsi
Class `Mobil` dibuat untuk merepresentasikan sebuah kendaraan bermotor yang digunakan sebagai alat transportasi.
Class ini memiliki beberapa atribut yang menggambarkan identitas mobil, spesifikasi mesin, kondisi pergerakan, serta sistem pengereman.
Implementasi class dibuat menggunakan dua bahasa pemrograman, yaitu:
* Java
* PHP

 2. Atribut Class
Class `Mobil` memiliki atribut sebagai berikut:

| Atribut | Tipe Data | Keterangan                                                   |
| ------- | --------- | ------------------------------------------------------------ |
| `merk`  | `String`  | Nama atau merk mobil dan wajib diberikan melalui constructor |
| `mesin` | `String`  | Informasi mengenai mesin atau tenaga mobil                   |
| `aksi`  | `String`  | Menunjukkan tindakan atau kondisi pergerakan mobil           |
| `rem`   | `String`  | Informasi mengenai sistem atau kondisi pengereman            |

Atribut `mesin`, `aksi`, dan `rem` dapat bernilai `null` sebelum diberikan nilai.

 3. Method
 `jalan()`
Method `jalan()` digunakan untuk menampilkan status pergerakan mobil.
Method ini membutuhkan informasi:
* `mesin`
* `aksi`
Jika `mesin` atau `aksi` bernilai `null` ketika method dipanggil, maka program akan menghasilkan exception.

 `pengereman()`
Method `pengereman()` digunakan untuk menampilkan kondisi pengereman mobil.
Atribut `rem` harus memiliki nilai sebelum method dijalankan. Jika `rem` bernilai `null`, maka program akan menghasilkan exception.

 4. Ketentuan Invarian
 A. Method `jalan()`

Nilai`mesin` dan `aksi` tidak boleh `null` ketika `jalan()` dipanggil.
Alasan:
Mobil membutuhkan mesin sebagai sumber tenaga dan aksi sebagai informasi mengenai pergerakan. Tanpa kedua informasi tersebut, status perjalanan mobil tidak dapat ditentukan dengan benar.
Exception yang digunakan:
* Java: `IllegalArgumentException`
* PHP: `InvalidArgumentException`

 B. Method `pengereman()`
Nilai `rem` tidak boleh `null` ketika `pengereman()` dipanggil.
Alasan:
Rem merupakan bagian penting dalam keselamatan dan pengoperasian mobil. Oleh karena itu, informasi mengenai rem harus tersedia sebelum method pengereman dijalankan.
Exception yang digunakan:
* Java: `IllegalArgumentException`
* PHP: `InvalidArgumentException`

 5. Struktur Direktori
text
PBO/
└── Tugas1/
    ├── img/
    ├── src/
    │   ├── Mobil.java
    │   ├── Main.java
    │   ├── Mobil.php
    │   └── index.php
    └── README.md

Folder `src` digunakan untuk menyimpan source code Java dan PHP, sedangkan folder `img` dapat digunakan untuk menyimpan dokumentasi atau gambar hasil program.

6. Cara Menjalankan Program
 Java
Masuk ke folder `src`, kemudian lakukan kompilasi:
bash
javac Mobil.java Main.java
Setelah berhasil dikompilasi, jalankan program:
bash
java Main

 PHP
Program PHP dapat dijalankan menggunakan perintah:
bash
php index.php
 7. Alur Penggunaan Program
Program dimulai dengan membuat object dari class `Mobil` menggunakan merk mobil sebagai parameter constructor.
Setelah object dibuat, nilai `mesin`, `aksi`, dan `rem` dapat diberikan sesuai kebutuhan.
Method `jalan()` digunakan untuk menampilkan kondisi pergerakan mobil, sedangkan method `pengereman()` digunakan untuk menampilkan kondisi pengereman.
Apabila method dipanggil tanpa data yang diperlukan, program akan memberikan exception sebagai bentuk validasi terhadap kondisi object.

 8. Tujuan Implementasi
Implementasi class `Mobil` bertujuan untuk menerapkan konsep **Object-Oriented Programming (OOP)**, antara lain:
* Membuat class dan object.
* Menggunakan constructor.
* Menggunakan atribut atau field.
* Membuat dan menggunakan method.
* Menerapkan invarian pada object.
* Melakukan validasi data.
* Menangani exception.
* Mengimplementasikan OOP menggunakan Java dan PHP.

 9. Deklarasi Penggunaan AI
Dalam pengerjaan tugas ini, AI **Claude (Anthropic)** digunakan sebagai alat bantu untuk menyusun dan merapikan dokumentasi `README.md`.
AI digunakan untuk membantu:
* Menentukan struktur dokumentasi.
* Merapikan penjelasan mengenai class `Mobil`.
* Menyusun penjelasan atribut dan method.
* Menjelaskan invarian dan exception.
* Menyusun cara menjalankan program.
* Memperbaiki struktur dan bahasa dokumentasi.

AI tidak digunakan untuk membuat kode Java maupun PHP. Kode program dibuat berdasarkan ketentuan tugas dan pemahaman terhadap materi yang diberikan.
 Prompt yang digunakan

Bertindak sebagai seorang Analyst dan Writer.
Saya ingin membuat README.md untuk tugas Pemrograman
Berorientasi Objek mengenai implementasi class Mobil
menggunakan Java dan PHP.Susun README.md secara rapi, sistematis, dan mudah dipahami.
Jelaskan deskripsi class, atribut, method, invarian,
struktur folder, cara menjalankan program, serta deklarasi
penggunaan AI.Dokumentasi harus disesuaikan dengan kode dan ketentuan tugas
yang telah saya buat. Jangan membuat atau mengubah kode Java
maupun PHP. Fokus hanya pada penyusunan dokumentasi README.md
