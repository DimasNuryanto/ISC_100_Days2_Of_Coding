package harike2;

public class day57 {

    public static void main(String[] args) {
        String teks = "Dhimas Nuryanto";

        int panjangString = teks.length();
        System.out.println("Panjang string: " + panjangString);

        char karakterPertama = teks.charAt(0);
        System.out.println("Karakter pertama: " + karakterPertama);

        String substring = teks.substring(7, 13);
        System.out.println("Substring: " + substring);

        String tambahan = " Sangat Ganteng";
        String gabungan = teks.concat(tambahan);
        System.out.println("Gabungan string: " + gabungan);

        String gantiString = teks.replace('a', 'o');
        System.out.println("Setelah penggantian: " + gantiString);

        String lowerCase = teks.toLowerCase();
        String upperCase = teks.toUpperCase();
        System.out.println("Huruf kecil: " + lowerCase);
        System.out.println("Huruf besar: " + upperCase);

        String teksDenganSpasi = "   Contoh string dengan spasi   ";
        String tanpaSpasi = teksDenganSpasi.trim();
        System.out.println("Tanpa spasi: '" + tanpaSpasi + "'");
    }
}
