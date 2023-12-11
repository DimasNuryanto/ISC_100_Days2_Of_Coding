package harike2;

public class day64 {
    public static void main(String[] args) {
        String greeting = "Hello Dhimas"; 
        System.out.println("Pengenalan String:");
        System.out.println("Nilai dari greeting: " + greeting);
        System.out.println("Panjang String greeting: " + greeting.length());
        System.out.println("Karakter pada indeks ke-7: " + greeting.charAt(7));
        System.out.println("Mengganti 'Dhimas' dengan 'Nuryanto': " + greeting.replace("Dhimas", "Nuryanto"));
        System.out.println();

        String nama = "Dhimas Nuryanto";
        int umur = 19;
        double tinggi = 171.0;

        String biodata = String.format("Nama: %s, Umur: %d, Tinggi: %.2fcm", nama, umur, tinggi);
        System.out.println("Data baru:");
        System.out.println(biodata);
    }
}
