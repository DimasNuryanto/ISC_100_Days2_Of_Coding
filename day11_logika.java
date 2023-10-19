package harike2;
import java.util.Scanner;
public class day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nilaiSuka = 1;
        int nilaiTebakan;
        boolean statusTebakan;
        
        System.out.println("Masukkan nilai tebakan saya :");
        nilaiTebakan = sc.nextInt();
        System.out.println("Nilai tebakan saya adalah :" + nilaiTebakan);
       
        statusTebakan = (nilaiTebakan == nilaiSuka);
        System.out.println("tebakan saya :" + statusTebakan);
        
        System.out.println("masukkan nilai diantara 2 dan 5");
        nilaiTebakan = sc.nextInt();
        
        statusTebakan =(nilaiTebakan > 2) && (nilaiTebakan < 5);
        
        System.out.println("tebakan saya :" + statusTebakan);
    }    
