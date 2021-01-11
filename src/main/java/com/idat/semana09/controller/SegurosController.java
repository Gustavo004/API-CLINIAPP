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

import com.idat.semana09.dao.ISeguroDao;
import com.idat.semana09.model.Seguro;


@RestController
@RequestMapping("/Seguros")
public class SegurosController {

	@Autowired
	ISeguroDao dao;
	
	@GetMapping
	public ResponseEntity<List<Seguro>> listar() throws IOException
	{
		List<Seguro> lista= dao.listarSeguros();
		if (lista == null)
		{
			lista= new ArrayList<Seguro>();
		}
		return new ResponseEntity<List<Seguro>>(lista,HttpStatus.OK);
	}
	
	
	
	
	
	
}
