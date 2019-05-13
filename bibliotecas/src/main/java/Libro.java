public class Libro extends Ejemplar {

    // Atributos

    private String isdn = null;
    private Persona autor = null;

    // Constructores

    public Libro() {

    }

    public Libro(String isdn, Persona autor) {
        this.isdn = isdn;
        this.autor = autor;
    }

    // Setters

    public void setIsdn(String isdn) {
        this.isdn = isdn;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    // Getters

    public String getIsdn() {
        return isdn;
    }

    public Persona getAutor() {
        return autor;
    }
}
