package com.reto.tecnico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto.tecnico.entities.ClaseNave;
import com.reto.tecnico.repository.ClaseNaveRepository;

@Service
public class ClaseNaveService {
	@Autowired
	private ClaseNaveRepository claseNaveRepository;
	
	public List<ClaseNave> listAll(){
		return claseNaveRepository.findAll();
	}
}
