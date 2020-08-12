package com.johnkegd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.johnkegd.model.User;
import com.johnkegd.repo.IUsuarioRepo;

@SpringBootTest
class DemoWebGsApplicationTests {

	
	@Autowired
	private IUsuarioRepo repo;
	
	@Test
	public void crearUsuarioTest() {
		
		User us = new User();
		
		us.setId(1);
		us.setNombre("JohnkegsTest");
		us.setClave("888");
		
		User retorno = repo.save(us);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
		
		
	}

}
