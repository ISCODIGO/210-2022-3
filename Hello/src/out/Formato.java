package out;

import static java.lang.System.*;

public class Formato {
    public static void main(String[] args) {
        // print -> sin salto de linea
        out.print("uno");
        out.print("dos");

        // println -> saltos de linea
        out.println("tres");
        out.println("cuatro");

        // printf -> formato
        int a = 3;
        int b = 4;
        out.println(a + " + " + b + " = " + (a + b));
        out.printf("%d + %d = %d", a, b, a + b);

        // rellenando espacios entre numeros
        out.printf("%n[%10d] - [%-15S]%n", 123, "hola mundo");
        out.println(Math.PI);
        out.printf("%.4f", Math.PI);
        out.printf("%n%4.2s", "hola mundo");
    }
}

/*

    %[bandera][tamano].[precision][tipo-de-dato]
    %d = entero
    %o = entero octal
    %x = entero hexadecimal
    %f = flotante
    %c = char
    %s = String
    %n = salto de linea

    %10d
 */