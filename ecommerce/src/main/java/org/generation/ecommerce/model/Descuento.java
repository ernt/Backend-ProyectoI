package org.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Descuento {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="id", unique = true, nullable = false)
	private long id;
	@Column (nullable=false)
	private int descuento;
	@Column (nullable = false)
	private boolean estado;
	
	public Descuento(long id, int descuento, boolean estado) {
		super();
		this.id = id;
		this.descuento = descuento;
		this.estado = estado;
	}
	
	public Descuento() { }//constructores	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Descuento [id=" + id + ", descuento=" + descuento + ", estado=" + estado + "]";
	}//toString
	
	

}//class_Descuento
