package com.idat.semana09.model;

public class Medicamentos {

	private int IdMedicamentos;
	private String Nombre;
	private String Laboratorio;
	private String Composicion;
	private String Contradicciones;
	private String Precauciones;

	public Medicamentos(int idMedicamentos, String nombre, String laboratorio, String composicion,
			String contradicciones, String precauciones) {
		super();
		IdMedicamentos = idMedicamentos;
		Nombre = nombre;
		Laboratorio = laboratorio;
		Composicion = composicion;
		Contradicciones = contradicciones;
		Precauciones = precauciones;
	}

	public Medicamentos() 
	{
		
	}
	
	public int getIdMedicamentos() {
		return IdMedicamentos;
	}

	public void setIdMedicamentos(int idMedicamentos) {
		IdMedicamentos = idMedicamentos;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getLaboratorio() {
		return Laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		Laboratorio = laboratorio;
	}

	public String getComposicion() {
		return Composicion;
	}

	public void setComposicion(String composicion) {
		Composicion = composicion;
	}

	public String getContradicciones() {
		return Contradicciones;
	}

	public void setContradicciones(String contradicciones) {
		Contradicciones = contradicciones;
	}

	public String getPrecauciones() {
		return Precauciones;
	}

	public void setPrecauciones(String precauciones) {
		Precauciones = precauciones;
	}

}
