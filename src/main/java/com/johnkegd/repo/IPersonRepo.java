package com.johnkegd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnkegd.model.PersonGS;

public interface IPersonRepo extends JpaRepository<PersonGS, Integer>{



}
