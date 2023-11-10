package harike2;

public class day33 {

    public static void main(String[] args) {
        int[][] angka = {{1, 2, 3, 4, 5,}, {6, 7, 8, 9, 10}};

        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j] + " ");
            }
            System.out.println();
        }
    }
}
