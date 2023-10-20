package harike2;
import java.util.Scanner;
public class day12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan pesanan kemeja Anda: ");
        int jumlahPesanan = scanner.nextInt();
        System.out.print("Masukkan kotak yang tersedia: ");
        int jumlahKotak = scanner.nextInt();

        int kemejaPerKotak = 1;
        int totalKotakTerisi = jumlahKotak - jumlahPesanan;
        int sisahKemeja = jumlahPesanan % totalKotakTerisi;

        System.out.println("Jumlah kotak yang terisi: " + totalKotakTerisi);
        System.out.println("Sisa kemeja yang belum terkemas: " + sisahKemeja);
    }
}
