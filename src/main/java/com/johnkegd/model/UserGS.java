package com.johnkegd.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UserGS{
	
	@Id
	private int id;
	private String clave;
	private String nombre;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}

}
