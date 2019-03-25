public class Libro extends Ejemplar {

    // Atributos

    private String isdn = null;

    // Constructores

    public Libro() {

    }

    public Libro(String isdn) {
        this.isdn = isdn;
    }

    // Setters

    public void setIsdn(String isdn) {
        this.isdn = isdn;
    }

    // Getters

    public String getIsdn() {
        return isdn;
    }
}
