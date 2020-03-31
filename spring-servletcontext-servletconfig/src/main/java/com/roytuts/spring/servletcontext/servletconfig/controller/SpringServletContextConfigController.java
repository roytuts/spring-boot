package com.roytuts.spring.servletcontext.servletconfig.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.context.ServletContextAware;

@Controller
@RequestMapping("/controller")
public class SpringServletContextConfigController implements ServletConfigAware, ServletContextAware {

	private ServletConfig servletConfig;
	private ServletContext servletContext;

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	@Override
	public void setServletConfig(ServletConfig servletConfig) {
		this.servletConfig = servletConfig;
	}

	@RequestMapping("/servlet/config")
	public ResponseEntity<String> getServletConfig() {
		System.out.println("Servlet Config: " + servletConfig);
		return new ResponseEntity<String>("Servlet Config: " + servletConfig, HttpStatus.OK);
	}

	@RequestMapping("/servlet/context")
	public ResponseEntity<String> getServletContext() {
		return new ResponseEntity<String>("Servlet Context: " + servletContext, HttpStatus.OK);
	}
}
