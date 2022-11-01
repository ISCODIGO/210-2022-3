/*
Arreglos c++, c#, java
- Tamano fijo (la estructura no puede crecer ni recudirse en ejecucion)
- Permite almacenar elementos homogeneos -> del mismo tipo.

Valores predeterminados:
0 -> byte, short, int, long
0.0 -> float, double
false -> boolean
'' -> char
null -> objetos

String son inmutables -> no puedo modificar los caracteres individuales del String
Arreglos son mutables


 */
package arreglos;

public class ArreglosDemo {
    public static void main(String[] args) {
        // declaracion
        int[] enteros; // <-
        float flotantes[];

        // inicializacion
        enteros = new int[10];  // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        flotantes = new float[]{3.4f, 5.6f, 7.8f};

        // mutabilidad
        enteros[0] = 10;  // [10, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        //System.out.println(enteros.length);

        // lectura y escritura de los elementos dentro del arreglo
        for(int i = 0; i < enteros.length; i++) {
            enteros[i] = i * 10;
        }

        for(int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
        }

        // intentar modificar el arreglo desde un foreach (no se puede)
        for(int elemento : enteros) {
            elemento /= 2;
        }

        // lectura de los elementos del arreglo
        int suma = 0;
        for(int elemento : enteros) {
            suma += elemento;
        }
        System.out.println("Suma del arreglo: " + suma);
    }
}
