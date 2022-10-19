/*

    Dado un valor entero N. Si N es par: N/2; si N es impar entonces 3N + 1

 */
package bucle;

import java.util.Scanner;

public class Problema3N {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor de N: ");
        int n = entrada.nextInt();
        int contador = 0;


        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println("Resultado es :" + n);
        }

        entrada.close();
    }
}
