package bucle;

import java.io.Console;
import java.util.Scanner;

public class Login {
    static final String USUARIO_DEMO = "admin";
    static final String CLAVE_DEMO = "1234";
    static final int INTENTOS = 3;

    public static String login(Scanner scan, String usuario, String clave) {
        System.out.print("Escriba su usuario: ");
        usuario = scan.nextLine();
        //usuario = consola.readLine();
        System.out.print("Escriba la clave: ");
        clave = scan.nextLine();
        //clave = new String(consola.readPassword());

        if (usuario.trim().equals(USUARIO_DEMO)
                && clave.trim().equals(CLAVE_DEMO)) {
            return usuario;
        }

        return null;
    }

    public static void main(String[] args) {
        String usuario = "";
        String clave = "";
        String resultado;
        int contador = 0;
        //Console consola = System.console();
        Scanner scan = new Scanner(System.in);

        do {
            resultado = login(scan, usuario, clave);

            if (resultado == null) {
                System.out.println("Credenciales han fallado");
                contador++;
                System.out.printf("Tiene %d de %d intentos", contador, INTENTOS);
            } else {
                System.out.printf("""
        ************************************
        * Bienvenido: %-20s *
        ************************************
        """, resultado);
            }
        } while (resultado == null && contador < INTENTOS);
        scan.close();
    }
}
