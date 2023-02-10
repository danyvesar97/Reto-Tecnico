package com.reto.tecnico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto.tecnico.entities.ClaseNave;
import com.reto.tecnico.repository.ClaseNaveRepository;

@Service
public class ClaseNaveService { /* Estructura del servicio para la clase ClaseNave */
	@Autowired
	private ClaseNaveRepository claseNaveRepository;
	
	public List<ClaseNave> listAll(){ /* Lista todas las clases de nave que hay */
		return claseNaveRepository.findAll();
	}
}
