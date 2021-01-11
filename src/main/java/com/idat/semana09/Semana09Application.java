package com.idat.semana09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Semana09Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Semana09Application.class, args);
	}

	private static Class<Semana09Application> applicationClass= Semana09Application.class;
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(applicationClass);
	}
	
	
	
}
