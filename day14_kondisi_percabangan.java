package harike2;
import java.util.Scanner;
public class day14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        System.out.println("nilai terbatas 50");
        
        System.out.print("Masukkan nilai yang Anda inginkan: ");
        int nilai = sc.nextInt();
        
        int terbatas = 50;
        if (nilai > 50){    
            System.out.println("nilai lebih besar dari 50");
        }else {
            System.out.println("nilai lebih kecil dari 50");
        }        
    }            
}
