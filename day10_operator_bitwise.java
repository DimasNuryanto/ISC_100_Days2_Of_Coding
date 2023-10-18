package harike2;
public class day10 {
    public static void main(String[] args) {
        int a = 1; 
        int b = 3; 
        
        // AND 
        int hasiland = a & b; 
        System.out.println("jawaban dari a & b: " + hasiland);

        // OR 
        int hasilOr = a | b;
        System.out.println("jawaban dari a | b: " + hasilOr);

        // XOR 
        int hasilXor = a ^ b;
        System.out.println("jawaban dari a ^ b: " + hasilXor);

        // NOT 
        int hasilNotA = ~a;
        System.out.println("jawaban dari ~a: " + hasilNotA);

        // Left 
        int left = a << 2;
        System.out.println("jawaban dari a << 5: " + left);

        // Right 
        int right= a >> 2;
        System.out.println("jawaban dari a >> 5: " + right);
    }
}
