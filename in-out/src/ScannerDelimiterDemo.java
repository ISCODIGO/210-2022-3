import java.util.Scanner;


public class ScannerDelimiterDemo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner("hola.uno.dos");
        entrada.useDelimiter("\\.");
        System.out.println(entrada.next());
        System.out.println(entrada.next());
        System.out.println(entrada.next());

        entrada.close();
    }
}

// hola.uno.dos -> h / la.un / .d / s