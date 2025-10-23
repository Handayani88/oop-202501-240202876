# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: [Tuliskan judul topik, misalnya "Class dan Object"]

## Identitas
- Nama  : Nur Dini Handayani
- NIM   : 240202876
- Kelas : 3IKRB

---

## Tujuan
Praktikum Class dan Object minggu ke2 ini bertujuan untuk mengarahkan mahasiswa mampu menjelaskan konsep class, object, atribut dan method dalam Object Oriented Programing. kemudian Mahasiswa diharapkan mampu menerapkan accsess modifier dan enkapsulasi dalam pembuatan class, mahasiswa mampu mengimplementasikan class produk pertanian dengan atribut dan method yang sesuai, mampu mendemonstrasikan instansiasi object serta menampilkan data produk pertanian di console.

---

## Dasar Teori
Class adalah cetak biru (blueprint) untuk membangun objek — mendefinisikan atribut (data) dan method (perilaku) yang dimiliki suatu entitas dalam program.

Objek adalah hasil instansiasi dari class, sehingga memiliki data nyata dan bisa beroperasi sesuai perilaku yang sudah ditentukan oleh class.

Enkapsulasi melindungi data dengan membatasi akses menggunakan access modifier (private, public, protected) serta menyediakan akses aman melalui getter dan setter.

OOP membuat data lebih terstruktur, karena setiap entitas dibuat sebagai objek yang memiliki identitas, data, dan perilaku sendiri.

Dalam Agri-POS, produk seperti benih atau pupuk dibuat sebagai objek dengan atribut nama, harga, dan stok sehingga mudah dikelola (ditambah, dikurangi, diupdate) secara sistematis.

## Langkah Praktikum
1. Membuat Class Produk

Buat file Produk.java pada package model.
Tambahkan atribut: kode, nama, harga, dan stok.
Gunakan enkapsulasi dengan menjadikan atribut bersifat private dan membuat getter serta setter untuk masing-masing atribut.

2. Membuat Class CreditBy

Buat file CreditBy.java pada package util.
Isi class dengan method statis untuk menampilkan identitas mahasiswa di akhir output: credit by: <240202876> - <Nur Dini Handayani>.

3. Membuat Objek Produk dan Menampilkan Credit

Buat file MainProduk.java.
Instansiasi minimal tiga objek produk, misalnya "Benih Padi", "Pupuk Urea", dan satu produk alat pertanian.
Tampilkan informasi produk melalui method getter.
Panggil CreditBy.print("<NIM>", "<Nama>") di akhir main untuk menampilkan identitas.

4. Commit dan Push

Commit dengan pesan: week2-class-object.

## Kode Program

1. Produk.java
package com.upb.agripos.model;

public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }
}


2. CreditBy.Java
package com.upb.agripos.util;

public class CreditBy {
    public static void print(String nim, String nama) {
        System.out.println("\ncredit by: " + 240202876 + " - " + "Nur Dini Handayani");
    }
}

3. MainProduk.java
package com.upb.agripos;

import com.upb.agripos.model.Produk;
import com.upb.agripos.util.CreditBy;

public class MainProduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("BNH-001", "Benih Padi IR64", 25000, 100);
        Produk p2 = new Produk("PPK-101", "Pupuk Urea 50kg", 350000, 40);
        Produk p3 = new Produk("ALT-501", "Cangkul Baja", 90000, 15);

        System.out.println("Kode: " + p1.getKode() + ", Nama: " + p1.getNama() + ", Harga: " + p1.getHarga() + ", Stok: " + p1.getStok());
        System.out.println("Kode: " + p2.getKode() + ", Nama: " + p2.getNama() + ", Harga: " + p2.getHarga() + ", Stok: " + p2.getStok());
        System.out.println("Kode: " + p3.getKode() + ", Nama: " + p3.getNama() + ", Harga: " + p3.getHarga() + ", Stok: " + p3.getStok());

        // Tampilkan identitas mahasiswa
        CreditBy.print("<NIM>", "<Nama Mahasiswa>");
    }
}
## Hasil Eksekusi
Terlampir di Folder ScreenShoot

## Analisis
Kode Berjalan sesuai dengan apa yang di contohkan dalam modul 2 ini, namun dalam pengerjaan tugas kali ini saya mendapati kesulitan saat membuat folder di karenakan kurang fokus dan teliti.

## Kesimpulan
Konsep class dan object dalam OOP memungkinkan pengembangan aplikasi yang terstruktur dan mudah dikelola, karena setiap entitas seperti produk pertanian direpresentasikan sebagai objek dengan atribut dan perilaku sendiri. Melalui enkapsulasi, data penting seperti kode, nama, harga, dan stok dijaga keamanannya dengan access modifier dan diakses secara aman melalui getter dan setter. Penerapan class `Produk` dan `CreditBy` tidak hanya menunjukkan pengelolaan data yang rapi, tetapi juga mencerminkan modularitas program, sehingga mendukung pengembangan aplikasi Agri-POS yang lebih kompleks dan profesional di masa depan.


---

## Quiz

1. **Mengapa atribut sebaiknya dideklarasikan sebagai private dalam class?**
   Agar data tidak bisa diakses atau diubah sembarangan dari luar class, sehingga keamanan dan konsistensi data tetap terjaga.

2. **Apa fungsi getter dan setter dalam enkapsulasi?**
   Getter berfungsi untuk mengambil/membaca nilai atribut secara aman, sedangkan setter berfungsi untuk mengubah nilai atribut dengan kontrol atau validasi sesuai kebutuhan.

3. **Bagaimana cara class `Produk` mendukung pengembangan aplikasi POS yang lebih kompleks?**
   Class `Produk` menyediakan struktur data yang jelas dan modular untuk setiap produk, sehingga sistem dapat dengan mudah dikembangkan lebih lanjut seperti penambahan fitur transaksi, perhitungan total belanja, stok otomatis berkurang saat pembelian, dan integrasi ke database atau UI.
