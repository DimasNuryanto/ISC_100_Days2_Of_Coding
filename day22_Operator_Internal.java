package harike2;
import java.util.Scanner;
public class day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int angka = sc.nextInt();
        int hasil = (angka % 2 != 0) ? angka + 1 : angka + 2;

        String jenisBilangan = (hasil % 2 == 0) ? "genap" : "ganjil";

        System.out.println(hasil + " bilangan " + jenisBilangan);
        sc.close();
    }
}
