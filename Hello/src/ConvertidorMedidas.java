import java.util.Scanner;

public class ConvertidorMedidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final float CENTIMETROS_POR_PULGADA = 2.54f;

        System.out.print("""
                Convertidor de medidas
                ----------------------
                Coloque el valor en cms -> plg: """);
        float cms = entrada.nextFloat();
        float plgs = cms / CENTIMETROS_POR_PULGADA;
        System.out.printf(" Son %.2f plgs", plgs);
    }
}
