package com.idat.semana09;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@EnableTransactionManagement
public class ConexionBD {

	@Autowired
	private BaseDatosProperties properties;
	
	@Bean(name="dataSource")
	public DataSource dataSource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName(properties.getDriver());
		datasource.setUrl(properties.getUrl());
		datasource.setUsername(properties.getUsuario()    );
		datasource.setPassword(properties.getContrasenia());
		return datasource;
	}
	
	@Bean(name="transactionManager")
	public PlatformTransactionManager transactionManager()
	{
		return new DataSourceTransactionManager(dataSource());
	}
	
}
