public class Bucles {
    public static void main(String[] args) {
        int val = 0;
        boolean bandera = true;

        // break -> saltar a un siguiente bloque (bucle/switch)
        // continue -> elude las instrucciones que esten debajo del continue (dentro del mismo bloque)
        // return -> salta fuera del bloque de la funcion

        while(val <= 10) {
            System.out.println(val++);
        }
        System.out.println("Fuera del bucle");
    }
}
