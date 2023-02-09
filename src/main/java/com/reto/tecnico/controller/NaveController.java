package com.reto.tecnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.reto.tecnico.entities.Combustible;
import com.reto.tecnico.entities.Nave;
import com.reto.tecnico.repository.CombustibleRepository;
import com.reto.tecnico.services.CombustibleService;
import com.reto.tecnico.services.NaveService;

@Controller
public class NaveController {
	@Autowired
	private NaveService naveService;
	
	@Autowired
	private CombustibleService combustibleService;
	
	@Autowired
	private CombustibleRepository combustibleRepository;
	
	@RequestMapping("/")
	public String verPaginaInicial(Model modelo) {
		List<Nave> listaNaves = naveService.listAll();
		modelo.addAttribute("listaNaves", listaNaves);
		return "index";
	}
	
	@RequestMapping("/nuevo")
	public String mostrarFormularioRegistroNave(Model modelo) {
		Nave nave = new Nave();
		List<Combustible> listaCombustibles = combustibleService.listAll();
		modelo.addAttribute("nave", nave);
		modelo.addAttribute("listaCombustibles", listaCombustibles);
		return "nueva_nave";
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardarNave(@ModelAttribute("nave") Nave nave) {
		naveService.save(nave);
		return "redirect:/";
	}
}
