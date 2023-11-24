package harike2;

import java.util.Scanner;

public class day47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];

        System.out.println("Array 2:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan nilai untuk array2D[" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Array 2:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}
