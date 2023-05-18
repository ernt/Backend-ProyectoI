package org.generation.ecommerce.service;

import java.util.List;

import org.generation.ecommerce.model.Categorias;
import org.generation.ecommerce.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriasService {
	public final CategoriasRepository categoriasRepository;
	
	@Autowired
	public CategoriasService(CategoriasRepository categoriasRepository) {
		this.categoriasRepository = categoriasRepository;
	}//Constructor
	
	public List<Categorias>getAllCategorias(){
		return categoriasRepository.findAll();
	}//getAllCategorias Repository

	public Categorias getCategorias(Long id) {
		// TODO Auto-generated method stub
		return categoriasRepository.findById(id).orElseThrow(
				() -> new IllegalArgumentException("La categoria con id " + id + " no existe"));
	}//getCategorias Repository

	public Categorias deleteCategorias(Long id) {
		// TODO Auto-generated method stub
		Categorias tmpCat = null;
			if(categoriasRepository.existsById(id)) {
				tmpCat = categoriasRepository.findById(id).get();
				categoriasRepository.deleteById(id);
			}//if
		return tmpCat;
	}//deleteCategoria Repository

	public Categorias addCategoria(Categorias categoria) {
		// TODO Auto-generated method stub
		Categorias tmpCat = null;
		if(categoriasRepository.findBynombreCategoria(categoria.getNombre()).isEmpty()) {
			tmpCat = categoriasRepository.save(categoria);
		} //if
		return tmpCat; 
	}//addCategoria Repository

	public Categorias updateCategoria(Long id, String nombre) {
		// TODO Auto-generated method stub
		Categorias tmpCat = null;
		if(categoriasRepository.existsById(id)) {
			tmpCat = categoriasRepository.findById(id).get();
			if (nombre!=null) tmpCat.setNombre(nombre);
			categoriasRepository.save(tmpCat);
		}else {
			System.out.println("Update - La categoria con id " + id + " no existe");
		}//if else 
		return tmpCat;
	}//updateCategoria Repository

	
	
}//class CategoriasService
