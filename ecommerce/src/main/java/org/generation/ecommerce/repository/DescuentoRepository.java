package org.generation.ecommerce.repository;

import java.util.Optional;

import org.generation.ecommerce.model.Descuento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DescuentoRepository extends JpaRepository<Descuento, Long> {
	Optional<Descuento> findByDescuento(Double descuento);	
}//interface_DescuentoRepository
