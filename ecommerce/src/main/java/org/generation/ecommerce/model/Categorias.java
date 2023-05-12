package org.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="categorias")
public class Categorias {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="id", unique = true, nullable = false)
	private long id;
	@Column (nullable=false)
	private String nombreCategoria;

	//Maquillaje, Calzado, Vestimenta, Accesorios, SexShop, Mascotas, Varios
	public Categorias(String nombreCategoria) {
		super();
		this.nombreCategoria = nombreCategoria;
	} //Constructor
	
	public Categorias() {
	}//constructor

	public String getNombreCategoria() {
		return nombreCategoria;
	}//getNombre

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}//setNombre

	public long getId() {
		return id;
	}//getId

	public void setId(long id) {
		this.id = id;
	}//setId
	
	
	
	
}//Class Categorias