package com.jeejava.audit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jeejava.audit")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
