package org.generation.ecommerce.repository;

import java.util.Optional;

import org.generation.ecommerce.model.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long>{
	Optional<Categorias>findBynombreCategoria(String nombreCategoria);
}//interface CategoriasRepository
