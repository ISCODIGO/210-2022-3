package bucle;

public class Main {
    public static void main(String[] args) {
        // mostrar los numeros pares del 1 al 14
        int inicial = Integer.parseInt(args[0]);  // impar
        int terminal = Integer.parseInt(args[1]);
        int numero = inicial - 1;

        while(numero <= terminal) {
            numero++;
            if (numero % 2 == 1) {
                break;
            }
            System.out.println(numero);
        }
    }
}

/*
    A. Cero iteraciones
    B. No hay problema
    C. "Infinitas" iteraciones



 */