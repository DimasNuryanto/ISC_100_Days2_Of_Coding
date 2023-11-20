package harike2;

import java.util.Scanner;

public class day43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" masukkan nilai: ");
        int nilai = sc.nextInt();
        int hasil = 0;

        for (int i = 1; i <= nilai; i++) {
            hasil += i;

            System.out.print(i);
            if (i < nilai) {
                System.out.print(" + ");

            }

        }
        System.out.println(" = " + hasil);
    }
}
