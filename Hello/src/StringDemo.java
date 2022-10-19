public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hola";
        String s2 = s1;
        String s3 = new String("hola");

        System.out.println(s1 == s2);  // true
        System.out.println(s1 == s3);  // false

        System.out.println(s1.equals(s3));
        System.out.println(s1.charAt(1));

        System.out.println("hola" + "mundo");

        String s4 = "hola mundo";
        System.out.println(s4.contains("lax"));

        int n = 405;
        String str = String.valueOf(n);
        String str2 = "" + true;

        String str3 = "    345345     ";
        System.out.println("|" + str3 + "|");
        System.out.println("|" + str3.trim() + "|");
    }
}
