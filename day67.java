package harike2;

import java.io.FileInputStream;
import java.io.IOException;

public class day67 {

    public static void main(String[] args) throws IOException {
        FileInputStream sc = new FileInputStream("C:\\Users\\Acer_\\OneDrive\\Documents\\NetBeansProjects\\dhimas\\src\\harike2\\input.txt");
        
        System.out.println((char) sc.read());
        System.out.println((char) sc.read());
        System.out.println((char) sc.read());
        System.out.println((char) sc.read());
        System.out.println((char) sc.read());
        System.out.println((char) sc.read());
        
        sc.close();
    }
}
