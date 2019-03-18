import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

    // Atributos

    private Set<Empleado> listaEmpleados = new HashSet<Empleado>();
    private Set<Socio> listaSocio = new HashSet<Socio>();
    private Persona director = null;
    private Ayuntamiento ayuntamiento = null;
    private EntidadPublica entidadPublica = null;
    private Persona persona = null;

    // Constructores

    public Biblioteca() {
    }

    public Biblioteca(Ayuntamiento ayuntamiento, EntidadPublica entidadPublica, Persona director) {
        this.ayuntamiento = ayuntamiento;
        this.entidadPublica = entidadPublica;
        this.director = director;
    }

    // Setters

    public void setListaEmpleados(Set<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void setListaSocio(Set<Socio> listaSocio) {
        this.listaSocio = listaSocio;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public void setAyuntamiento(Ayuntamiento ayuntamiento) {
        this.ayuntamiento = ayuntamiento;
    }

    public void setEntidadPublica(EntidadPublica entidadPublica) {
        this.entidadPublica = entidadPublica;
    }

    // Getters

    public Set<Socio> getListaSocio() {
        return listaSocio;
    }

    public Set<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public Persona getDirector() {
        return director;
    }

    public Ayuntamiento getAyuntamiento() {
        return ayuntamiento;
    }

    public EntidadPublica getEntidadPublica() {
        return entidadPublica;
    }

    // Metodos

    public Empleado crearEmpleado() {
        return new Empleado(this, persona);
    }

    public Socio crearSocio() {
        return new Socio(this, persona);
    }

}
