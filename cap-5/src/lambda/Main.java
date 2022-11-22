package lambda;

public class Main {
    public interface IntegerFunction {
        Integer run(int val);
    }

    public static void main(String[] args) {
        IntegerFunction cuadrado = (x) -> { return x * x;};
        System.out.println(cuadrado.run(10));
    }
}