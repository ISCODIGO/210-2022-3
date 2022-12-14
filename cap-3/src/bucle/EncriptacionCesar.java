package bucle;

import java.util.Scanner;

public class EncriptacionCesar {
    public static void main(String[] args) {
        final int LETRA_INICIAL = 'A';

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba una frase a cifrar: ");
        String frase = scanner.nextLine();
        System.out.print("Escriba la clave de cifrado (entero): ");
        int desplazamiento = scanner.nextInt();
        System.out.print("Dejar solo mayusculas? (S/N) -> ");
        char opcion = scanner.next().toUpperCase().charAt(0);

        int cierre;
        if (opcion == 'S') {
            cierre = 'Z' + 1;
        } else if (opcion == 'N'){
            cierre = 'z' + 1;
        } else {
            System.out.println("Opcion no valida");
            return;
        }
        // 1. obtener la frase [x]
        // 2. descomponer la frase en letras [x]
        // 3. desplazar cada letra (cifrado)

        for (int pos = 0; pos < frase.length(); pos++) {
            char letraOriginal = frase.charAt(pos);
            int valorCifrado = ((int)letraOriginal + desplazamiento) % (cierre);
            if (valorCifrado < LETRA_INICIAL) {
                valorCifrado += LETRA_INICIAL;
            }
            //System.out.println(letraOriginal+ " => " + valorCifrado);
            char letraCifrada = (char)valorCifrado;
            System.out.print(letraCifrada);
        }

        scanner.close();
    }
}
