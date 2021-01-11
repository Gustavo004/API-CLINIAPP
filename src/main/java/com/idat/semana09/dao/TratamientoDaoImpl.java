package com.idat.semana09.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import com.idat.semana09.model.Tratamiento;


@Repository
public class TratamientoDaoImpl extends JdbcDaoSupport implements ITratamientoDao {

	
	@Autowired
	public TratamientoDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	
	@Override
	public Tratamiento registrar(Tratamiento trat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tratamiento modificar(Tratamiento trat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Tratamiento trat) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Tratamiento> listarTratamiento() {
		
		String sql="SELECT IdTratamiento,FechaIniciada,FechaFinalizada,IdDiagnostico,DNI,IdUsuario,Fecha_Del_tratamiento,Observaciones	FROM Tratamiento";
		
		List<Tratamiento>lista=getJdbcTemplate().
				query(sql,(rs,rowNum)->
				new Tratamiento(rs.getInt("IdTratamiento"),
								rs.getDate("FechaIniciada"),
								rs.getDate("FechaFinalizada"),
								rs.getInt("IdDiagnostico"),
								rs.getInt("DNI"),
								rs.getInt("IdUsuario"),
								rs.getDate("Fecha_Del_tratamiento"),
								rs.getString("Observaciones") ));
		
		
		
		return lista;
	}

	@Override
	public void transaccion_eliminar(Tratamiento trat) {
		// TODO Auto-generated method stub
		
	}

}
