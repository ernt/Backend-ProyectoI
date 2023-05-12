package org.generation.ecommerce.service.repository;

import org.generation.ecommerce.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository 
				extends JpaRepository<Producto, Long>{

}//interface_ProductoRepository
