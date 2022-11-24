package lambda;

public class Producto {
    // atributos
    String codigo;
    String nombre;
    double precio;
    boolean tieneISV;

    public static void main(String[] args) {
        int a = 100;

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

        Calculable multiplicar = (v1, v2) -> v1 * v2;
        Calculable sumar = (v1, v2) -> v1 + v2;
        Calculable dividir = (v1, v2) -> v1 / v2;
        miPrintLn.imprimir();
        miPrint.imprimir();
        x.imprimir();
        System.out.println(multiplicar.calcular(3, 4));
        System.out.println(sumar.calcular(5, 6));
        System.out.println(dividir.calcular(10, 3));

    }
}
