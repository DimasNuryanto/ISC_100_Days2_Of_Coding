package harike2;
import java.util.Scanner;
public class day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int[][] matrix1 = new int[baris][kolom];
        int[][] matrix2 = new int[baris][kolom];
        int[][] sum = new int[baris][kolom];

        System.out.println("nilai a: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("nilai b: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Hasil penjumlahan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
