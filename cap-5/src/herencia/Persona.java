package herencia;

public class Persona {
    private String nombre;
    private String cedula;  // si no se ocupa operaciones numericas (aritmeticas) debe ser String

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", nombre, cedula);
    }
}
