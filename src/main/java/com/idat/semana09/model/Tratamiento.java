package com.idat.semana09.model;

import java.util.Date;

public class Tratamiento {

	
	private int IdTratamiento;
	private Date FechaIniciada;
	private Date FechaFinalizada;
	private int IdDiagnostico;
	private int DNI;
	private int IdUsuario;
	private Date Fecha_Del_tratamiento;
	private String Observaciones;
	
	public Tratamiento(int idTratamiento, Date fechaIniciada, Date fechaFinalizada, int idDiagnostico, int dNI,
			int idUsuario, Date fecha_Del_tratamiento, String observaciones) {
		super();
		IdTratamiento = idTratamiento;
		FechaIniciada = fechaIniciada;
		FechaFinalizada = fechaFinalizada;
		IdDiagnostico = idDiagnostico;
		DNI = dNI;
		IdUsuario = idUsuario;
		Fecha_Del_tratamiento = fecha_Del_tratamiento;
		Observaciones = observaciones;
	}
	
	public Tratamiento() 
	{
		
	}
	
	public int getIdTratamiento() {
		return IdTratamiento;
	}
	public void setIdTratamiento(int idTratamiento) {
		IdTratamiento = idTratamiento;
	}
	public Date getFechaIniciada() {
		return FechaIniciada;
	}
	public void setFechaIniciada(Date fechaIniciada) {
		FechaIniciada = fechaIniciada;
	}
	public Date getFechaFinalizada() {
		return FechaFinalizada;
	}
	public void setFechaFinalizada(Date fechaFinalizada) {
		FechaFinalizada = fechaFinalizada;
	}
	public int getIdDiagnostico() {
		return IdDiagnostico;
	}
	public void setIdDiagnostico(int idDiagnostico) {
		IdDiagnostico = idDiagnostico;
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
	public Date getFecha_Del_tratamiento() {
		return Fecha_Del_tratamiento;
	}
	public void setFecha_Del_tratamiento(Date fecha_Del_tratamiento) {
		Fecha_Del_tratamiento = fecha_Del_tratamiento;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

}
