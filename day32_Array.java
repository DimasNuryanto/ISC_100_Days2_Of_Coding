package harike2;

public class day32 {

    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 5, 6, 7};
        int maksimum = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > maksimum) {
                maksimum = angka[i];
            }
        }

        System.out.println("Nilai maksimum dalam array: " + maksimum);
    }
}
