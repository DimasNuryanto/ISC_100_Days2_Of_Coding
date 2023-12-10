package contoh;
public class day63 {
    public static void main(String[] args) {
        String nama = "Dhimas Nuryanto";
        int umur = 19;
        double gaji = 100000; 

        System.out.printf("Nama: %s, Usia: %d, Gaji: %.2f\n", nama, umur, gaji);

        String a = String.format("Nama: %s, Usia: %d, Gaji: %.2f", nama, umur, gaji);
        System.out.println(a);

        String b = "Nama: " + nama + ", Usia: " + umur + ", Gaji: " + gaji;
        System.out.println(b);
    }
}
