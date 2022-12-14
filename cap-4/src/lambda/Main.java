package lambda;

public class Main {
    public interface IntegerFunction {
        int run(int val);
    }

    public static void main(String[] args) {
        IntegerFunction cuadrado = x -> x * x;
        System.out.println(cuadrado.run(10));
    }
}