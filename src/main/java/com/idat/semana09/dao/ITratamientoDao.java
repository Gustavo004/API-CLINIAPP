package com.idat.semana09.dao;

import java.util.List;

import com.idat.semana09.model.Tratamiento;;

public interface ITratamientoDao {

	
	
	Tratamiento registrar(Tratamiento trat);
	
	Tratamiento modificar(Tratamiento trat);
	
	boolean eliminar(Tratamiento trat);
	
	List<Tratamiento>listarTratamiento();
	
	//Metodo para una transaccion;
	void transaccion_eliminar(Tratamiento trat);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
