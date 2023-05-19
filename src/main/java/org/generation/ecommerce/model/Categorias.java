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
	@Column (name="id",unique = true, nullable = false)
	private long id;
	@Column (nullable=false)
	private String nombre;

	//Maquillaje, Calzado, Vestimenta, Accesorios, SexShop, Mascotas, Varios
	public Categorias(String nombre) {
		super();
		this.nombre = nombre;
	} //Constructor
	
	public Categorias() {
	}//constructor

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public long getId() {
		return id;
	}//getId

	public void setId(long id) {
		this.id = id;
	}//setId
	
	
	
	
}//Class Categorias