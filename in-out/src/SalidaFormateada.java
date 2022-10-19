import static java.lang.Math.*;
import static java.lang.System.*;

public class SalidaFormateada {
    public static void main(String[] args) {
        // Formato de flotante
        out.println("El valor de PI es: " + PI + " y el de Euler es " + E);

        // 2 cifras decimales
        out.printf("El valor de PI con 2 cifras decimales es: %.2f y el de euler es %.2f%n",
                PI, E);

        // enteros
        out.printf("El año actual es %d y el mes es %d%n", 2022, 10);

        // rellenar la salida con espacio
        out.printf("%10d %10d", 1, 10001);  // rellenar con 10 caracteres

        // Para rellenar espacio hacia la derecha
        out.printf("%nDerecha -> |%-10d| Izquierda -> |%10d|", 123, 123);

        // Se puede probar con un String
        out.printf("%n[%-10.6S]", "Hola mundo");
    }
}
