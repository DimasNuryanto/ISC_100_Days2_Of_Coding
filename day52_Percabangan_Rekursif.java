package harike2;

import java.util.Scanner;

public class day52 {

    public static void recursiveBranch(int n) {
        if (n > 0) {
            System.out.println("Nilai n: " + n);

            recursiveBranch(n - 1);
            recursiveBranch(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int userValue = scanner.nextInt();

        System.out.println("percabangan Nilai n:");
        recursiveBranch(userValue);

    }
}
