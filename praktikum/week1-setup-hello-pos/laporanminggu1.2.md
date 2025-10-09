LAPORAN PRAKTIKUM MINGGU 1 
PARADIGMA PEMROGRAMAN (PROSEDURAL, OOP, DAN FUNGSIONAL)










Disusun oleh :
Nama		: Nur Dini Handayani
Kelas 		: 3IKRB
NIM		: 240202876






UNIVERSITAS PUTRA BANGSA 
TAHUN AJARAN 2025/2026
KEBUMEN
 
A.	TUJUAN 
Praktikum ini bertujuan agar mahasiswa dapat memahami perbedaan antara paradigma pemrograman prosedural, OOP dan fungsional melalui implementasi pemrograman sederhana. Selain itu, mahasiswa diharapkan dapat mengidentifikasi kelebihan dan kekurangan dari setiap paradigma yang digunakan dalam praktikum ini.
B.	DASAR TEORI
1.	Paradigma prosedural adalah pendekatan pemrograman yang menggunakan urutan langkah-langkah (prosedur atau fungsi) untuk menyelesaikan suatu permasalahan yang di berikan.
2.	Paradigma OOP (Object Oriented Programming) berfokus pada konsep objek yang memiliki atribut (data) dan metode yang di jalankan. OOP memudahkan pengelolaan program besar karena bersifat modular, sedangkan paradigma prosedural lebih cocok untuk program kecil.
3.	Paradigma Fungsional menggunakan pure function dan menghindari perubahan state untuk menghasilkan output. Paradigma function menawarkan efisiensi dan ekspresitivitas tinggi dalam penulisan Syntax.
C.	LANGKAH PRAKTIKUM
1.	Buka aplikasi VS Code dan membuat 3 File java:
Helloworld2.java
HelloOOP2.java
HelloFunctional2.java

2.	Tuliskan Kode untuk masing masing paradigma sesuai dengan isntruksi yang diberikan dosen.
a.	Prosedural
##Helloworld
public class Helloworld2 {
    public static void main(String[] args) {
        printMessage();
    }
    static void printMessage() {
        System.err.println("Hello World, I am Nur Dini Handayani - 240202876");
    }
}
##Prosedural dengan int 
public class HelloProcedural {
    public static void main(String[] args) {
      String nim = "240202876";
      String nama = "Nur Dini Handayani";
      String[] produk = {"Beras", "Pupuk", "Benih"};
      int[] harga = {10000, 15000, 12000};
      int total = 0;
      System.out.println("Hello POS World");
      System.out.println("NIM: " + nim + ", Nama: " + nama);
      System.out.println("Daftar Produk:");
      for (int i = 0; i < produk.length; i++) {
         System.out.println("- " + produk[i] + ": " + harga[i]);
         total += harga[i];
      }
      System.out.println("Total harga semua produk: " + total);
   }
}




a.	OOP
##HelloOOP
class Greeter {
    private String name;
    private String nim;

    public Greeter(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public void sayHello() {
        System.out.println("Hello World, I am " + name + " - " + nim);
    }
}

public class HelloOOP2 {
    public static void main(String[] args) {
        Greeter dini = new Greeter("NUR DINI HANDAYANI", "240202876");
        dini.sayHello();
    }
}

##OOP Sistem Agri
// HelloOOP.java
class Produk {
   String nama;
   int harga;
   Produk(String nama, int harga) {
      this.nama = nama;
      this.harga = harga;
   }
}

public class HelloOOP {
   public static void main(String[] args) {
      String nim = "240202876";
      String namaMhs = "Nur Dini Handayani";
      Produk[] daftar = {
         new Produk("DRAGBAR", 100000),
         new Produk("BIDAI", 150000),
         new Produk("ALAT PP", 120000)
      };
      int total = 0;
      System.out.println("Hello POS World");
      System.out.println("NIM: " + nim + ", Nama: " + namaMhs);
      System.out.println("Daftar Produk:");
      for (Produk p : daftar) {
         System.out.println("- " + p.nama + ": " + p.harga);
         total += p.harga;
      }
      System.out.println("Total harga semua produk: " + total);
   }
}

b.	Function

##HelloFunciton
import java.util.function.BiConsumer;
public class HelloFunctional2 {
    public static void main(String[] args) {
        BiConsumer<String, String> sayHello = (name, nim) ->
            System.err.println("Hello World, I am "+ name + "-"+nim);
        sayHello.accept("Nur Dini Handayani","240202876");
    }
}

## HelloFunction Agri
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class HelloFunctional {
    public static void main(String[] args) {
      String nim = "240202876";
      String nama = "Nur Dini Handayani";
      List<String> produk = Arrays.asList("TANDU", "DRAGBAR", "ALATPP");
      List<Integer> harga = Arrays.asList(10000, 15000, 12000);
      System.out.println("Hello POSKO");
      System.out.println("NIM: " + nim + ", Nama: " + nama);
      System.out.println("Daftar Produk:");
      IntStream.range(0, produk.size())
         .forEach(i -> System.out.println("- " + produk.get(i) + ": " + harga.get(i)));
      int total = harga.stream().mapToInt(Integer::intValue).sum();
      System.out.println("Total harga semua produk: " + total);
   }
}

3.	Kemudian lakukan eksekusi pada setiap file java menggunakan Terminal atau IDE 
4.	Lalu cek hasil output 

D.	KODE PROGRAM 
-	Kode Program Prosedural 
public class Helloworld2 {
    public static void main(String[] args) {
        printMessage();
    }
    static void printMessage() {
        System.err.println("Hello World, I am Nur Dini Handayani - 240202876");
    }
}

-	Kode Program OOP
class Greeter {
    private String name;
    private String nim;

