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
import com.idat.semana09.dao.ITratamientoDao;
import com.idat.semana09.model.Tratamiento;

@RestController
@RequestMapping("/Tratamientos")
public class TratamientoController {

	
	@Autowired
	private ITratamientoDao dao;
	
	
	
	@GetMapping
	public ResponseEntity<List<Tratamiento>> listar() throws IOException
	{
		List<Tratamiento> lista= dao.listarTratamiento();
		if (lista == null)
		{
			lista= new ArrayList<Tratamiento>();
		}
		return new ResponseEntity<List<Tratamiento>>(lista,HttpStatus.OK);
	}
	
	
	
	
	
	
	
}
