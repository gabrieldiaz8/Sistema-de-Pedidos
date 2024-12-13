package Clases;

public class Mesa {
    private int numMesa;
    private String descripcion;

    public Mesa() {
    }

    public Mesa(int numMesa, String descripcion) {
        this.numMesa = numMesa;
        this.descripcion = descripcion;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
