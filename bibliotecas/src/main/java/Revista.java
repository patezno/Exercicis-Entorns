public class Revista extends Ejemplar {

    // Atributos

    private int id = 0;
    private int añoSalida = 0;
    private int mesSalida = 0;
    private int numero = 0;

    // Constructores

    public Revista() {

    }

    public Revista(int id, int añoSalida, int mesSalida, int numero) {
        this.id = id;
        this.añoSalida = añoSalida;
        this.mesSalida = mesSalida;
        this.numero = numero;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setAñoSalida(int añoSalida) {
        this.añoSalida = añoSalida;
    }

    public void setMesSalida(int mesSalida) {
        this.mesSalida = mesSalida;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Getters

    public int getId() {
        return id;
    }

    public int getAñoSalida() {
        return añoSalida;
    }

    public int getMesSalida() {
        return mesSalida;
    }

    public int getNumero() {
        return numero;
    }
}
