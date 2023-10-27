package harike2;
import java.util.Scanner;
public class day19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih menu makanan (1-3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("1. Ayam Goreng");
                break;
            case 2:
                System.out.println("2.Nasi Goreng");
                break;
            case 3:
                System.out.println("3.Bebek Goreng");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
