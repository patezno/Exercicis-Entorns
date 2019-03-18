public class EntidadPublica {

    // Atributos

    private int codiEntidad = 0;
    private String nombreEntidad = null;
    private String direccion = null;

    // Constructor

    public EntidadPublica() {
    }

    // Setters

    public void setCodiEntidad(int codiEntidad) {
        this.codiEntidad = codiEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getters

    public int getCodiEntidad() {
        return codiEntidad;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public String getDireccion() {
        return direccion;
    }
}
