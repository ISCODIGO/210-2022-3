/*

La diferencia mas notable entre un while y un do-while es sobre la evaluacion
de la condicion: en el while sea hace antes del primer ciclo y en el do-while
ocurre al final de cada ciclo.

Es permite que el do-while se ejecute al menos
un ciclo antes que la condicion pueda impedirselo. Esto puede ser util para
capturar valores que se usaran en la misma condicion

 */
package bucle;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("MENU");
        int valor;

        do {
            System.out.print("1. Avanza\n2. Retrocede\nOtro valor detiene el programa: ");
            valor = scan.nextInt();

            if (valor == 1) {
                System.out.println("Jugador avanza una posicion");
            } else if (valor == 2){
                System.out.println("Jugador retrocede una posicion");
            } else {
                System.out.println("Juego terminado");
            }
        } while(valor == 1 || valor == 2);



        scan.close();
    }
}
