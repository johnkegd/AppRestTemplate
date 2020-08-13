package com.johnkegd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.johnkegd.model.UserGS;
import com.johnkegd.repo.IUserRepo;


@SpringBootTest
class DemoWebGsApplicationTests {

	
	@Autowired
	private BCryptPasswordEncoder crypt;
	
	@Autowired
	private IUserRepo repo;
	
	@Test
	public void crearUsuarioTest() {
		
		UserGS us = new UserGS();
		
		us.setId(1);
		us.setNombre("John");
		us.setClave(crypt.encode("321"));
		
		UserGS retorno = repo.save(us);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
		
		
	}

}
