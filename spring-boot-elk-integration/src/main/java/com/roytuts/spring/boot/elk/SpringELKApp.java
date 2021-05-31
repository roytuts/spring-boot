package com.roytuts.spring.boot.elk;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringELKApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringELKApp.class, args);
	}

}

@RestController
class ELKRestController {

	private static final Logger LOG = LoggerFactory.getLogger(ELKRestController.class);

	@GetMapping("/hello")
	public ResponseEntity<String> greet() {
		LOG.info("Hello World!");

		return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
	}

	@GetMapping("/err")
	public ResponseEntity<String> error() {
		try {
			int i = 1 / 0; // exception occurs
			System.out.println(i);
		} catch (Exception e) {
			//e.printStackTrace();
			
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			
			LOG.error(sw.toString());

			String msg = e.getMessage();

			// LOG.error("Error Message: " + msg);

			return new ResponseEntity<String>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<String>("Ok", HttpStatus.OK);
	}

}