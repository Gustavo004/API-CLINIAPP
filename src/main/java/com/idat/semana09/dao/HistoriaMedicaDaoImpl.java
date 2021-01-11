package com.idat.semana09.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.idat.semana09.model.HistoriaMedica;

@Repository
public class HistoriaMedicaDaoImpl extends JdbcDaoSupport implements IHistoriaMedicaDao {

	@Autowired
	public HistoriaMedicaDaoImpl(DataSource dataSource) {

		setDataSource(dataSource);
	}

	@Override
	public HistoriaMedica registrar(HistoriaMedica his_med) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HistoriaMedica modificar(HistoriaMedica his_med) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(HistoriaMedica his_med) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<HistoriaMedica> listarHistoriaMedica() {

		String sql = "SELECT IdHistoriaMedica,TipoSangre,Pulso,TemperaturaCorporal,Presion,Peso,DNI, \r\n"
				+ "IdMedicamentos,IdDiagnostico,Fecha_De_La_Historia_Medica\r\n" + "FROM HistoriaMedica;";

		List<HistoriaMedica> lista = getJdbcTemplate().query(sql,
				(rs, rowNum) -> new HistoriaMedica(rs.getInt("IdHistoriaMedica"), rs.getString("TipoSangre"),
						rs.getString("Pulso"), rs.getString("TemperaturaCorporal"), rs.getString("Presion"),
						rs.getInt("Peso"), rs.getInt("DNI"), rs.getInt("IdMedicamentos"), rs.getInt("IdDiagnostico"),
						rs.getDate("Fecha_De_La_Historia_Medica")));

		return lista;
	}

	@Override
	public void transaccion_eliminar(HistoriaMedica his_med) {
		// TODO Auto-generated method stub

	}

}
