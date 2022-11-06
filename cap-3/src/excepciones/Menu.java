/*

Menu con excepciones. En caso que se elija una opcion invalida se vuelva a repetir.

 */
package excepciones;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n---------------------------------------");
            System.out.println("MENU DE BANCO");
            System.out.println("Seleccione una opcion:");
            System.out.println("\t1.Consulta");
            System.out.println("\t2.Deposito");
            System.out.println("\t3.Retiro");
            System.out.println("\t4.Salir");

            try {
                opcion = scanner.nextInt();
                switch(opcion) {
                    case 1 -> System.out.println("ZONA DE CONSULTA");
                    case 2 -> System.out.println("ZONA DE DEPOSITO");
                    case 3 -> System.out.println("ZONA DE RETIRO");
                    case 4 -> {
                        System.out.println("Ha solicitado salir");
                        continuar = false;
                    }
                    default -> System.out.println("Opcion no disponible");
                }
            } catch(Exception e) {
                System.err.println("Opcion erronea. Vuelva a elegir un valor valido");
                scanner.nextLine();   // liberar la entrada para evitar bucle infinito
            }
        } while(continuar);
    }
}
