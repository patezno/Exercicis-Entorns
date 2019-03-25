import java.util.HashSet;
import java.util.Set;

public class Ayuntamiento extends EntidadPublica {

    // Atributos

    private Set<Biblioteca> conjuntoBiblioteca = new HashSet<Biblioteca>();
    private Persona alcalde = null;
    private EntidadPublica entidadPublica = null;
    private Persona director = null;

    // Constructores

    public Ayuntamiento() {
    }

    public Ayuntamiento(EntidadPublica entidadPublica, Persona alcalde) {
        this.alcalde = alcalde;
        this.entidadPublica = entidadPublica;
    }

    // Setters

    public void setConjuntoBiblioteca(Set<Biblioteca> conjuntoBiblioteca) {
        this.conjuntoBiblioteca = conjuntoBiblioteca;
    }

    public void setAlcalde(Persona alcalde) {
        this.alcalde = alcalde;
    }

    public void setEntidadPublica(EntidadPublica entidadPublica) {
        this.entidadPublica = entidadPublica;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    // Getters

    public Set<Biblioteca> getConjuntoBiblioteca() {
        return conjuntoBiblioteca;
    }

    public Persona getAlcalde() {
        return alcalde;
    }

    public EntidadPublica getEntidadPublica() {
        return entidadPublica;
    }

    public Persona getDirector() {
        return director;
    }

    // Metodos

    public void crearBiblioteca() {
        new Biblioteca(this, entidadPublica, director);
    }

    public void mostrarBiblioteca() {

    }

    public void crearLibro() {
        new Libro();
    }

    public void crearRevista() {
        new Revista();
    }

    public void comprarLibro(Libro libro) {

    }

    public void comprarRevista(Revista revista) {

    }
}
