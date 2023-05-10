package org.generation.ecommerce.service;

import java.util.ArrayList;

import org.generation.ecommerce.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    private final ArrayList<Producto> lista = new ArrayList<>();
    private static long total = 0;
//Producto(String nombre, String descripcion, String imagen, double precio, int cantidad, String categoria)
    @Autowired
    public ProductoService() {
    		lista.add(new Producto("Gorra","Gorrita fachera facherita","imgCargado",55.6,5,"Ropa"));
    		lista.add(new Producto("Lentes","lentes de sol mamalones para playa","imgCargado",57.8,7,"Accesorios"));
    		lista.add(new Producto("Playera","Playera de algodon recien horneada","imgCargado",33.5,9,"Ropa"));
    		lista.add(new Producto("Dildo","Dildo del negro de whatsap","imgCargado",36.7,10,"SexShop"));
    }// constructor default

    public ArrayList<Producto> getAllProductos() {
        return lista;
    }

    public Producto getProducto(Long id) {
        Producto tmpProd = null;
        for (Producto producto : lista) {
            if (producto.getId() == id) {
                tmpProd = producto;
            }
        }
        return tmpProd;
    }

    public Producto deleteProducto(Long id) {
        Producto tmpProd = null;
        for (Producto producto : lista) {
            if (producto.getId() == id) {
                tmpProd = producto;
                lista.remove(lista.indexOf(producto));
                break;
            }
        }
        return tmpProd;
    }

    public Producto addProducto(Producto producto) {
        total = lista.size(); // obtener el número actual de productos en la lista
        total++; // incrementar en 1 el contador de IDs
        producto.setId(total);
        lista.add(producto);
        return producto;
    }


    public Producto updateProducto(Long id, String nombre, String descripcion, String imagen, Double precio,
                                   int cantidad, String categoria) {
        Producto tmpProd = null;
        for (Producto producto : lista) {
            if (producto.getId() == id) {
                if (nombre != null)
                    producto.setNombre(nombre);
                if (descripcion != null)
                    producto.setDescripcion(descripcion);
                if (imagen != null)
                    producto.setImagen(imagen);
                if (precio != null)
                    producto.setPrecio(precio);
                if (cantidad > 0)
                    producto.setCantidad(cantidad);
                if (categoria != null)
                    producto.setCategoria(categoria);
                tmpProd = producto;
                break;
            }
        }
        return tmpProd;
    }

}// clase ProductoService
