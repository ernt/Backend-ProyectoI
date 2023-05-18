package org.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="id", unique = true, nullable = false, columnDefinition = "NUMERIC(19,0)")
	private long id ; 
	@Column(nullable=false)
	private String nombre;
	@Column(nullable=false)
	private String apellido ; 
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String boleta;
	@Column(nullable=false)
	private String correo;
	
	private String telefono;
	
	private String rol;
	
	private String foto ;
	
	
	
	public Usuario(String nombre, String apellido, String password, String boleta, String correo, String telefono,
			String rol, String foto) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.boleta = boleta;
		this.correo = correo;
		this.telefono = telefono;
		this.rol = rol;
		this.foto = foto;
	}
	
	public Usuario() {
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBoleta() {
		return boleta;
	}

	public void setBoleta(String boleta) {
		this.boleta = boleta;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", password=" + password
				+ ", boleta=" + boleta + ", correo=" + correo + ", telefono=" + telefono + ", rol=" + rol + ", foto="
				+ foto + "]";
	}




	
	
	
}
