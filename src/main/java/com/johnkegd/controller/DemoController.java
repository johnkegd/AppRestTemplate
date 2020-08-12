package com.johnkegd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.johnkegd.model.Persona;
import com.johnkegd.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Noob") String name , Model model) {
		//logic	
		Persona p = new Persona();
		p.setIdPersona(1);
		p.setNombre("John");
		
		repo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/list")
	public String greeting(Model model) {
		//logic
		
		model.addAttribute("personas", repo.findAll());
		return "greeting";
	}
	
	
}
