package harike2;
public class day18 {
    public static void main(String[] args) {
        int umur = 20;
        boolean mahasusah = true;

        if (umur >= 18) {
            System.out.println("Saya adalah dewasa.");

            if (mahasusah) {
                System.out.println("Saya adalah mahasiswa");
            } else {
                System.out.println("Saya bukan mahasiswa");
            }
        } else {
            System.out.println("Saya masih anak-anak.");
        }
    }

}
