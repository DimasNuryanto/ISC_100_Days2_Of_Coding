package harike2;

import java.util.Scanner;

public class day30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.println("Bilangan kelipatan 3 dari 1 hingga " + n + " adalah:");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
