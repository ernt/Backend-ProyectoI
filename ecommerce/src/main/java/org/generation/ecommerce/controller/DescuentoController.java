package org.generation.ecommerce.controller;

import java.util.List;

import org.generation.ecommerce.model.Descuento;
import org.generation.ecommerce.model.Producto;
import org.generation.ecommerce.service.DescuentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path="/api/descuentos/")
public class DescuentoController {
	
	private final DescuentoService descuentoService;
	
	@Autowired
	public DescuentoController(DescuentoService descuentoService) {

		this.descuentoService = descuentoService;
	}//contructor_
	
	@GetMapping //http://127.0.0.1:8080/api/descuentos/
	public List<Descuento> getAllDescuentos(){
		return descuentoService.getAllDescuentos();
	}//getAllProducts
	
	@GetMapping(path="{descId}") //http://127.0.0.1:8080/api/descuento/4
	public Descuento getDescuento(@PathVariable("descId") Long id) {
		return descuentoService.getDescuento(id);
	}//getProduct
	
	@DeleteMapping(path="{descId}")
	public Descuento deleteDescuento(@PathVariable("descId") Long id) {
		return descuentoService.deleteDescuento(id);
	}//DeleteProduct
	
	@PostMapping
	public Descuento addDescuento (@RequestBody Descuento descuento) {
		return descuentoService.addDescuento(descuento);
	}
	
	@PutMapping (path="{descId}")
	public Descuento updateDescuento (@PathVariable("descId") Long id, 
		@RequestParam(required= false) 	Double descuento, 
		@RequestParam(required= false)	Boolean estado	
			) {	
		return descuentoService.updateDescuento(id, descuento, estado);
	}	

}//class_DescuentoController
