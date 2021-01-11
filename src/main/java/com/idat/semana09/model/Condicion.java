package com.idat.semana09.model;

public class Condicion {

	private int IdCondicion;
	private String Condicion;

	public Condicion(int idCondicion, String condicion) {
		super();
		IdCondicion = idCondicion;
		Condicion = condicion;
	}

	public Condicion() {

	}

	public int getIdCondicion() {
		return IdCondicion;
	}

	public void setIdCondicion(int idCondicion) {
		IdCondicion = idCondicion;
	}

	public String getCondicion() {
		return Condicion;
	}

	public void setCondicion(String condicion) {
		Condicion = condicion;
	}

}
