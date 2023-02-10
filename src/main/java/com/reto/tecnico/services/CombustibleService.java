package com.reto.tecnico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto.tecnico.entities.Combustible;
import com.reto.tecnico.repository.CombustibleRepository;

@Service
public class CombustibleService { /* Estructura de la interfaz para la clase ClaseNave */
	@Autowired
	private CombustibleRepository combustibleRepository;
	
	public List<Combustible> listAll(){ /* Lista todos los tipos de combustible que hay */
		return combustibleRepository.findAll();
	}
}
