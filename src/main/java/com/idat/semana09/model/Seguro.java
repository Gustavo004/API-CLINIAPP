package com.idat.semana09.model;

public class Seguro {

	private int IdSeguro;
	private String Nombre;

	public Seguro(int idSeguro, String nombre) {
		super();
		IdSeguro = idSeguro;
		Nombre = nombre;
	}

	public Seguro() {

	}

	//
	public int getIdSeguro() {
		return IdSeguro;
	}

	public void setIdSeguro(int idSeguro) {
		IdSeguro = idSeguro;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

}
