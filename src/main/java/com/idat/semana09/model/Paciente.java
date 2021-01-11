package com.idat.semana09.model;

import java.util.Date;

public class Paciente {

	
	private String Nombre;
	private String Apellido;
	private String Direccion;
	private String Telefono;
	private String Email;
	private String Estadocivil;
	private String Ocupacion;
	private String GradoInstruccion;
	private String Ciudad;
	private Date FechaNacimiento;
	//LLAVES FK
	private int  IdSeguro;
	private int IdCondicion;
	private int DNI;
	private int IdUsuario;
	
	public Paciente(String nombre, String apellido, String direccion, String telefono, String email, String estadocivil,
			String ocupacion, String gradoInstruccion, String ciudad, Date fechaNacimiento, int idSeguro,
			int idCondicion, int dNI, int idUsuario) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Direccion = direccion;
		Telefono = telefono;
		Email = email;
		Estadocivil = estadocivil;
		Ocupacion = ocupacion;
		GradoInstruccion = gradoInstruccion;
		Ciudad = ciudad;
		FechaNacimiento = fechaNacimiento;
		IdSeguro = idSeguro;
		IdCondicion = idCondicion;
		DNI = dNI;
		IdUsuario = idUsuario;
	}
	
	public Paciente() 
	{
		
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getEstadocivil() {
		return Estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		Estadocivil = estadocivil;
	}
	public String getOcupacion() {
		return Ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		Ocupacion = ocupacion;
	}
	public String getGradoInstruccion() {
		return GradoInstruccion;
	}
	public void setGradoInstruccion(String gradoInstruccion) {
		GradoInstruccion = gradoInstruccion;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public int getIdSeguro() {
		return IdSeguro;
	}
	public void setIdSeguro(int idSeguro) {
		IdSeguro = idSeguro;
	}
	public int getIdCondicion() {
		return IdCondicion;
	}
	public void setIdCondicion(int idCondicion) {
		IdCondicion = idCondicion;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
	

	
}
