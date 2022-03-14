package com.roytuts.spring.boot.application.properties.inheritance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Value("${app.key}")
	private String appKey;

	@Value("${app.inherit}")
	private String appInherit;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("appKey: " + appKey);
		System.out.println("appInherit: " + appInherit);
	}

}
