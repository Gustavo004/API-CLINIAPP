package com.idat.semana09.dao;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.idat.semana09.model.Persona;

@Repository
public class PersonaDaoImpl extends JdbcDaoSupport implements IPersonaDao {

	@Autowired
	public PersonaDaoImpl(DataSource dataSource)
	{
		setDataSource(dataSource);
	}
	
	@Override
	public Persona registrar(Persona p) {
		String sql="insert into tbl_persona (apellidos,nombres,fecha_nac) values (?,?,?)";
		
		try {
			KeyHolder keyHolder= new GeneratedKeyHolder();
			getJdbcTemplate().update(connec->{
				PreparedStatement ps=connec.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
				ps.setString(1,p.getApellidos());
				ps.setString(2,p.getNombres());
				ps.setString(3,p.getFechaNac());
				return ps;
			},keyHolder);
			BigDecimal id= (BigDecimal)keyHolder.getKey();
			p.setIdPersona(id.longValue());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public Persona modificar(Persona p) {
		String sql = "update tbl_persona set apellidos=? , nombres = ?, fecha_nac = ? where id_persona=?";
		try {
			getJdbcTemplate().update(sql, new Object[] {p.getApellidos(),
														p.getNombres(),
														p.getFechaNac(), 
														p.getIdPersona()});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public boolean eliminar(Long id) {
		boolean rpt= false;
		String sql = "delete from tbl_persona where id_persona=?";
		try {
			getJdbcTemplate().update(sql, new Object[] {id});
			rpt= true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rpt;
	}

	@Override
	public List<Persona> listar() {
		String sql="select id_persona, apellidos, nombres, fecha_nac from tbl_persona";
		List<Persona> lista= getJdbcTemplate().query(sql, (rs, rowNum)-> new Persona(rs.getLong("id_persona"), 
																					rs.getString("nombres"), 
																					rs.getString("apellidos"), 
																					rs.getString("fecha_nac")));
		
		return lista;
	}

	
	
	@Override
	@Transactional("transactionManager")
	public void transaccion_eliminar(Persona p) {
		
		String sql ="delete from tbl_persona where id_persona=?";
		getJdbcTemplate().update(sql,new Object[] {p.getIdPersona()});
		
		System.out.println("Elimino Registro");
		
		String sql2 = "update tbl_persona set apellidos=? , nombres = ?, fecha_nac2 = ? where id_persona=?";
		getJdbcTemplate().update(sql2, new Object[] {p.getApellidos(),
														p.getNombres(),
														p.getFechaNac(), 
														p.getIdPersona()});
		
		System.out.println("Actualizó Registro");
		
	}

	
	
}
