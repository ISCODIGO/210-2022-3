/*
Realizar un programa que permita simular N cantidad de lanzamientos de un dado
y establecer cuales son los resultados por cada lado.

Recordar: un dado tiene 6 lados numerados del 1 al 6.


 */

package arreglos;

import java.util.Arrays;

public class Dados {
    public static void main(String[] args) {
        int n;

        try {
            n = Integer.parseInt(args[0]);
        } catch(Exception e) {
            System.err.println(e.getMessage());
            n = 1000;  // valor predeterminado en caso de una Exception
        }

        System.out.printf("Se haran %d lanzamientos...%n", n);
        System.out.println("Estos fueron los resultados...");
        int[] dado = new int[7]; // solo ocuparemos las posiciones del 1 al 6

        // Bucle que genera los lanzamientos
        for (int i = 0; i < n; i++) {
            int lanzamiento = (int) (Math.random() * 6) + 1;  // 1 al 6
            //System.out.println(lanzamiento);
            dado[lanzamiento]++;
        }
        //System.out.println(Arrays.toString(dado));

        // Bucle para imprimir resultado
        int minimo = dado[1];
        int maximo = dado[1];
        int posMin = 1;
        int posMax = 1;

        for (int j = 1; j < dado.length; j++) {
            if (minimo > dado[j]) {
                minimo = dado[j];
                posMin = j;
            }

            if (maximo < dado[j]) {
                maximo = dado[j];
                posMax = j;
            }
            maximo = Math.max(maximo, dado[j]);
            System.out.printf("Lado %d -> %d%n", j, dado[j]);
        }
        System.out.printf("El mas repetido: %d y el menos repetido: %d", posMax, posMin);
    }
}
/*

Lado del dado       Posicion dentro del array
    1                   0
    2                   1

 */