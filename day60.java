package harike2;
import java.util.Scanner;
public class day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        String nama = sc.nextLine();

        int namapanjang = nama.length();
        System.out.println("hurufnya ada: " + namapanjang);

        System.out.print("huruf yang ingin di tampikan: ");
        int indeks = sc.nextInt();
        if (indeks >= 0 && indeks < namapanjang) {
            char karakter = nama.charAt(indeks);
            System.out.println("huruf nya " + indeks + ": " + karakter);
        } else {
            System.out.println("Indeks tidak valid");
        }
    }
}
