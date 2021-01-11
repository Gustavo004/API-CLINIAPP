package com.idat.semana09.dao;

import java.util.List;

import com.idat.semana09.model.HistoriaMedica;

public interface IHistoriaMedicaDao {

	
	HistoriaMedica registrar(HistoriaMedica his_med);
	
	HistoriaMedica modificar(HistoriaMedica his_med);
	
	boolean eliminar(HistoriaMedica his_med);
	
	List<HistoriaMedica>listarHistoriaMedica();
	
	//Metodo para una transaccion;
	void transaccion_eliminar(HistoriaMedica his_med);
	
	
	
	
	
	
}
