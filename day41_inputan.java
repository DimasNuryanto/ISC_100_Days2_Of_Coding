package harike2;

import java.util.Scanner;

public class day41 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print(" ");
        int a = sc.nextInt();

        int b = 0;

        for (int i = 1; i <= a; i++) {
            System.out.print("Inputan" + i + ": ");
            b += sc.nextInt();
        }

        int c = b / a;

        System.out.println("average : " + c);
        System.out.println("Sum: " + b);

        sc.close();
    }
}
