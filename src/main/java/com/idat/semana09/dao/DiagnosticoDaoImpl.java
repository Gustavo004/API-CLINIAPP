package com.idat.semana09.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.idat.semana09.model.Diagnostico;

@Repository
public class DiagnosticoDaoImpl extends JdbcDaoSupport implements IDiagnosticoDao {

	
	
	public DiagnosticoDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	@Override
	public Diagnostico registrar(Diagnostico diag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Diagnostico modificar(Diagnostico diag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Diagnostico diag) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Diagnostico> listarDiagnostico() {
		
		
		String sql = "SELECT IdDiagnostico,Observaciones,Estado,Fecha_Diagnostico,DNI_Paciente,Id_Usuario_Dr FROM Diagnostico";
		
		List<Diagnostico>lista=getJdbcTemplate().query(sql, (rs,Rownum)
				->new Diagnostico(rs.getInt("IdDiagnostico"),
								  rs.getString("Observaciones"),
								  rs.getString("Estado"),
								  rs.getDate("Fecha_Diagnostico"),
								  rs.getInt("DNI_Paciente"),
								  rs.getInt("Id_Usuario_Dr")	
								  ));
		return lista;
	}

	@Override
	public void transaccion_eliminar(Diagnostico diag) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
}
