package com.reto.tecnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.reto.tecnico.entities.Combustible;
import com.reto.tecnico.repository.CombustibleRepository;

@Controller
public class CombustibleController {
	@Autowired
	private CombustibleRepository combustibleRepository;
	
	@GetMapping("/combustible")
	public String listarCombustibles(Model modelo) {
		List<Combustible> listaCombustibles = combustibleRepository.findAll();
		modelo.addAttribute("listaCombustibles", listaCombustibles);
		return "index";
	}
}
