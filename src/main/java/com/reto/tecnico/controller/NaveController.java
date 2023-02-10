package com.reto.tecnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.reto.tecnico.entities.ClaseNave;
import com.reto.tecnico.entities.Combustible;
import com.reto.tecnico.entities.Nave;
import com.reto.tecnico.services.ClaseNaveService;
import com.reto.tecnico.services.CombustibleService;
import com.reto.tecnico.services.NaveService;

@Controller
public class NaveController {
	@Autowired
	private NaveService naveService;

	@Autowired
	private CombustibleService combustibleService;
	
	@Autowired
	private ClaseNaveService claseNaveService;

	@RequestMapping("/")
	public String verPaginaInicial(Model modelo,@Param("palabraClave") String palabraClave) {
		List<Nave> listaNaves = naveService.listAll(palabraClave);
		modelo.addAttribute("listaNaves", listaNaves);
		modelo.addAttribute("palabraClave", palabraClave);
		return "index";
	}

	@RequestMapping("/nuevo")
	public String mostrarFormularioRegistroNave(Model modelo) {
		Nave nave = new Nave();
		List<Combustible> listaCombustibles = combustibleService.listAll();
		List<ClaseNave> listaTipos = claseNaveService.listAll();
		modelo.addAttribute("nave", nave);
		modelo.addAttribute("listaCombustibles", listaCombustibles);
		modelo.addAttribute("listaTipos", listaTipos);
		return "nueva_nave";
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardarNave(@ModelAttribute("nave") Nave nave) {
		naveService.save(nave);
		return "redirect:/";
	}
	
	@RequestMapping("/editar/{id}")
	public ModelAndView mostrarFormularioEdicionNave(@PathVariable(name="id") Long id) {
		ModelAndView modelo = new ModelAndView("editar_nave");
		Nave nave = naveService.get(id);
		List<Combustible> listaCombustibles = combustibleService.listAll();
		List<ClaseNave> listaTipos = claseNaveService.listAll();
		modelo.addObject("nave", nave);
		modelo.addObject("listaCombustibles", listaCombustibles);
		modelo.addObject("listaTipos", listaTipos);
		return modelo;
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminarNave(@PathVariable(name="id") Long id) {
		naveService.delete(id);
		return "redirect:/";
	}
}
