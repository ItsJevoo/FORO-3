public class Foro3Compare {
    public static void main(String[] args) {
        String str1 = "manzana";
        String str2 = "banana";
        String str3 = "manzana";
        String str4 = "manzanilla";

        int resultado1 = str1.compareTo(str2);
        int resultado2 = str1.compareTo(str3);
        int resultado3 = str1.compareTo(str4);

        System.out.println(resultado1); // esto imprimirá un número negativo
        System.out.println(resultado2); // esto imprimirá '0'
        System.out.println(resultado3); // esto imprimirá un número positivo
    }
}
