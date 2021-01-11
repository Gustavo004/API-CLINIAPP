package com.idat.semana09.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.semana09.dao.IHistoriaMedicaDao;
import com.idat.semana09.model.HistoriaMedica;


@RestController
@RequestMapping("/HistoriasMedicas")
public class HistoriaMedicaController {

	@Autowired
	private IHistoriaMedicaDao dao;
	
	@GetMapping
	public ResponseEntity<List<HistoriaMedica>> listar() throws IOException
	{
		List<HistoriaMedica> lista= dao.listarHistoriaMedica();
		if (lista == null)
		{
			lista= new ArrayList<HistoriaMedica>();
		}
		return new ResponseEntity<List<HistoriaMedica>>(lista,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
}
