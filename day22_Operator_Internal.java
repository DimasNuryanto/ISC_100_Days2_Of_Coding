package harike2;
import java.util.Scanner;
public class day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("bila hasilnya ganjil akan bertambah angka 1 ");
        System.out.println("bila hasilnya genap akan bertambah  angka 2 ");

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        int hasil = (angka % 2 != 0) ? angka + 1 : angka + 2;

        String jenisBilangan = (hasil % 2 == 0) ? "genap" : "ganjil";

        System.out.println("Hasilnya adalah: " + hasil);
        System.out.println("merupakan bilangan " + jenisBilangan);
        sc.close();
    }
}
