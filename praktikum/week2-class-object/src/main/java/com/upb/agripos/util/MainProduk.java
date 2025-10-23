package com.upb.agripos.util;

import com.upb.agripos.model.Produk;

public class MainProduk {
    public static void main(String[] args) {
        // Instansiasi objek produk
        Produk p1 = new Produk("BNH-001", "Benih Padi IR64", 25000, 100);
        Produk p2 = new Produk("PPK-101", "Pupuk Urea 50kg", 350000, 40);
        Produk p3 = new Produk("ALT-501", "Cangkul Baja", 90000, 15);

        // Contoh penggunaan method tambahStok dan kurangiStok
        p1.tambahStok(20);   // stok awal 100 → jadi 120
        p2.kurangiStok(10);  // stok awal 40 → jadi 30

        // Tampilkan data produk
        System.out.println("Kode: " + p1.getKode() + ", Nama: " + p1.getNama() + ", Harga: " + p1.getHarga() + ", Stok: " + p1.getStok());
        System.out.println("Kode: " + p2.getKode() + ", Nama: " + p2.getNama() + ", Harga: " + p2.getHarga() + ", Stok: " + p2.getStok());
        System.out.println("Kode: " + p3.getKode() + ", Nama: " + p3.getNama() + ", Harga: " + p3.getHarga() + ", Stok: " + p3.getStok());

        // Tampilkan identitas mahasiswa
        CreditBy.print("240202876", "Nur Dini Handayani");
    }
}
