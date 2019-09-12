package com.roytuts.audit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.roytuts.audit")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
