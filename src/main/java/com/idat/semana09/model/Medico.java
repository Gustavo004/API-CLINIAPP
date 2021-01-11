package com.idat.semana09.model;

public class Medico {

	private String Dni;
	private String Nombre;
	private String Telefono;
	private String Email;
	private int IdEspecialidad;
	private int IdUsuario;
	
	public Medico(String dni, String nombre, String telefono, String email, int idEspecialidad, int idUsuario) 
	{
		super();
		Dni = dni;
		Nombre = nombre;
		Telefono = telefono;
		Email = email;
		IdEspecialidad = idEspecialidad;
		IdUsuario = idUsuario;
	}
	
	public Medico() 
	{
		
	}
	
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
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
	public int getIdEspecialidad() {
		return IdEspecialidad;
	}
	public void setIdEspecialidad(int idEspecialidad) {
		IdEspecialidad = idEspecialidad;
	}
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
	
}
