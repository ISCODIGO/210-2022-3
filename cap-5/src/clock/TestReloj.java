package clock;

public class TestReloj {

    public static void main(String[] args) {
        Reloj r1 = new Reloj();  // horas=0 minutos=0 segundos=0
        Reloj r2 = new Reloj(8, 5, 0);  // horas=18 minutos=51 segundos=0

        // Todos los objetos de tipo clock.Reloj son mutables
        Reloj copia = r2;
        copia.setSegundos(45);
        System.out.println(r2);

        Reloj clon = new Reloj(copia);
        clon.setSegundos(34);

        System.out.println(copia);
        System.out.println(clon);

        //clock.Reloj.variableStatic = 10;

        copia.rebajarStatic();

        System.out.println(Reloj.variableStatic);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r2.compareTo(r2));

        Reloj rx = new Reloj(8, 5, 0);
        rx.incrementar1Seg();
        System.out.println(rx);

        rx = new Reloj(0, 59, 59);
        rx.incrementar1Seg();
        System.out.println(rx);

        rx = new Reloj(23, 59, 59);
        rx.incrementar1Seg();
        System.out.println(rx);

        Reloj ry = new Reloj(23, 59, 59);
        System.out.println(rx.equals(ry));
    }
}
