package herencia;

public class Empleado extends Persona {
    private String empresa;
    private String cargo;
    private double salario;

    public Empleado(String nombre, String cedula, String empresa, String cargo) {
        super(nombre, cedula);  // inicializa la parte heredada -> Persona

        // inicializar los atributos propios de Empleado
        this.empresa = empresa;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return String.format("%s trabaja en %s (%s)", getNombre(), empresa, cargo);
    }

    public double getSalario() {
        return 20_000;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
