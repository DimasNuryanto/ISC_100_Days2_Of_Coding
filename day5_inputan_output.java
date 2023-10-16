package harike2;
import java.util.Scanner;
public class day5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan nama Anda            : ");
        String nama = a.nextLine();

        System.out.print("Masukkan kelas Anda           : ");
        String kelas = a.nextLine();

        System.out.print("Masukkan NIM Anda             : ");
        String nim = a.nextLine();
        
        System.out.println("Masukkan UMUR Anda          :");
        int umur = a.nextInt();
        a.nextLine();
        
        System.out.println("masukkan jenis kelamin Anda :");
        String jenis = a.nextLine();

        System.out.println("masukkan status keaktifan   :");
        Boolean aktif = a.nextBoolean();

        System.out.println("------------------------------------------------");
        System.out.println("Terima kasih! Berikut adalah hasil inputan Anda:");
        System.out.println("Nama          : " + nama);
        System.out.println("Kelas         : " + kelas);
        System.out.println("NIM           : " + nim);
        System.out.println("UMUR          : " + umur);
        System.out.println("JENIS KELAMIN : " + jenis);
        System.out.println("AKTIF         : " + aktif);
        System.out.println("------------------------------------------------");

        a.close();
    }
