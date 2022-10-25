package bucle;

public class ForDemo {
    public static void main(String[] args) {
        // for (inicializacion; condicion-continuacion; actualizacion)

        // Imprimir los numeros pares que hay entre 1 y 10
        int i = 2;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }

        for (int k = 2; k <= 10; k += 2) {
            System.out.println(k);
        }

        String s = "hola mundo";
        for (int pos = 0; pos < s.length(); pos++) {
            System.out.println(s.charAt(pos));
        }

        for(char letra: s.toCharArray()) {
            System.out.println(letra);
        }

    }

}
