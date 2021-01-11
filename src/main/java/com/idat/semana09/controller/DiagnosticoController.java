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

import com.idat.semana09.dao.IDiagnosticoDao;
import com.idat.semana09.model.Diagnostico;



@RestController
@RequestMapping("/Diagnosticos")
public class DiagnosticoController {

	@Autowired
	private IDiagnosticoDao dao;
	

	@GetMapping
	public ResponseEntity<List<Diagnostico>> listar() throws IOException
	{
		List<Diagnostico> lista= dao.listarDiagnostico();
		if (lista == null)
		{
			lista= new ArrayList<Diagnostico>();
		}
		return new ResponseEntity<List<Diagnostico>>(lista,HttpStatus.OK);
	}
	
	
	
	
	
	
}
