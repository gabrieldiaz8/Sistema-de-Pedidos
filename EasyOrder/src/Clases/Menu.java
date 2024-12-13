package Clases;

public class Menu {
    private int nroMenu;
    private String nombre;
    private String descripcion;
    private double precio;

    public Menu() {
    }

    public Menu(int nroMenu, String nombre, String descripcion, double precio) {
        this.nroMenu = nroMenu;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getNroMenu() {
        return nroMenu;
    }

    public void setNroMenu(int nroMenu) {
        this.nroMenu = nroMenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
