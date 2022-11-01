package decision;

import java.util.Scanner;

/*
DOMINGO = 0
LUNES = 1
SABADO = 6
 */
enum Dias {
    DOMINGO, LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO
}

public class Semana {
    // 0-Domingo, 1-Lunes, 2-Martes, ..., 6-Sabado
    public static void main(String[] args) {
        Dias d = Dias.JUEVES;
        System.out.println(d);  // JUEVES
        System.out.println(d.ordinal());  // 4
        System.out.println(d == Dias.SABADO);  // false
        System.out.println(d == Dias.JUEVES);  // true

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un numero [0-6]: ");
        int valorDia = scanner.nextInt();
        Dias diaSeleccionado;

        switch (valorDia) {
            case 0 -> diaSeleccionado = Dias.DOMINGO;
            case 1 -> diaSeleccionado = Dias.LUNES;
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            default -> System.out.println("Valor no configurado");
        }
    }
}
