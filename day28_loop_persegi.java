package harike2;

import java.util.Scanner;

public class day28 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int besar_persegi, i, j;

        System.out.print("Input besar persegi: ");
        besar_persegi = input.nextInt();

        System.out.println();

        for (i = 1; i <= besar_persegi; i++) {
            for (j = 1; j <= besar_persegi; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
