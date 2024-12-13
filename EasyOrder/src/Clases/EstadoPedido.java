package Clases;

public class EstadoPedido {
    private String descripcion;

    public EstadoPedido() {
    }

    public EstadoPedido(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
