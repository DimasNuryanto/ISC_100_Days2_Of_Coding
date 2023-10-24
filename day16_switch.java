package harike2;
import java.util.Scanner;
public class day16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor absen (1-5): ");
        int no_absen = scanner.nextInt();

        String nama_manusia;

        switch (no_absen) {
            case 1:
                nama_manusia = "ASEP";
                break;
            case 2:
                nama_manusia = "KACO";
                break;
            case 3:
                nama_manusia = "CICCI";
                break;
            case 4:
                nama_manusia = "BECCE";
                break;
            case 5:
                nama_manusia = "BASO";
                break;
            default:
                nama_manusia = "Nama tidak temasuk";
                break;
        }

        System.out.println("Nama yang dipanggil: " + nama_manusia);
    }
}
