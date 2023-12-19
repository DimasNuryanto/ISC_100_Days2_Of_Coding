package harike2;
import java.io.*;

public class day72 {
    public static void main(String[] args) {
        String sourceFile = "sourceFile.txt";
        String destinationFile = "destinationFile.txt";

        try {

            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));

            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destinationFile));

            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("Konten dari " + sourceFile + " berhasil disalin ke " + destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
