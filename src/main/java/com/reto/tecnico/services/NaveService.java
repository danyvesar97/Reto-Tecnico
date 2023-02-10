package com.reto.tecnico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto.tecnico.entities.Nave;
import com.reto.tecnico.entities.abstracts.Operaciones;
import com.reto.tecnico.repository.NaveRepository;

@Service
public class NaveService extends Operaciones{
	/* Estructura de la interfaz para la clase Nave */
	@Autowired
	private NaveRepository naveRepository;
	
	public List<Nave> listAll(String palabraClave){
		/* Lista todas las naves que hayan, tanto siguiendo una palabra clave de búsqueda
		 * como todas las que hayan */
		if(palabraClave != null) {
			return naveRepository.findAll(palabraClave);
		}
		return naveRepository.findAll();
	}
	
	public void save(Nave nave) {
		/* Guarda la información de los cambios realizados a una nave */
		naveRepository.save(nave);
	}
	
	public Nave get(Long id) {
		/* Obtiene la información de una nave en particular */
		return naveRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		/* Borra toda la información de una nave en particular */
		naveRepository.deleteById(id);
	}

	@Override /* Sobrecarga el método abstracto horaDespegue */
	public void horaDespegue(Nave nave) {
		save(nave);
		
	}
}
