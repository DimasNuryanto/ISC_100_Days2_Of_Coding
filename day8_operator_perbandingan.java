package harike2;
import java.util.Scanner;
public class day8 {
    public static void main(String[] args) {
        Scanner hasil = new Scanner(System.in);

        System.out.println("nilai A sama dengan B");
        System.out.println("masukkan nilai yang anda ingin kan si A  :");
        int a = hasil.nextInt();
        hasil.nextLine();
        System.out.println("masukkan nilai yang anda ingin kan si B  :");
        int b = hasil.nextInt();
        System.out.println("jawaban :" + (a == b));
        System.out.println("-------------------------------------------");
        
        System.out.println("nilai C tidak sama dengan D");
        System.out.println("masukkan nilai yang anda ingin kan si C  :");
        int c = hasil.nextInt();
        hasil.nextLine();
        System.out.println("masukkan nilai yang anda ingin kan si D  :");
        int d = hasil.nextInt();
        System.out.println("jawaban :" + (c != d));
        System.out.println("-------------------------------------------");
        
        System.out.println("nilai E lebih besar F");
        System.out.println("masukkan nilai yang anda ingin kan si E  :");
        int e = hasil.nextInt();
        hasil.nextLine();
        System.out.println("masukkan nilai yang anda ingin kan si F  :");
        int f = hasil.nextInt();
        System.out.println("jawaban :" + (e > f));
        System.out.println("-------------------------------------------");
        
        System.out.println("nilai G lebih kecil H");
        System.out.println("masukkan nilai yang anda ingin kan si G  :");
        int g = hasil.nextInt();
        hasil.nextLine();
        System.out.println("masukkan nilai yang anda ingin kan si H  :");
        int h = hasil.nextInt();
        System.out.println("jawaban :" + (g < h));
        System.out.println("-------------------------------------------");
        
    }
}
