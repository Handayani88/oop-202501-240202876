# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: [Tuliskan judul topik, misalnya "Class dan Object"]

## Identitas
- Nama  : Nur Dini Handayani
- NIM   : 240202876
- Kelas : 3IKRB

---

## Tujuan
ujuan praktikum ini adalah agar mahasiswa mampu menerapkan konsep inheritance dalam OOP dengan membuat class induk dan class turunan, menggunakan super, dan membuktikan bahwa subclass dapat mewarisi atribut serta method dari superclass.

---

## Dasar Teori
Inheritance (pewarisan) adalah konsep dalam OOP yang memungkinkan suatu class anak (subclass) mewarisi atribut dan method dari class induk (superclass).

Tujuan utama inheritance adalah untuk menghindari duplikasi kode dan mendukung code reusability, sehingga kode lebih efisien dan mudah dikelola.

Subclass dapat menambahkan atribut atau method baru, serta dapat mengubah perilaku superclass menggunakan @Override.

Keyword super digunakan untuk memanggil constructor atau method dari superclass.

Inheritance menciptakan struktur hierarkis class, yang membuat program lebih modular dan mudah dikembangkan.

---

## Langkah Praktikum
Membuat class Produk sebagai superclass yang menyimpan atribut umum seperti kode, nama, harga, dan stok.

Membuat tiga subclass yaitu Benih, Pupuk, dan AlatPertanian yang mewarisi class Produk menggunakan keyword extends.

Menambahkan atribut khusus pada setiap subclass, seperti varietas untuk Benih, jenis untuk Pupuk, dan material untuk AlatPertanian.

Menggunakan keyword super untuk memanggil constructor dari superclass (Produk) di dalam masing-masing subclass.

Menambahkan method deskripsi() pada superclass dan melakukan @Override di setiap subclass agar informasi produk tampil lebih spesifik.

Membuat class MainInheritance.java untuk menginstansiasi objek dari tiap subclass dan menampilkan hasilnya menggunakan method deskripsi().

Memanggil class CreditBy untuk menampilkan identitas mahasiswa di akhir output program.

Melakukan screenshot hasil eksekusi program sebagai bukti keberhasilan praktikum.

Commit dan push project ke GitHub dengan nama folder week3-inheritance.

---

## Kode Program
1. Produk.Java
package com.upb.agripos.model;

public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    // Constructor
    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter dan Setter
    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    // Method tambahan (sesuai tugas modul)
    public void tambahStok(int jumlah) {
        this.stok += jumlah;  // menambah stok
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;  // mengurangi stok jika cukup
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }
}

3. Benih.java

package com.upb.agripos.model;

public class Benih extends Produk {
    private String varietas;

    public Benih(String kode, String nama, double harga, int stok, String varietas) {
        super(kode, nama, harga, stok);
        this.varietas = varietas;
    }

    public String getVarietas() { return varietas; }
    public void setVarietas(String varietas) { this.varietas = varietas; }
    
}

3. Pupuk.java

package com.upb.agripos.model;

public class Pupuk extends Produk {
    private String jenis;

    public Pupuk(String kode, String nama, double harga, int stok, String jenis) {
        super(kode, nama, harga, stok);
        this.jenis = jenis;
    }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }
}

4. Alatpertanian.java

package com.upb.agripos.model;

public class AlatPertanian extends Produk {
    private String material;

    public AlatPertanian(String kode, String nama, double harga, int stok, String material) {
        super(kode, nama, harga, stok);
        this.material = material;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
}

5. Creditby.java

package com.upb.agripos.util;

public class CreditBy {
    public static void print(String nim, String nama) {
        System.out.println("\ncredit by: " + 240202876 + " - " + "Nur Dini Handayani");
    }
}

6.Mainheritance.java
package com.upb.agripos;

import com.upb.agripos.model.*;
import com.upb.agripos.util.CreditBy;

public class MainInheritance {
    public static void main(String[] args) {
        Benih b = new Benih("BNH-001", "Benih Padi IR64", 25000, 100, "IR64");
        Pupuk p = new Pupuk("PPK-101", "Pupuk Urea", 350000, 40, "Urea");
        AlatPertanian a = new AlatPertanian("ALT-501", "Cangkul Baja", 90000, 15, "Baja");

        System.out.println("Benih: " + b.getNama() + " Varietas: " + b.getVarietas());
        System.out.println("Pupuk: " + p.getNama() + " Jenis: " + p.getJenis());
        System.out.println("Alat Pertanian: " + a.getNama() + " Material: " + a.getMaterial());

        CreditBy.print("<240202876>", "<Nur Dini Handayani>");
    }
}



## Hasil Eksekusi
Terlampir dalam folder Screenshoot

## Analisis
(
- Program ini berjalan dimulai dari class MainInheritance, di mana saya membuat objek dari tiga subclass yaitu Benih, Pupuk, dan AlatPertanian. Masing-masing subclass mewarisi atribut umum dari class Produk, seperti nama dan harga, melalui konsep inheritance. Setelah objek dibuat, program menampilkan informasi melalui method deskripsi() yang sudah dioverride di setiap subclass agar hasilnya sesuai dengan jenis produknya. Di akhir, program juga menampilkan identitas saya menggunakan class CreditBy.

Perbedaan utama dengan minggu sebelumnya adalah minggu ini menggunakan inheritance, jadi atribut umum tidak perlu ditulis ulang di tiap class. Minggu sebelumnya setiap class berdiri sendiri, sehingga lebih banyak pengulangan kode. Dengan inheritance, program jadi lebih rapi, efisien, dan mudah dikembangkan.

Kendala yang sempat saya temui adalah error karena method deskripsi() belum dibuat di subclass dan error struktur folder tidak sesuai dengan package. Setelah menambahkan override method dan memastikan file berada di folder yang benar, program bisa berjalan normal tanpa error. 
)
---

## Kesimpulan
Konsep inheritance berhasil diterapkan untuk membuat program yang lebih efisien dengan cara mewariskan atribut dari class Produk ke subclass seperti Benih, Pupuk, dan AlatPertanian. Dengan pendekatan ini, kode menjadi lebih rapi, tidak duplikatif, dan mudah untuk dikembangkan.

---

## Quiz
1. Apa keuntungan menggunakan inheritance dibanding membuat class terpisah tanpa hubungan?
Jawaban: Inheritance menghindari duplikasi kode karena atribut dan method umum cukup ditulis satu kali di superclass. Program menjadi lebih efisien, rapi, dan mudah dikembangkan. 

2. Bagaimana cara subclass memanggil konstruktor superclass?
Jawaban: Dengan menggunakan keyword super(...) di dalam constructor subclass, dan harus ditempatkan sebagai baris pertama.
3. Berikan contoh kasus di POS pertanian selain Benih, Pupuk, dan Alat Pertanian yang bisa dijadikan subclass.
Jawaban: Contohnya Pestisida, Bibit Buah, Obat Tanaman, atau Peralatan Irigasi dapat dijadikan subclass dari Produk karena masih termasuk kategori produk pertanian.
