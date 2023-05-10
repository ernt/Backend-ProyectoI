package org.generation.ecommerce.model;

public class Usuario {
//	int id ; se agregara con la base de datos 
	private String nombre;
	private String apellido ; 
	private String password;
	private String boleta;
	private String correo;
	private String telefono;
	private String rol;
	private String foto ;
	private long id ; 
	private static long total=0;
	
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
		total++;
		id=Usuario.total;
	}
	
	public Usuario() {
		total++;
		id=Usuario.total;
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

	public static long getTotal() {
		return total;
	}

	public static void setTotal(long total) {
		Usuario.total = total;
	}

	@Override
	public String toString() {
		return "Usuarios [nombre=" + nombre + ", apellido=" + apellido + ", password=" + password + ", boleta=" + boleta
				+ ", correo=" + correo + ", telefono=" + telefono + ", rol=" + rol + ", foto=" + foto + "]";
	}
	
	
	
}
