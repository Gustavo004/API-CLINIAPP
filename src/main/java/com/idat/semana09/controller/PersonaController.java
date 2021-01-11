package com.idat.semana09.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.semana09.dao.IPersonaDao;
import com.idat.semana09.model.Persona;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private IPersonaDao dao;
	
	@GetMapping
	public ResponseEntity<List<Persona>> listar() throws IOException
	{
		List<Persona> lista= dao.listar();
		if (lista == null)
		{
			lista= new ArrayList<Persona>();
		}
		return new ResponseEntity<List<Persona>>(lista,HttpStatus.OK);
	}
	
	@PostMapping(value="crear")
	public ResponseEntity<Persona> registrar(@RequestBody Persona p)
	{
		Persona _p=dao.registrar(p);
		if (_p==null)
			return new ResponseEntity<Persona>(HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<Persona>(_p,HttpStatus.CREATED);
	}
	
	@PutMapping(value="modificar")
	public ResponseEntity<Persona> modificar(@RequestBody Persona p)
	{
		Persona _p=dao.modificar(p);
		if (_p==null)
			return new ResponseEntity<Persona>(HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<Persona>(_p,HttpStatus.OK);
	}
	
	@DeleteMapping(value="eliminar/{id}")
	public boolean eliminar(@PathVariable("id") Long id)
	{
		return dao.eliminar(id);
	}
	
	@DeleteMapping(value = "eliTransaccion")
	public boolean eliminar_t(@RequestBody Persona p)
	{
		dao.transaccion_eliminar(p);
		return true;
	}
	
	
	
	
	
	
}
