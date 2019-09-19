package com.roytuts.web.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.roytuts")
public class WebServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApp.class, args);
	}

}
