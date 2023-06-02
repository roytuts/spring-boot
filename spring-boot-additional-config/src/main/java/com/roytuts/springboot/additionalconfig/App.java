package com.roytuts.springboot.additionalconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
	
	@Value("${server.port}")
	private int port;

	@Value("${hi}")
	private String hi;

	@Value("${hello}")
	private String hello;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("server.port => " + port);
		System.out.println("hi => " + hi + ", hello => " + hello);
	}

}
