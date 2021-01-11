package com.idat.semana09.dao;

import java.util.List;

import com.idat.semana09.model.Persona;

public interface IPersonaDao {

	Persona registrar(Persona p);
	
	Persona modificar(Persona p);
	
	boolean eliminar(Long id);
	
	List<Persona> listar();
	
	void transaccion_eliminar(Persona p);
	
}
