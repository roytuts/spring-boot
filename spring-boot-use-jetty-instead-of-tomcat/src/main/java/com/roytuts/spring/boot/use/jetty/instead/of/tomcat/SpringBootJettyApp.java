package com.roytuts.spring.boot.use.jetty.instead.of.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootJettyApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJettyApp.class, args);
	}

	@GetMapping("/")
	public ResponseEntity<String> msg() {
		return new ResponseEntity<String>("Using Jetty instead of Tomcat Server", HttpStatus.OK);
	}

}
