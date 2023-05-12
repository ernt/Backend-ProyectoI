package org.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
    private long id;
	@Column(nullable = false)
    private String nombre;
	@Column(nullable = false)
    private String descripcion;
    @Column(nullable = false)
    private String imagen;
    @Column(nullable = false)
    private double precio;
    @Column(nullable = false)
    private int cantidad;
    @Column(nullable = false)
    private long categoria_id;
//    private static long total = 0;

    public Producto(String nombre, String descripcion, String imagen, double precio, int cantidad, long categoria) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria_id = categoria_id;
 //       total++;
//        this.id = total;
    }

    public Producto() {} //constructor_default

    public String getNombre() {
        return nombre;
    }//getNombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//setNombre
    public String getDescripcion() {
        return descripcion;
    }//getDescripcion
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }//setDescripcion
    public String getImagen() {
        return imagen;
    }//getImagen
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }//setImagen
    public double getPrecio() {
        return precio;
    }//getPrecio
    public void setPrecio(double precio) {
        this.precio = precio;
    }//setPrecio
    public long getId() {
        return id;
    }//getId
    public void setId(long id) {
        this.id = id;
    }//setId
    public int getCantidad() {
        return cantidad;
    }//getCantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }//setCantidad

    public long getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(long categoria_id) {
		this.categoria_id = categoria_id;
	}

	@Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + ", precio="
                + precio + ", id=" + id + ", cantidad=" + cantidad + ", categoria_id=" + categoria_id + "]";
    }// toString   
}//class_Producto

