package com.johnkegd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnkegd.model.User;

public interface IUsuarioRepo extends JpaRepository<User, Integer> {

	
	
}
