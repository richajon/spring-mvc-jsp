package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ServletInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(final ServletContext sc) throws ServletException {
//
//		AnnotationConfigWebApplicationContext root =
//				new AnnotationConfigWebApplicationContext();
//
//		root.scan("com.example.demo");
//		sc.addListener(new ContextLoaderListener(root));
//
//		ServletRegistration.Dynamic appServlet =
//					sc.addServlet("mvc", new DispatcherServlet(new GenericWebApplicationContext()));
//		appServlet.setLoadOnStartup(1);
//		appServlet.addMapping("/");
	}

}
