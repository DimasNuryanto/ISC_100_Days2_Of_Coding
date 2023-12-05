package contoh;
public class day58{
    public static void main(String[] args) {
        
        char[] inichar= {'D', 'H', 'I', 'M', 'A', 'S'};
        System.out.println("Array karakter:");
        System.out.println(inichar);

        
        String inistring = "DHIMAS";
        System.out.println("String:");
        System.out.println(inistring);

        
        inichar[0] = 'G';
        System.out.println("char setelah di ubah:");
        System.out.println(inichar);

        
        inistring= "G" + inistring.substring(1);
        System.out.println("String setelah diubah:");
        System.out.println(inistring);
    }
}
