package multivariadica;

public class Main {
    public static int sumar(int... valores) {
        int total = 0;
        for(int valor : valores) {
            total += valor;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(sumar(1));
        System.out.println(sumar(1, 2));
        System.out.println(sumar(1, 2, 3));
        System.out.println(sumar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
