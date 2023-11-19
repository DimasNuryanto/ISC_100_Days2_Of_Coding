package harike2;
import java.util.Random;
import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("jumlah: ");
        int jumlah = sc.nextInt();
        System.out.print("matriks1 3d: ");
        int matriks1 = sc.nextInt();
        System.out.print("matriks2 3d: ");
        int matriks2 = sc.nextInt();
        System.out.print("matriks3 3d: ");
        int matriks3 = sc.nextInt();

        int[][][][] array4D = new int[jumlah][matriks1][matriks2][matriks3];

        Random e = new Random();
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < matriks1; j++) {
                for (int k = 0; k < matriks2; k++) {
                    for (int l = 0; l < matriks3; l++) {
                        array4D[i][j][k][l] = e.nextInt(50);
                    }
                }
            }
        }

        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < matriks1; j++) {
                for (int k = 0; k < matriks2; k++) {
                    for (int l = 0; l < matriks3; l++) {
                        System.out.print(array4D[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
