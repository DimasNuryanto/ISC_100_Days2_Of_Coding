package contoh;
public class day61 {
    public static void main(String[] args) {
        
        StringBuilder strBuilder = new StringBuilder();
      
        strBuilder.append("Dhimas ");
        strBuilder.append("Nuryanto.");

        System.out.println("Hasil akhir: " + strBuilder.toString());

        strBuilder.setCharAt(7, 'Y');
        System.out.println("Setelah mengubah: " + strBuilder.toString());
      
        strBuilder.insert(7, " ");

        System.out.println("Setelah memasukkan spasi: " + strBuilder.toString());
    }
}
