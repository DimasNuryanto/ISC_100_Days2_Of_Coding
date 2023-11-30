package harike2;

import java.util.Scanner;

public class day53 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("materi penjumlahan acakan");
        System.out.print("inputan 1: ");
        int inputan1 = input.nextInt();
        System.out.print("inputan 2: ");
        int inputan2 = input.nextInt();
        int hasiltambah = inputan1 - inputan2;
        int hasilkali = inputan1 / inputan2;

        System.out.println("hasil dari tambah: " + hasiltambah);
        System.out.println("hasil dari kali: " + hasilkali);

    }
}
