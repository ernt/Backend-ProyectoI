package org.generation.ecommerce.service;

import java.util.ArrayList;

import org.generation.ecommerce.model.Categorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriasService {
	public final ArrayList<Categorias> lista = new ArrayList<>();
	@Autowired
	public CategoriasService() {
		lista.add(new Categorias("Maquillaje"));
		lista.add(new Categorias("Mascotas"));
		lista.add(new Categorias("SexShop"));
		lista.add(new Categorias("Accesorios"));
		lista.add(new Categorias("Calzado"));
		lista.add(new Categorias("Vestimenta"));
		lista.add(new Categorias("Varios"));
	}//Constructor
	
	public ArrayList<Categorias>getAllCategorias(){
		return lista;
	}//getAllCategorias

	public Categorias getCategorias(Long id) {
		// TODO Auto-generated method stub
		Categorias tmpCat = null;
		for(Categorias categoria: lista) {
			if(categoria.getId()==id) {
				tmpCat = categoria;
			}//if
		}//foreach
		return tmpCat;
	}//getCategorias

	public Categorias deleteCategorias(Long id) {
		// TODO Auto-generated method stub
		Categorias tmpCat = null;
		for(Categorias categoria: lista) {
			if(categoria.getId()==id) {
				tmpCat = lista.remove(lista.indexOf(categoria));
				break;
			}//if
		}//foreach
		return tmpCat;
	}//deleteCategoria

	public Categorias addCategoria(Categorias categoria) {
		// TODO Auto-generated method stub
		lista.add(categoria);
		return categoria; 
	}//addCategoria

	public Categorias updateCategoria(Long id, String nombreCategoria) {
		// TODO Auto-generated method stub
		Categorias tmpCat = null;
		for(Categorias categoria: lista) {
			if(categoria.getId()==id) {
				if(nombreCategoria!=null) categoria.setNombreCategoria(nombreCategoria);
				tmpCat = categoria;
				break;
			}//if
		}//foreach
		return tmpCat;
	}//updateCategoria

	
	
}//class CategoriasService
