package harike2;
import java.util.Scanner;
public class day4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = a.nextLine();

        System.out.print("Masukkan kelas Anda: ");
        String kelas = a.nextLine();

        System.out.print("Masukkan NIM Anda: ");
        String nim = a.nextLine();

        System.out.println("Terima kasih! Berikut adalah hasil inputan Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("NIM: " + nim);

        a.close();
}
}
