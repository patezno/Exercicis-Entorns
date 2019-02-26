import java.util.HashMap;
import java.util.Map;

public class CopiaLibro extends CopiaEjemplar {

    // Atributos

    private Map<String, Integer> listaLibros = new HashMap<String, Integer>();

    // Constructor

    public CopiaLibro() {
    }

    // Setters

    public void setListaLibros(Map<String, Integer> listaLibros) {
        this.listaLibros = listaLibros;
    }

    // Getters

    public Map<String, Integer> getListaLibros() {
        return listaLibros;
    }
}
