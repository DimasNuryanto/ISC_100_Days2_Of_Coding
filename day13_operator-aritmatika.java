package harike2;
import java.util.Scanner;
public class day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan pesanan laptop Anda: ");
        int jumlahPesanan = sc.nextInt();
        
        System.out.println("Stok laptop 10");
        int StokLaptop = 10;
        int total = StokLaptop - jumlahPesanan;
        
        System.out.println("Jumlah kotak yang terisi: " + total);
        
    }   
}
