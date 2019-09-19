package com.roytuts.email.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.roytuts.email.service")
public class EmailServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApp.class, args);
	}

}
