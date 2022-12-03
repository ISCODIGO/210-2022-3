package funcion;

import java.util.Arrays;

public class FuncionDemo {

    static void func1(int x) {
        x *= 2;
        System.out.println("Dentro de func1: " + x);
    }

    static void func2(int[] a, int pos, int val) {
        a[pos] = val;
    }

    static void func3(String s) {
        s = "hola";
    }

    public static void main(String[] args) {
        int numero = 10;
        func1(numero);
        System.out.println(numero);  // 10

        int[] arreglo = {10, 20, 30, 40, 50};
        func2(arreglo, 0, 345);
        System.out.println(Arrays.toString(arreglo));

        String str = "adios";
        func3(str);
        System.out.println(str);  // adios
    }

}
