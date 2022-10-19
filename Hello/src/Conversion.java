public class Conversion {
    public static void main(String[] args) {
        byte b = 10;
        // conversion implicita / widening
        int i = b;  // int -> 32bits / byte -> 8 bits
        short s = b;
        long lo = b;

        // conversion explicita / narrowing / casting
        int i2 = 100;
        byte b2 = (byte) i2;
        System.out.println(b2);

        float f2 = 3.45f;
        int i3 = (int) f2;
        System.out.println(i3);


        long lo2 = 23423432;  // 64 bits
        float f3 = lo2; // 32 bits
    }
}
