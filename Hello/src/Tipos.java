/*
            Tipos de datos:
            1. primitivos (8)
            2. objetos/referencias (* -> libreria estandar / terceros / definidos por el usuario)

            Primitivos:
                - booleanos
                    boolean -> 1 bit   [1]
                - enteros
                    byte    -> 8 bits  [0] [0] [0] [0] [0] [0] [1] [1] 2^8 = 256, 128 neg. y 128 pos (0 incluido)
                               MAX=127 -> 2^7 - 1
                               MIN=-128 -> -2^7

                    short   -> 16 bits -> 2^16 ~65k
                               MAX= 2^15 - 1
                               MIN= -2^15

                    *int     -> 32 bits

                    long    -> 64 bits

                    char    -> 16 bits -> UNICODE
                - flotantes
                    float   -> 32 bits    |---|---|---|---|---|---|---|---|---|---|---|
                                          0                                           1

                    *double  -> 64 bits    |-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|
                                          0                                           1


        */
public class Tipos {
    public static void main(String[] args) {
        boolean b1;  // declaracion
        boolean b2 = true;  // declaracion e inicializacion

        int entero = 10;
        byte octeto = 127;

        octeto += 100;
        System.out.println(octeto);

        byte octeto2 = -128;
        octeto2--;
        System.out.println(octeto2);

        float flotante = 3.14F;

        long largo = 4_000_000_000L;
    }
}
