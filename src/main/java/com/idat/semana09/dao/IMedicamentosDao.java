package com.idat.semana09.dao;

import java.util.List;

import com.idat.semana09.model.Medicamentos;

public interface IMedicamentosDao {

	
	Medicamentos registrar(Medicamentos med);
	
	Medicamentos modificar(Medicamentos med);
	
	boolean eliminar(int id);
	
	List<Medicamentos> listar();
	
	void transaccion_eliminar(Medicamentos p);
	
	
	
	
	
	
	
}
