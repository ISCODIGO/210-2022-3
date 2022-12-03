package herencia;

public class EmpleadoHora extends Empleado {
    private double precioHora;

    public EmpleadoHora(String nombre, String cedula, String empresa, String cargo) {
        super(nombre, cedula, empresa, cargo);
    }

    @Override
    public double getSalario() {
        return 10_000;
    }
}
