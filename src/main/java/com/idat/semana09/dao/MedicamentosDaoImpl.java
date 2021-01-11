package com.idat.semana09.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import com.idat.semana09.model.Medicamentos;

@Repository
public class MedicamentosDaoImpl extends JdbcDaoSupport implements IMedicamentosDao {

	@Autowired
	public MedicamentosDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Medicamentos registrar(Medicamentos med) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Medicamentos modificar(Medicamentos med) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Medicamentos> listar() {
		
		String sql= "SELECT IdMedicamentos,Nombre,Laboratorio,Composicion,Contradicciones,Precauciones FROM Medicamentos";
		
		 List<Medicamentos>lista=getJdbcTemplate().query(sql, (rs,rowNum)->
		 new Medicamentos
				 (rs.getInt("IdMedicamentos"), 
				  rs.getString("Nombre"), 
				  rs.getString("Laboratorio"),
				  rs.getString("Composicion"),
				  rs.getString("Contradicciones"),
				  rs.getString("Precauciones") ) );
		
		return lista;
	}

	@Override
	public void transaccion_eliminar(Medicamentos p) {
		// TODO Auto-generated method stub

	}

}
