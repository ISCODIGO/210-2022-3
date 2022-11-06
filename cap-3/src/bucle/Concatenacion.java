package bucle;

public class Concatenacion {
    public static void main(String[] args) {
        String s = "hola";
        int n = 1000000;

        /*for (int i = 0; i < n; i++) {
            s += "hola";
        }*/

        // String mutable?
        StringBuilder builder = new StringBuilder("hola");
        for (int i = 0; i < n; i++) {
            builder.append("hola");
        }
        System.out.println(builder.toString().length());
    }
}
