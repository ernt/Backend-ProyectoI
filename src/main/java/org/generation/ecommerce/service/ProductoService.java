package org.generation.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.ecommerce.model.Producto;
import org.generation.ecommerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductoService {
	private final ProductoRepository productoRepository;

    @Autowired
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository=productoRepository;
	}//contructor_
    public List<Producto> getAllProductos(){
    	return productoRepository.findAll();
    }//getAllProductos


    public Producto getProducto(Long id) {
		return productoRepository.findById(id).orElseThrow(
				()->new IllegalArgumentException("El Producto con id "+
						id + " no existe")
				);//()->Funcion_flecha_que_lanza_la_excepcion
    }//getProducto

    public Producto deleteProducto(Long id) {
    	Producto tmpProd = null;
		if(productoRepository.existsById(id)) {
			tmpProd = productoRepository.findById(id).get();
			productoRepository.deleteById(id);
		}//if
		return tmpProd;
    }//deleteProducto

    public Producto addProducto(Producto producto) {
    	return productoRepository.save(producto);
    }//addProducto


    public Producto updateProducto(Long id, String nombre, String descripcion, String imagen, Double precio,
                                   Integer cantidad, Long categoria_id) {
        Producto tmpProd = null;

		if (productoRepository.existsById(id)) {
			tmpProd = productoRepository.findById(id).get();
			if (nombre != null) tmpProd.setNombre(nombre);
			if (descripcion != null) tmpProd.setDescripcion(descripcion);
			if (imagen != null) tmpProd.setImagen(imagen);
			if (precio != null) tmpProd.setPrecio(precio.doubleValue());
			if (cantidad != 0) tmpProd.setCantidad(cantidad);
			if (categoria_id != null) tmpProd.setCategorias_id(categoria_id);
			productoRepository.save(tmpProd);
		}else {
			System.out.println("Update - El Producto con Id "
					+ id + " no existe");
		}//else
		return tmpProd;
    }//updateProducto
}//class_ProductoService