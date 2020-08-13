package com.johnkegd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnkegd.model.UserGS;

public interface IUserRepo extends JpaRepository<UserGS, Integer> {

	UserGS findByNombre(String nombre);
	
}
