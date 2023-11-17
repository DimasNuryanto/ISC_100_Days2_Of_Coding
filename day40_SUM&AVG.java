package harike2;

public class day40 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        double average;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
                count++;
            }
        }

        if (count != 0) {
            average = (double) sum / count;
            System.out.println("Jumlah bilangan: " + sum);
            System.out.println("Rata-rata bilangan: " + average);
        } else {
            System.out.println();
        }
    }
}
