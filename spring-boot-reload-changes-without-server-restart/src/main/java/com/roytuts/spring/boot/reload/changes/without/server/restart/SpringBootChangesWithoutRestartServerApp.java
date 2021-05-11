package com.roytuts.spring.boot.reload.changes.without.server.restart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootChangesWithoutRestartServerApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootChangesWithoutRestartServerApp.class, args);
	}

}