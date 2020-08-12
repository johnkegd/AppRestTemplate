package com.johnkegd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnkegd.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{



}
