package Clases;

import java.util.Date;

public class Pedido {
    private int numPedido;
    private Date fechaHora;
    private double importeTotal;
    private Mesa mesa;
    private MedioDePago medioDePago;
    private DetallePedido detalle;
    private EstadoPedido estado;

    public Pedido() {
    }

    public Pedido(int numPedido, Date fechaHora, double importeTotal, Mesa mesa, MedioDePago medioDePago, DetallePedido detalle, EstadoPedido estado) {
        this.numPedido = numPedido;
        this.fechaHora = fechaHora;
        this.importeTotal = importeTotal;
        this.mesa = mesa;
        this.medioDePago = medioDePago;
        this.detalle = detalle;
        this.estado = estado;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(MedioDePago medioDePago) {
        this.medioDePago = medioDePago;
    }

    public DetallePedido getDetalle() {
        return detalle;
    }

    public void setDetalle(DetallePedido detalle) {
        this.detalle = detalle;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public float calcularPrecioTotal(){
        return 0; // Realizar implemetación
    }
}
