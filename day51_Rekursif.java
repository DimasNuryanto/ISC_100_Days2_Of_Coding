package contoh;
public class day51 {
    public static int hitungJumlahDeret(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + hitungJumlahDeret(n - 1);
        }
    }

    public static void main(String[] args) {
        int bilangan = 5; 
        int hasilJumlahDeret = hitungJumlahDeret(bilangan);
        System.out.println("Jumlah deret bilangan asli dari 1 sampai " + bilangan + " adalah: " + hasilJumlahDeret);
    }
}
