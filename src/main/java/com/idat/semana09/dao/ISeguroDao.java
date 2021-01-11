package com.idat.semana09.dao;

import java.util.List;

import com.idat.semana09.model.Seguro;

public interface ISeguroDao {

	Seguro registrar(Seguro s);
	
	Seguro modificar(Seguro s);
	
	boolean eliminar(Seguro s);
	
	List<Seguro>listarSeguros();
	
	//Metodo para una transaccion;
	void transaccion_eliminar(Seguro s);
	
	
	
	
	
	
	
}
