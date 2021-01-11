package com.idat.semana09.model;

public class Persona {
	private Long idPersona;
	private String nombres;
	private String apellidos;
	private String fechaNac;
	
	public Persona() {}
	
	public Persona(Long idPersona, String nombres, String apellidos, String fechaNac) {
		super();
		this.idPersona = idPersona;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
	}
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
}
