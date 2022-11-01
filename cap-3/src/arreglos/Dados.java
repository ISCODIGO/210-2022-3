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
            n = 1000;  // valor predeterminado en caso de una Exception
        }

        System.out.printf("Se haran %d lanzamientos...%n", n);
        System.out.println("Estos fueron los resultados...");
        int[] dados = new int[7]; // solo ocuparemos las posiciones del 1 al 6
        for (int i = 0; i < n; i++) {
            int lanzamiento = (int) (Math.random() * 6) + 1;  // 1 al 6
            System.out.println(lanzamiento);
            dados[lanzamiento]++;
        }
        System.out.println(Arrays.toString(dados));
    }
}
