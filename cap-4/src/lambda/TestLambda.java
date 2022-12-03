/*

Se establecen 2 interfaces para realizar pruebas con expresiones lambda. Esto
debido a que la interfaz para este tipo de expresiones queda limitado a tener
como maximo una funcion.

Imprimible tiene una funcion imprimir que no tiene argumentos y no tiene
retorno.

Calculable tiene dos parametros double y tiene un retorno double.

 */
package lambda;

public class TestLambda {

    public static void main(String[] args) {
        Imprimible miPrintLn = () -> {
            System.out.println("hola mundo");
        };

        Imprimible miPrint = () -> {
            System.out.print("usando print");
        };

        Imprimible x = () -> {
            int w = 10;
            int y = 11;
            System.out.println(w + y);
        };

        // Esta es la expresion lambda basica
        Calculable multiplicar = (double v1, double v2) -> {
            return v1 * v2;
        };

        // Se puede omitir el tipo de los argumentos
        Calculable sumar = (v1, v2) -> {
            return v1 + v2;
        };

        // Si el cuerpo es de una sola linea y lleva un return no es
        // necesario colocarlo ni que lleven llaves
        Calculable dividir = (v1, v2) -> v1 / v2;

        Saludo saludo = (s) -> {
            System.out.println(s);
        };

        Saludo saludo1 = s -> {
            System.out.println("Hola " + s);
        };

        // Implementacion de las funciones
        miPrintLn.imprimir();
        miPrint.imprimir();
        x.imprimir();
        System.out.println(multiplicar.calcular(3, 4));
        System.out.println(sumar.calcular(5, 6));
        System.out.println(dividir.calcular(10, 3));
        saludo.saludar("Programacion II");
        saludo1.saludar("Programacion II");
    }
}
