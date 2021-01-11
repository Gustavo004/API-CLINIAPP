package com.idat.semana09.dao;

import java.util.List;

import com.idat.semana09.model.Diagnostico;;

public interface IDiagnosticoDao {

	
	
	Diagnostico registrar(Diagnostico diag);
	
	Diagnostico modificar(Diagnostico diag);
	
	boolean eliminar(Diagnostico diag);
	
	List<Diagnostico>listarDiagnostico();
	
	//Metodo para una transaccion;
	void transaccion_eliminar(Diagnostico diag);
	
	
	
	
	
	
	
	
	
}
