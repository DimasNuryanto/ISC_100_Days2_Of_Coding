package contoh;
import java.util.Scanner;
public class day54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor absen (1-7): ");
        int no = scanner.nextInt();

        String nama_hari;

        switch (no) {
            case 1:
                nama_harj = "senin";
                break;
            case 2:
                nama_hari = "selasa";
                break;
            case 3:
                nama_hari = "rabut";
                break;
            case 4:
                nama_hari = "kamis";
                break;
            case 5:
                nama_hari = "jum'at";
                break;
            case 6;
                nama_hari = "sabtu";
                break;
            case 7;
                nama_hari = "minggu";
                break;
            default:
                nama_hari = "Nama tidak temasuk";
                break;
        }

        System.out.println("Hari: " + nama_hari);
    }
}
