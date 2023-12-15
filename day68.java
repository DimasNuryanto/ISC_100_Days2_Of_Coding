package harike2;

public class day68 {
    public static void main(String[] args) {
        // Pengenalan String
        String kata = "Halo, Saya adalah dhimas";

        // Operasi pada String
        System.out.println("Panjang kata: " + kata.length());
        System.out.println("Huruf ke-7 dari kata: " + kata.charAt(8));

        // Format String
        String nama = "dhimas Nuryanto";
        int umur = 19;
        double tinggi = 175.5;
        String formatString = String.format("Nama: %s, Umur: %d, Tinggi: %.2f", nama, umur, tinggi);
        System.out.println("Format string: " + formatString);
    }
}
