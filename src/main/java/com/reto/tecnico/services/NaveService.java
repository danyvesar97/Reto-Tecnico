package com.reto.tecnico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto.tecnico.entities.Nave;
import com.reto.tecnico.repository.NaveRepository;

@Service
public class NaveService {
	@Autowired
	private NaveRepository naveRepository;
	
	public List<Nave> listAll(String palabraClave){
		if(palabraClave != null) {
			return naveRepository.findAll(palabraClave);
		}
		return naveRepository.findAll();
	}
	
	public void save(Nave nave) {
		naveRepository.save(nave);
	}
	
	public Nave get(Long id) {
		return naveRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		naveRepository.deleteById(id);
	}
}
