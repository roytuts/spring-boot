package com.roytuts.spring.servletcontext.servletconfig.rest.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/controller")
public class SpringServletContextConfigRestController {

	@Autowired
	private ServletConfig servletConfig;

	@Autowired
	private ServletContext servletContext;

	@GetMapping("/servlet/config")
	public ResponseEntity<String> getServletConfig() {
		return new ResponseEntity<String>("Servlet Config: " + servletConfig, HttpStatus.OK);
	}

	@GetMapping("/servlet/context")
	public ResponseEntity<String> getServletContext() {
		return new ResponseEntity<String>("Servlet Context: " + servletContext, HttpStatus.OK);
	}
}
