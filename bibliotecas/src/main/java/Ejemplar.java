import java.util.HashSet;
import java.util.Set;

public class Ejemplar {

    // Atributos

    private Set<CopiaEjemplar> copias = new HashSet<CopiaEjemplar>();

    // Constructores

    public Ejemplar() {

    }

    // Setters

    public void setCopias(Set<CopiaEjemplar> copias) {
        this.copias = copias;
    }

    // Getters

    public Set<CopiaEjemplar> getCopias() {
        return copias;
    }

    // Metodos

    public void crearCopia() {
        new CopiaEjemplar();
    }
}
