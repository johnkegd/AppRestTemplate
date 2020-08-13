package com.johnkegd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.johnkegd.model.PersonGS;
import com.johnkegd.repo.IPersonRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonRepo repo;
	
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="User") String name , Model model) {
		//logic	
		PersonGS p = new PersonGS();
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
