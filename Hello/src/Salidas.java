import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.ArrayList;

public class Salidas {
    public static void main(String[] args) {
        // Salidas en una sola linea
        out.print("[hola");
        out.print(" mundo]");

        // uso de String multilineas
        out.print("""
                
                esto es una
                nueva opcion en los
                String de Java.
                Permite imprimir tal cual
                esta escrito (saltos incluidos).
                
                """);

        // Salidas con un salto de linea
        out.println("primera linea");
        out.println("segunda linea");

        out.print(PI);
    }
}
