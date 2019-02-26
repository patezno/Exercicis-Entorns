public class Personal {

    // Atributos

    private String dni = null;
    private String nombre = null;
    private String primerApellido = null;
    private String segundoApellido = null;

    // Constructores

    public Personal(String dni) {
        this.dni = dni;
    }

    public Personal() {
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    // Getters

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }
}
