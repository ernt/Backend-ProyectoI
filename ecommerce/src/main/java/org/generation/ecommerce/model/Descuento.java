package org.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="descuento")
public class Descuento {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="id", unique = true, nullable = false)
	private Long id;
	@Column (nullable=false)
	private double descuento;
	@Column (nullable = false, columnDefinition = "TINYINT(1)")
	private Boolean estado;
	
	public Descuento(long id, double descuento, boolean estado) {
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
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
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
