import java.util.HashSet;
import java.util.Set;

public class Ayuntamiento {

    // Atributos

    private Set<Biblioteca> conjuntoBiblioteca = new HashSet<Biblioteca>();

    // Constructor

    public Ayuntamiento() {

    }

    public void setConjuntoBiblioteca(Set<Biblioteca> conjuntoBiblioteca) {
        this.conjuntoBiblioteca = conjuntoBiblioteca;
    }

    public Set<Biblioteca> getConjuntoBiblioteca() {
        return conjuntoBiblioteca;
    }
}
