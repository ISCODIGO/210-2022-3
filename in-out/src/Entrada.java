import java.util.Scanner;
import static java.lang.System.*;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        out.println("Escriba una palabra: ");
        String palabra = entrada.next();
        out.printf("Escribio la palabra: %s%n", palabra);

        // podria limpiar un posible token o tokens no esperados con nextLine
        entrada.nextLine();

        out.println("Escriba otra palabra: ");
        String segundaPalabra = entrada.next();
        out.printf("La otra palabra es: %s%n", segundaPalabra);
    }
}
