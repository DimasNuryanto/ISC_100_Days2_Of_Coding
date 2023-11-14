package harike2;

public class day37 {

    public static void main(String[] args) {
        int[] angka = {4, 7, 2, 9, 5};

        System.out.print("Isi array: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        System.out.println("Total: " + total);
    }
}
