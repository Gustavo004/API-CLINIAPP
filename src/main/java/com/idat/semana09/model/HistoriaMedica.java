package com.idat.semana09.model;

import java.util.Date;

public class HistoriaMedica {

	private int IdHistoriaMedica;
	private String TipoSangre;
	private String Pulso;
	private String TemperaturaCorporal;
	private String Presion;
	private int Peso;
	private int DNI;
	private int IdMedicamentos;
	private int IdDiagnostico;
	private Date Fecha_De_La_Historia_Medica;
		
	public HistoriaMedica(int idHistoriaMedica, String tipoSangre, String pulso, String temperaturaCorporal,
			String presion, int peso, int dNI, int idMedicamentos, int idDiagnostico,
			Date fecha_De_La_Historia_Medica) {
		super();
		IdHistoriaMedica = idHistoriaMedica;
		TipoSangre = tipoSangre;
		Pulso = pulso;
		TemperaturaCorporal = temperaturaCorporal;
		Presion = presion;
		Peso = peso;
		DNI = dNI;
		IdMedicamentos = idMedicamentos;
		IdDiagnostico = idDiagnostico;
		Fecha_De_La_Historia_Medica = fecha_De_La_Historia_Medica;
	}
	
	public HistoriaMedica() 
	{
		
	}
	public int getIdHistoriaMedica() {
		return IdHistoriaMedica;
	}

	public void setIdHistoriaMedica(int idHistoriaMedica) {
		IdHistoriaMedica = idHistoriaMedica;
	}

	public String getTipoSangre() {
		return TipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		TipoSangre = tipoSangre;
	}

	public String getPulso() {
		return Pulso;
	}

	public void setPulso(String pulso) {
		Pulso = pulso;
	}

	public String getTemperaturaCorporal() {
		return TemperaturaCorporal;
	}

	public void setTemperaturaCorporal(String temperaturaCorporal) {
		TemperaturaCorporal = temperaturaCorporal;
	}

	public String getPresion() {
		return Presion;
	}

	public void setPresion(String presion) {
		Presion = presion;
	}

	public int getPeso() {
		return Peso;
	}

	public void setPeso(int peso) {
		Peso = peso;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public int getIdMedicamentos() {
		return IdMedicamentos;
	}

	public void setIdMedicamentos(int idMedicamentos) {
		IdMedicamentos = idMedicamentos;
	}

	public int getIdDiagnostico() {
		return IdDiagnostico;
	}

	public void setIdDiagnostico(int idDiagnostico) {
		IdDiagnostico = idDiagnostico;
	}

	public Date getFecha_De_La_Historia_Medica() {
		return Fecha_De_La_Historia_Medica;
	}

	public void setFecha_De_La_Historia_Medica(Date fecha_De_La_Historia_Medica) {
		Fecha_De_La_Historia_Medica = fecha_De_La_Historia_Medica;
	}
		
}
