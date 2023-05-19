package org.generation.ecommerce.controller;

import java.util.List;

import org.generation.ecommerce.model.Categorias;
import org.generation.ecommerce.service.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path="/api/categorias/")
public class ControllerCategorias {

	private final CategoriasService categoriasService;
	
	@Autowired
	public ControllerCategorias(CategoriasService categoriasService) {
		this.categoriasService = categoriasService;
	}
	
	@GetMapping
	public List<Categorias> getAllCategorias(){
		return categoriasService.getAllCategorias();
	}//getAllCategorias
	
	@GetMapping (path="{categoriaId}")
	public Categorias getCategorias(@PathVariable("categoriaId")Long id) {
		return categoriasService.getCategorias(id);
	}//getCategoria
	
	@DeleteMapping (path="{categoriaId}")
	public Categorias deleteCategorias(@PathVariable("categoriaId")Long id) {
		return categoriasService.deleteCategorias(id);
	}//getCategoria
	
	@PostMapping
	public Categorias addCategoria (@RequestBody Categorias categoria) {
		return categoriasService.addCategoria(categoria);
	}//addCategoria
	
	@PutMapping (path="{categoriaId}")
	public Categorias updateCategoria (@PathVariable("categoriaId") Long id,
			String nombreCategoria) {
		return categoriasService.updateCategoria(id,nombreCategoria);
		}//PutCategoria
	
}//Class ControllerCategorias