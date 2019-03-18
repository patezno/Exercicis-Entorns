public class Socio extends Persona {

    // Atributos

    private Persona empleado = null;
    private Biblioteca biblioteca = null;

    // Constructores

    public Socio() {
    }

    public Socio(Biblioteca biblioteca, Persona empleado) {
        this.biblioteca = biblioteca;
        this.empleado = empleado;
    }

    // Setters

    public void setEmpleado(Persona empleado) {
        this.empleado = empleado;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    // Getters

    public Persona getEmpleado() {
        return empleado;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
}
