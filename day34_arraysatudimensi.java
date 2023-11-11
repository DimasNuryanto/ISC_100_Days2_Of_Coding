package harike2;

import java.util.Scanner;

public class day34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjangArray = sc.nextInt();

        int[] array = new int[panjangArray];

        System.out.println("Masukkan elemen-elemen array:");

        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Elemen-elemen array:");

        for (int i = 0; i < panjangArray; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
