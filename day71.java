package harike2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day71 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan nama Anda: ");
            String nama = reader.readLine();

            System.out.print("Masukkan umur Anda: ");
            int umur = Integer.parseInt(reader.readLine());

            System.out.println("\nNama: " + nama);
            System.out.println("Umur: " + umur);

            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading from user input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Masukkan umur dengan format angka yang benar.");
        }
    }
}
