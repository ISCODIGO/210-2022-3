import java.util.Scanner;
import static java.lang.System.*;

public class EntradaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        out.print("Escriba un numero: ");
        int numero1 = entrada.nextInt();

        out.print("Escriba un segundo numero: ");
        int numero2 = entrada.nextInt();

        out.printf("%d + %d = %d", numero1, numero2, numero1 + numero2);
    }
}
