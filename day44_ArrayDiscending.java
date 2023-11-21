package harike2;

import java.util.Arrays;

public class day44 {

    public static void main(String[] args) {
        //1.
        double[] data = {4, 3.1, 9, 0.1, 4.2, 2, 1, 7, 9};
        Arrays.sort(data);
        System.out.println("Descending: ");
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.println(data[i]);

        }
        System.out.println();
    }

}
