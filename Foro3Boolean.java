public class Foro3Boolean {
    public static void main(String[] args) {
        String str1 = "Hola";
        String str2 = "Hola";
        String str3 = "Hola Mundo";

        boolean resultado1 = str1.equals(str2);
        boolean resultado2 = str1.equals(str3);

        System.out.println(resultado1); // esto imprimirá 'true'
        System.out.println(resultado2); // esto imprimirá 'false'
    }
}
