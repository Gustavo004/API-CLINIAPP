package com.idat.semana09.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.idat.semana09.model.Seguro;

@Repository
public class SeguroDaoImpl extends JdbcDaoSupport implements ISeguroDao {

	@Autowired
	public SeguroDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Seguro registrar(Seguro s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seguro modificar(Seguro s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Seguro s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Seguro> listarSeguros() {

		String sql = "select IdSeguro,Nombre from Seguro";
		List<Seguro> lista = getJdbcTemplate().query(sql,
				(rs, rowNum) -> new Seguro(rs.getInt("IdSeguro"), rs.getString("Nombre")));
		


		return lista;

	}

	@Override
	public void transaccion_eliminar(Seguro s) {
		// TODO Auto-generated method stub

	}

}
