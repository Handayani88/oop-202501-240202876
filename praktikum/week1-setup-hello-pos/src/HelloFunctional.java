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
