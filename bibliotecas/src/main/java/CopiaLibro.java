import java.util.HashMap;
import java.util.Map;

public class CopiaLibro extends CopiaEjemplar {

    // Atributos

    private Map<Libro, Integer> listaLibros = new HashMap<Libro, Integer>();

    // Constructor

    public CopiaLibro() {
    }

    // Setters

    public void setListaLibros(Map<Libro, Integer> listaLibros) {
        this.listaLibros = listaLibros;
    }

    // Getters

    public Map<Libro, Integer> getListaLibros() {
        return listaLibros;
    }
}
