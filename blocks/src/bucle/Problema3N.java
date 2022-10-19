/*

Dado un valor entero N. Si N es par: N/2; si N es impar entonces 3N + 1
Si generamos una secuencia de numeros bajo esta logica se genera una
secuencia infinita, repititiva a partir de que el valor sea 1.
Por ejemplo si se inicia con N=3, la secuencia sera:
3, 10, 5, 16, 8, , 4, 2, 1, 4, 2, 1, ...

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
