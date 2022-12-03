package herencia;

public class Cliente extends Persona {

    public Cliente(String nombre, String cedula) {
        super(nombre, cedula);
    }

    @Override
    public String toString() {
        return String.format("%s es un cliente", this.getNombre());
    }
}
