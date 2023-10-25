package harike2;
import java.util.Scanner;
public class day17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jam (24 jam): ");
        int jam = scanner.nextInt();

        if (jam >= 5 && jam <= 10) {
            System.out.println("pagi.");
        } else if (jam >= 11 && jam <= 13) {
            System.out.println("siang.");
        } else if (jam >= 14 && jam <= 18) {
            System.out.println("sore.");
        } else if (jam >= 19 && jam <= 24) {
            System.out.println("malam.");
        } else if (jam >= 1 && jam <= 4) {
            System.out.println("hari.");
        } else {
            System.out.println("jam tidak valid.");
        }
    }
}
