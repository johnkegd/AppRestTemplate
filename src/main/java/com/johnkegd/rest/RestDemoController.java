package com.johnkegd.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.johnkegd.model.PersonGS;
import com.johnkegd.repo.IPersonRepo;

@RestController
@RequestMapping("/personas")
public class RestDemoController {

	@Autowired
	private IPersonRepo repo;
	
	@GetMapping
	public List<PersonGS> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar( @RequestBody PersonGS id){
		repo.save(id);
	}
	
	@PutMapping
	public void modificar( @RequestBody PersonGS id){
		repo.save(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}
	
	
}
