import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

    // Atributos

    private Set<Personal> listaPersonal = new HashSet<Personal>();
    private Set<Miembro> listaMiembro = new HashSet<Miembro>();

    // Constructor

    private Biblioteca() {
    }

    // Setters

    public void setListaPersonal(Set<Personal> listaPersonal) {
        this.listaPersonal = listaPersonal;
    }

    public void setListaMiembro(Set<Miembro> listaMiembro) {
        this.listaMiembro = listaMiembro;
    }

    // Getters

    public Set<Miembro> getListaMiembro() {
        return listaMiembro;
    }

    public Set<Personal> getListaPersonal() {
        return listaPersonal;
    }
}
