import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LoginDemo {
    public static final String ARCHIVO = "data/login.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inArchivo = new Scanner(new FileReader(ARCHIVO));
        Scanner inTeclado = new Scanner(System.in);

        /*System.out.println("Escriba su usuario: ");
        String usuario = inTeclado.next();
        System.out.println("Escriba su password: ");
        String password = inTeclado.next();*/

        System.out.println(inArchivo.next());

        inArchivo.close();
        inTeclado.close();

    }
}
