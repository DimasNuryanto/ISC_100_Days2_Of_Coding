public class HitungLuasPersegi {
    public static int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        int panjangSisi = 4;

        int hasilLuas = hitungLuasPersegi(panjangSisi);

        System.out.println("Luas persegi dengan sisi " + panjangSisi + " adalah: " + hasilLuas);
    }
}