    public Greeter(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public void sayHello() {
        System.out.println("Hello World, I am " + name + " - " + nim);
    }
}

public class HelloOOP2 {
    public static void main(String[] args) {
        Greeter dini = new Greeter("NUR DINI HANDAYANI", "240202876");
        dini.sayHello();
    }
}

-	Kode Program Function
import java.util.function.BiConsumer;
public class HelloFunctional2 {
    public static void main(String[] args) {
        BiConsumer<String, String> sayHello = (name, nim) ->
            System.err.println("Hello World, I am "+ name + "-"+nim);
        sayHello.accept("Nur Dini Handayani","240202876");
    }
}


E.	HASIL EKSEKUSI 













Hasil Kode Program Prosedural











 

Hasil Kode Program OOP

 

Hasil Kode Program Function


F.	ANALISIS
1.	 Ketiga paradigma menghasilkan output yang sama, tetapi cara implementasinya berbeda.
2.	Paradigma prosedural menggunakan fungsi sederhana dan lebih cocok untuk tugas dasar.
3.	Paradigma OOP membungkus data dan perilaku dalam satu objek (Greeter), membuat kode lebih terstruktur dan mudah dikembangkan.
4.	Paradigma fungsional menggunakan lambda expression, menekankan pada ekspresi dan fungsi murni.
5.	Perbedaan utama: tingkat modularitas dan abstraksi. OOP dan fungsional lebih modern dan efisien untuk program kompleks dibanding prosedural.
6.	Kendala memahami syntax lambda di paradigma fungsional awalnya membingungkan, tetapi bisa di atasi dengan membaca dokumentasi java function API

G.	KESIMPULAN 
Dalam praktikum ini, mahasiswa berhasil memahami dan menerapkan tiga paradigma pemrograman dasar pada Java.
Setiap paradigma memiliki karakteristik tersendiri:
1.	Prosedural mudah dan cepat untuk program kecil,
2.	OOP cocok untuk program kompleks dan mudah dipelihara,
3.	Fungsional menawarkan efisiensi dan ekspresi singkat.
Pemahaman perbedaan paradigma ini menjadi dasar penting untuk pemrograman lanjutan di minggu berikutnya.

H.	QUIZ
1.	Apakah OOP selalu lebih baik dari prosedural? 
2.	Kapan functional programming lebih cocok digunakandibanding OOP atau prosedural? 
3.	Bagaimana paradigma (prosedural, OOP, fungsional) memengaruhi maintainability dan scalability aplikasi? 
4.	Mengapa OOP lebih cocok untuk mengembangkan aplikasi POS dibanding prosedural? 
5.	Bagaimana paradigma fungsional dapat membantu mengurangi kode berulang (boilerplate code)?

Jawaban Quiz
1.	Tidak selalu, Paradigma OOP memang lebih unggul untuk program yang besar dan kompleks karena memudahkan pengaturan struktur kode dengan konsep class dan objek. Namun, untuk program kecil atau sederhana, pendekatan prosedural sering lebih efisien dan sepat di buat karena tidak membutuhkan banyak struktur tambahan. Jadi pilihan terbaik tergantung skala dan kebutuhan program 
2.	Paradigma fungsional lebih cocok digunakan ketika program berfokus pada pengolahan data, perhitungan matematis, atau tugas yang bisa di jalankan secara pararel. Pendekatan ini membuat kode lebih singkat, mudah di uji, dan bebas dari efek samping karena setiap fungsi berdiri sendiri. Contohnya sering digunakan dalam analisis data atau aplikasi yang membutuhkan efisiensi tinggi dalam pengolahan informasi.
3.	Setiap paradigma mempengaruhi kemudahan perawatan dan pengembangan aplikasi. Pendekatan prosedural cenderung sulit di kelola jika program menjadi besar karena logika sering bercampur disatu tempat. OOP lebih mudah dipelihara karena terstruktur dengan baik dan mendukung pengembangan fitur baru tanpa merusak bagian lain. Paradigma fungsional juga mendukung maintainbility karena fungsi-fungsinya independen, serta mudah diperluas terutama untuk aplikasi yang berjalan secara pararel atau membutuhkan efisiensi tinggi.
4.	OOP Lebih cocok digunakan untuk aplikasi POS karena sistem ini memiliki banyak komponen seperti produk, transaksi, dan kasir yang bisa direpresentasikan sebagai objek. Dengan OOP, setiap komponen bisa dibuat dalam bentuk class yang memiliki atribut dan fungsi sendiri, sehingga program lebih terorganisir dan mudah dikembangkan. Jika ada perubahan pada satu bagian, bagian lain tidak perlu ikut diubah, sehingga pemeliharaan aplikasi menjadi lebih mudah 
5.	Paradigma fungsional mengurangi kode berulang dengan memanfaatkan fungsi murni, lambda expression, dan konsep higher-order function. Dengan cara ini satu fungsi bisa digunakan berkali-kali tanpa melulis ulang logika yang sama. Hasilnya, kode menjadi lebih singkat, bersih dan mudah dibaca. Selain itu, pendekatan ini juga membantu menghadiri kesalahan karena setiap fungsi hanya fokus pada satu tugas tertentu.
