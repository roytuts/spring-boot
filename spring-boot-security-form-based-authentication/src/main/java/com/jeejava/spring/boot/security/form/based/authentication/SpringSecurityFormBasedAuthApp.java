package com.jeejava.spring.boot.security.form.based.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jeejava.spring.boot.security.form.based.authentication")
public class SpringSecurityFormBasedAuthApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityFormBasedAuthApp.class, args);
	}

}
