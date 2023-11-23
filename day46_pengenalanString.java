package harike2;

import java.util.Arrays;

public class day46 {

    public static void main(String[] args) {
        System.out.println("============================");
        String judul = "One Piece";
        System.out.println(judul);

        System.out.println("============================");
        char[] Judul = {'O', 'n', 'e', ' ', 'p', 'i', 'e', 'c', 'e'};
        System.out.print(Arrays.toString(Judul));
        System.out.println();

        System.out.println("============================");
        for (char karakter : Judul) {
            System.out.print(karakter + " ");
        }
        System.out.println();

        System.out.println("============================");
        char kataPertama = Judul[0];
        System.out.println("kata pertama: " + kataPertama);

        System.out.println("============================");
        Judul[4] = '*';
        for (char karakter : Judul) {
            System.out.print(karakter + " ");
        }
        System.out.println();
        System.out.println("============================");
    }
}
