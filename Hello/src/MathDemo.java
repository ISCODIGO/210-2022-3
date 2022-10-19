public class MathDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 34;
        int c = 2;

        int m1 = Math.max(a, b);
        int m2 = Math.max(m1, c);
        System.out.println(m2);

        int m3 = Math.max(Math.max(a, b), c);
        System.out.println(m3);

        int nRandom = (int) (Math.random() * 100 + 1);
        System.out.println("Random -> " + nRandom);

        int resultado  = (int) Math.pow(2, 16);
        System.out.println(resultado);

        float float1 = 3.0F;
        double direction = 4;
        System.out.println(Math.nextAfter(float1, direction));

        double direction2 = 2.0;
        System.out.println(Math.nextAfter(float1, direction2));
    }
}

// (0.0, 1.0] * 10 -> (0.0, 10]
// (0.0, 1.0] * 100 -> (0.0, 100]
// (0.0, 1.0] * 100 + 1 -> (1.0, 101]

// ------------|-------------|-------------|--------------------------|
//            2.9999998      3.0           3.0000002                 4.0