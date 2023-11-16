package harike2;
import java.util.Scanner;

public class day39_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.print("[");

        if (input % 2 == 0) {
            
            int[] arrayGenap = new int[input];
            for (int i = 0; i < arrayGenap.length; i++) {
                arrayGenap[i] = (i + 1) * 2;
                
            }

            for (int num : arrayGenap) {
                System.out.print(num + " ");  
            }
        } else {
            
            int[] arrayGanjil = new int[input];
            for (int i = 0; i < arrayGanjil.length; i++) {
                arrayGanjil[i] = i * 2 + 1;
            }
 
            for (int num : arrayGanjil) {
                System.out.print(num + " ");
           
            }
        }
           System.out.print("]");
    }
}
