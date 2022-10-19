package in;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*System.out.print("Ingresar una palabra: ");
        String linea = entrada.next();
        entrada.nextLine();  // captura cualquier otro token o tokens
        System.out.print("Ingresar otra palabra: ");
        String otraLinea = entrada.next();
        System.out.printf("Lo que se escribio es:%n1. %s%n2. %s%n", linea, otraLinea);*/

        System.out.print("Escriba un entero: ");
        System.out.println(entrada.hasNextInt());
        int entero = entrada.nextInt();

        System.out.print("Escriba un flotante: ");
        double doble = entrada.nextDouble();



        System.out.printf("La suma de ambos numeros es: %f", entero + doble);
    }
}

/*

    [in] -> [proceso] -> [out]
    Scanner
        - nextLine: captura una linea (ENTER)
        - next: captura un token (SPACE)

 */
