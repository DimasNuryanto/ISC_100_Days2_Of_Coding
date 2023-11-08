package harike2;

import java.util.Scanner;

public class day31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai yang anda mau: ");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}
