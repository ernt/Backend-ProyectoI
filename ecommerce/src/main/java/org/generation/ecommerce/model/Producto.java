package org.generation.ecommerce.model;

public class Producto {
    private String nombre;
    private String descripcion;
    private String imagen;
    private double precio;
    private long id;
    private int cantidad;
    private String categoria;
    private static long total = 0;

    public Producto(String nombre, String descripcion, String imagen, double precio, int cantidad, String categoria) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        total++;
        this.id = total;
    }

    public Producto() {}

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
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + ", precio="
                + precio + ", id=" + id + ", cantidad=" + cantidad + ", categoria=" + categoria + "]";
    }   
}

