package contoh;

import java.util.Scanner;

public class livecoding1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tentukan nilai: ");
        int b = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= b; i++) {
            System.out.println(i + " ");
            sum += i;
        }
        

        double avg = (double) sum / b;

        System.out.println("Hasil nya: " + sum);
        System.out.println("Rata-rata nya: " + avg);
    }
}
