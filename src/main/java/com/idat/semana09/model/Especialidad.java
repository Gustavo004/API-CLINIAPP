package com.idat.semana09.model;

public class Especialidad {

	private int IdEspecialidad;
	private String nombre;
	
	public Especialidad(int idEspecialidad, String nombre) {
		super();
		IdEspecialidad = idEspecialidad;
		this.nombre = nombre;
	}
	
	public int getIdEspecialidad() {
		return IdEspecialidad;
	}
	public void setIdEspecialidad(int idEspecialidad) {
		IdEspecialidad = idEspecialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
}
