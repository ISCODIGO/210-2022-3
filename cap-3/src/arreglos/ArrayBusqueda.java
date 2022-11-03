package arreglos;

import java.util.Arrays;

public class ArrayBusqueda {
    /*
        Busca dentro del array a el valor x.
        Return: la posicion de x. -1 si no lo encuentra

     */
    public static int LinearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] datos = new int[] {
                3, 4, 1, 67, 24, 52, 10, 2, 4, 7, 9
        };

        int pos = LinearSearch(datos, 100);
        System.out.println(pos);

        // esta ordenando el array
        Arrays.sort(datos);
        System.out.println(Arrays.toString(datos));
        System.out.println(Arrays.binarySearch(datos, 100));
    }
}
