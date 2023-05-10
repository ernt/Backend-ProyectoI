package org.generation.ecommerce.model;

public class Categorias {
	private String nombreCategoria;
	private long id;
	private static long total=0;
	
	public Categorias(String nombreCategoria) {
		super();
		this.nombreCategoria = nombreCategoria;
		total++;
		id= Categorias.total;
	} //Constructor
	
	public Categorias() {
		total++;
		id=Categorias.total;
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