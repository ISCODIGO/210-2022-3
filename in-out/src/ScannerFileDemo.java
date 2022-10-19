import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class ScannerFileDemo {
    public static final String RUTA_ARCHIVO = "/home/xyz/data.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner entrada = new Scanner(new FileReader(RUTA_ARCHIVO));
        //entrada.useDelimiter(".");
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        int z = entrada.nextInt();

        System.out.println(x + y + z);
        entrada.close();
    }
}
