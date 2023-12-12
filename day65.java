package harike2;

public class day65 {
    public static void main(String[] args) {
        try {
            
            someMethod(10, 0);
        } catch (ArithmeticException e) {
            
            System.out.println(e.getMessage());
        }
    }

    public static void someMethod(int a, int b) throws ArithmeticException {
        if (b == 0) {
            
            throw new ArithmeticException("Tidak bisa melakukan pembagian dengan nol");
        }

        int result = a / b;
        System.out.println("Hasil pembagian: " + result);
    }
}
