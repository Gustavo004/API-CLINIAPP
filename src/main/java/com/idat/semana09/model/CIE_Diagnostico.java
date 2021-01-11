package com.idat.semana09.model;

public class CIE_Diagnostico {

	private int IdCIE10;
	private int IdDiagnostico;
	
	
	public CIE_Diagnostico(int idCIE10, int idDiagnostico) {
		super();
		IdCIE10 = idCIE10;
		IdDiagnostico = idDiagnostico;
	}
	
	public CIE_Diagnostico() 
	{
		
	}
	
	public int getIdCIE10() {
		return IdCIE10;
	}
	public void setIdCIE10(int idCIE10) {
		IdCIE10 = idCIE10;
	}
	public int getIdDiagnostico() {
		return IdDiagnostico;
	}
	public void setIdDiagnostico(int idDiagnostico) {
		IdDiagnostico = idDiagnostico;
	}
	
	
	
	
	
	
	
}
