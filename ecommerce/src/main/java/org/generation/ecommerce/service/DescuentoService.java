package org.generation.ecommerce.service;

import java.util.List;

import org.generation.ecommerce.model.Descuento;

import org.generation.ecommerce.repository.DescuentoRepository;

public class DescuentoService {
	
	private final DescuentoRepository descuentoRepository;	

	public DescuentoService(DescuentoRepository descuentoRepository) {

		this.descuentoRepository = descuentoRepository;
	}

	public List<Descuento> getAllDescuentos() {
		// TODO Auto-generated method stub
		return descuentoRepository.findAll();
	}	

	public Descuento getDescuento(Long id) {
		// TODO Auto-generated method stub
		return descuentoRepository.findById(id).orElseThrow(
				()->new IllegalArgumentException("El Producto con id "+
						id + " no existe")
				);//()->Funcion_flecha_que_lanza_la_excepcion
	}

	public Descuento deleteDescuento(Long id) {
		// TODO Auto-generated method stub
    	Descuento tmpDesc = null;
		if(descuentoRepository.existsById(id)) {
			tmpDesc = descuentoRepository.findById(id).get();
			descuentoRepository.deleteById(id);
		}//if
		return tmpDesc;
	}
	
	public Descuento addDescuento(Descuento descuento) {
		// TODO Auto-generated method stub
		return descuentoRepository.save(descuento);
	}
	
	public Descuento updateDescuento(Long id, Double descuento, Boolean estado) {
		// TODO Auto-generated method stub
		Descuento tmpDesc = null;
		
		if (descuentoRepository.existsById(id)) {
			tmpDesc = descuentoRepository.findById(id).get();
			if (descuento != null) tmpDesc.setDescuento(descuento);;
			if (estado != null) tmpDesc.setEstado(estado);;

			descuentoRepository.save(tmpDesc);
		}else {
			System.out.println("Update - El Descuento con Id "
					+ id + " no existe");
		}//else
		return tmpDesc;
	}
	

}//class DescuentoService
