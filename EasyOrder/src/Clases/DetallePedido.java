package Clases;

public class DetallePedido {
    private int numDetalle;
    private int cantidad;
    private double precioUnitario;
    private double subTotal;
    private Menu menu;

    public DetallePedido() {
    }

    public DetallePedido(int numDetalle, int cantidad, double precioUnitario, double subTotal, Menu menu) {
        this.numDetalle = numDetalle;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subTotal = subTotal;
        this.menu = menu;
    }

    public int getNumDetalle() {
        return numDetalle;
    }

    public void setNumDetalle(int numDetalle) {
        this.numDetalle = numDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public double calcularSubTotal(){
        return cantidad * precioUnitario;
        // Completar implementación
    }
}

