package harike2;

import java.util.Scanner;

public class day49 {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int panjangSisi = sc.nextInt();

        int luas = hitungLuasPersegi(panjangSisi);
        System.out.println("Luas persegi: " + luas);

        gambarPersegi(panjangSisi);
    }

    private static int hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }

    private static void gambarPersegi(int sisi) {
        System.out.println("Gambar persegi:");

        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
