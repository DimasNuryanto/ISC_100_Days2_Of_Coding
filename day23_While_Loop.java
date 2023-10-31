package harike2;
import java.util.Scanner;
public class day23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        int totalGenap = 0;
        int count = 1;
        while (count <= n) {
            if (count % 2 == 0) {
                totalGenap += count;
            }
            count++;
        }
        System.out.println("Jumlah bilangan genap dari 1 hingga " + n + " adalah " + totalGenap);
    }
}
