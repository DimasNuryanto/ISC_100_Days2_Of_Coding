package harike2;

import java.util.Scanner;

public class day24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaTeman = "";
        System.out.println("Ketik 'selesai' untuk mengakhiri program.");
        System.out.println("----------------------------------------------------");
        while (!namaTeman.toLowerCase().equals("selesai")) {
            System.out.print("Masukkan nama teman: ");
            namaTeman = scanner.nextLine();
            if (!namaTeman.toLowerCase().equals("selesai")) {
                System.out.println("Hai, " + namaTeman + "!");
            }
        }
        System.out.println("Sampai jumpa!");
    }
}
