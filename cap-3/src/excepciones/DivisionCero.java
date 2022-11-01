/*
    Bloque try: 1 Bloque de codigo que puede potencialmente fallar (excepcion).
    Bloque catch: 1 o varios bloques de codigo para gestionar la excepcion. Este se ejecuta si
    una excepcion es generada.

 */

package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Elegir primer valor: ");
            int x = scanner.nextInt();
            System.out.print("Elegir segundo valor: ");
            int y = scanner.nextInt();
            if (y != 0) {
                System.out.println(x / y);
            }
        } catch(ArithmeticException e1) {
            System.out.println("Operacion no valida");
        } catch(InputMismatchException e2) {
            System.out.println("Uno de los dos valores no es un numero");
        } catch (Exception e3) {
            System.out.println("Ocurrio una excepcion desconocida");
        }

        System.out.println("FIN DEL PROGRAMA");
    }
}
