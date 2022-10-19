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
