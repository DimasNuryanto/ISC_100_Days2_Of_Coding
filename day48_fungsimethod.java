public class PenjumlahanBilangan {
    public static void main(String[] args) {
        int bilangan1 = 25;
        int bilangan2 = 17;

        int hasilPenjumlahan = penjumlahanDuaBilangan(bilangan1, bilangan2);

        System.out.println("Hasil penjumlahan dari " + bilangan1 + " dan " + bilangan2 + " adalah: " + hasilPenjumlahan);
    }

    public static int penjumlahanDuaBilangan(int angka1, int angka2) {
        int hasil = angka1 + angka2;
        return hasil;
    }
}
