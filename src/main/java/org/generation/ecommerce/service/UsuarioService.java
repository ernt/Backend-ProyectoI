package org.generation.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.ecommerce.model.ChangePassword;
import org.generation.ecommerce.model.Usuario;
import org.generation.ecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository=usuarioRepository;
	}
	
	public List<Usuario> getAllUsers(){
		return usuarioRepository.findAll();
	}
	public Usuario getUsuario(Long id) {
		return usuarioRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("El usuario con el id "
						+ id+"no existe")
				);
	}
	
	
	public Usuario deleteUsuario(Long id) {
		Usuario userTmp=null;
		if (usuarioRepository.existsById(id)) {
			userTmp=usuarioRepository.findById(id).get();
			usuarioRepository.deleteById(id);
		}
		return userTmp;
	}

	public Usuario addUsuario(Usuario usuario) {
		Usuario tmp=null;
		if (usuarioRepository.findByCorreo(usuario.getCorreo()).isEmpty()) {
			tmp=usuarioRepository.save(usuario);
		}
		return tmp;
	}

//	Cambiar solo contraseña
	public Usuario updateUsuario(Long id ,ChangePassword changePassword) {
			Usuario tmp=null;
	if (usuarioRepository.existsById(id)) {
		if ((changePassword.getPassword()!=null) && (changePassword.getNewPassword()!=null)) {
			tmp=usuarioRepository.findById(id).get();
			if (tmp.getPassword().equals(changePassword.getPassword())) {
				tmp.setPassword(changePassword.getNewPassword());
				usuarioRepository.save(tmp);
			}else {
				tmp=null;
			}
		}
	}else {
		System.out.println("Update - El usuario con id "+id+" no existe");
	}
	return tmp;
	
}
	
	public Usuario updateUsuarioOther(Long id, String rol,String foto,String telefono ) {
			Usuario tmp=null;
			if (usuarioRepository.existsById(id)) {
				tmp=usuarioRepository.findById(id).get();
				
				if (rol!=null)	tmp.setRol(rol);
				if (foto!=null) tmp.setFoto(foto);
				if (telefono!=null)	tmp.setTelefono(telefono);
				usuarioRepository.save(tmp);
			}else {
				System.out.println("Update - El usuario con id "+id+" no existe");
			}
		return tmp;
	}
			
	



}
