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
	@Column (name="id",unique = true, nullable = false)
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
    private long descuento_id;
    @Column(nullable = false)
    private long categorias_id;
//    private static long total = 0;



    public Producto() {} //constructor_default
public Producto(long id, String nombre, String descripcion, String imagen, double precio, int cantidad,
		long descuento_id, long categorias_id) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.imagen = imagen;
	this.precio = precio;
	this.cantidad = cantidad;
	this.descuento_id = descuento_id;
	this.categorias_id = categorias_id;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
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
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public long getDescuento_id() {
	return descuento_id;
}
public void setDescuento_id(long descuento_id) {
	this.descuento_id = descuento_id;
}
public long getCategorias_id() {
	return categorias_id;
}
public void setCategorias_id(long categorias_id) {
	this.categorias_id = categorias_id;
}
@Override
public String toString() {
	return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
			+ ", precio=" + precio + ", cantidad=" + cantidad + ", descuento_id=" + descuento_id + ", categorias_id="
			+ categorias_id + "]";
}


   
}//class_Producto

