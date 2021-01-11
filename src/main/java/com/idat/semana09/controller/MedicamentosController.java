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
import com.idat.semana09.dao.IMedicamentosDao;
import com.idat.semana09.model.Medicamentos;


@RestController
@RequestMapping("/Medicamentos")
public class MedicamentosController {

	
	@Autowired
	private IMedicamentosDao dao;
	
	@GetMapping
	public ResponseEntity<List<Medicamentos>> listar() throws IOException
	{
		List<Medicamentos> lista= dao.listar();
		if (lista == null)
		{
			lista= new ArrayList<Medicamentos>();
		}
		return new ResponseEntity<List<Medicamentos>>(lista,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
}
