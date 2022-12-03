package herencia;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Persona p = new Persona("Maria Sol", "4432");
        //System.out.println(p);

        Empleado e = new Empleado("Roberto Luna", "245453", "UNAH", "Contador");
        //System.out.println(e);

        Cliente c = new Cliente("Alfonso Cuaron", "23432");
        //System.out.println(c);

        Persona[] personas = new Persona[3];
        personas[0] = p;
        personas[1] = e;
        personas[2] = c;

        System.out.println(Arrays.toString(personas));


    }
}
