package org.generation.ecommerce.service;

import java.util.ArrayList;

import org.generation.ecommerce.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	private final ArrayList<Usuario> lista = new ArrayList<>();
	@Autowired
	public UsuarioService() {
		lista.add(new Usuario("Ernesto","Nieves","cosas@","boleta.jpg","emrn@gmail.com","5555555555","vendedor","foto.jpg"));
		lista.add(new Usuario("Juan","Aviña","cosas@","boleta.jpg","emrn@gmail.com","5555555555","vendedor","foto.jpg"));
		lista.add(new Usuario("Daniel","Montoya","cosas@","boleta.jpg","emrn@gmail.com","5555555555","vendedor","foto.jpg"));
	
	}
	
	public ArrayList<Usuario> getAllUsers(){
		
		return lista;
	}
	public Usuario getUsuario(Long id) {
		Usuario tmpUser=null;
		for(Usuario usuario : lista ) {
			if(usuario.getId()==id) {
				tmpUser=usuario;
			}//if
		}//foreach
		return tmpUser;
	}//getUser

	public Usuario deleteUsuario(Long id) {
		Usuario tmpUser=null;
		for(Usuario usuario : lista ) {
			if(usuario.getId()==id) {
				tmpUser=lista.remove(lista.indexOf(usuario));
				break;
			}//if
		}//foreach
		return tmpUser;
	}//deleteUser

	public Usuario addUsuario(Usuario usuario) {
		lista.add(usuario);
		return usuario;
	}

	public Usuario updateUsuario(Long id , String nombre, String apellido, String password, String boleta, String correo, String telefono,
			String rol, String foto) {
		Usuario tmpUser=null;
		for(Usuario usuario: lista ) {
			if(usuario.getId()==id) {
		if (nombre!=null) usuario.setNombre(nombre);
		if(apellido!=null) usuario.setApellido(apellido);
		if(password!=null) usuario.setPassword(password);
		if(boleta!=null) usuario.setBoleta(boleta);
		if(correo!=null)usuario.setCorreo(correo);
		if(telefono!=null)usuario.setTelefono(telefono);
		if(rol!=null)usuario.setRol(rol);
		if(foto!=null)usuario.setFoto(foto);
				tmpUser=usuario;
				break;
			}//if
		}//foreach
		return tmpUser;
	}//updateUser
	



}
