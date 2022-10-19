public class Wrappers {
    public static void main(String[] args) {
        // 8 primitivos / * objetos (datos, funciones)
        // String inmutable

        int numero = 10;
        String cadena = "hola mundo";
        cadena = "xyz";  // no se modifica internamente, se sustituye  el valor
        System.out.println(cadena.toUpperCase());

        // Wrappers
        /*
        boolean -> Boolean
        float -> Float
        int -> Integer
        char -> Character
         */

        System.out.println("Max value int -> " + Integer.MAX_VALUE);
        System.out.println("Size -> " + Integer.SIZE);

        String s1 = "123";
        int n1 = Integer.parseInt(s1);
        float f1 = Float.parseFloat(s1);

        Float objetoFloat = f1;


        Integer objeto = Integer.valueOf(s1);
        int n2 = objeto;  // n2 -> int, objeto -> Integer
        System.out.println(n1);

        Integer objetoInt = n2;

        int n3 = Integer.decode("010");  // 010 octal
        System.out.println(n3);

        int n4 = Integer.decode("0x10");  // 10 hex
        System.out.println(n4);


        float fx = 3.1234567890123456f;
        System.out.println(fx);

        double dx = 3.1234567890123456;
        System.out.println(dx);



    }
}
// 3.14444444444444
// 3.14444444444444