package bucle;

public class ForAnidado {
    public static void main(String[] args) {
        int n = 5;

        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *


         */

        for (int i = 1; i <= n; i++) {
            // superior
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();

            // inferior
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        for(int i = 1; i <= n + 1; i++) {
            // Espacios
            for (int k = n - i; k >= 0; k--) {
                System.out.print("  ");
            }

            // Asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }


        /*

        12345678*                        4*2
        123456*123*                      3*2
        1234*123*123*                    2*2
        12*                              1*2
        *                                0*2




         */
    }
}
/*

*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

1   2   3   4   5   6   7
1   2   3   4   5   6   7
2   4   6   8   10  12  14
3   6   9   12  15  18  21
4
5
6
7
8

 */
