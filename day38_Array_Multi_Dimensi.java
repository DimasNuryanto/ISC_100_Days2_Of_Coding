package harike2;

public class day38 {

    public static void main(String[] args) {
        String[][] kelas = {
            {"Dhimas", "Heri", "Aji"},
            {"Linda", "Imma", "Nita"}
        };

        System.out.println("Daftar Siswa:");
        for (int kelasIndex = 0; kelasIndex < kelas.length; kelasIndex++) {
            System.out.println("Kelas " + (kelasIndex + 1) + ":");
            for (int siswaIndex = 0; siswaIndex < kelas[kelasIndex].length; siswaIndex++) {
                System.out.println("- " + kelas[kelasIndex][siswaIndex]);
            }
            System.out.println();
        }
    }
}
