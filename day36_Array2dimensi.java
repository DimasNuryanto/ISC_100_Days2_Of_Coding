package harike2;

import java.util.Scanner;

public class day36 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int Baris = a.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int Kolom = a.nextInt();
        int[][] array2D = new int[Baris][Kolom];
        int nilai = 1;
        for (int i = 0; i < Baris; i++) {
            for (int j = 0; j < Kolom; j++) {
                array2D[i][j] = nilai++;
            }
        }
        for (int i = 0; i < Baris; i++) {
            for (int j = 0; j < Kolom; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
