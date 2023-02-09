package com.reto.tecnico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto.tecnico.entities.Combustible;
import com.reto.tecnico.repository.CombustibleRepository;

@Service
public class CombustibleService {
	@Autowired
	private CombustibleRepository combustibleRepository;
	
	public List<Combustible> listAll(){
		return combustibleRepository.findAll();
	}
}
