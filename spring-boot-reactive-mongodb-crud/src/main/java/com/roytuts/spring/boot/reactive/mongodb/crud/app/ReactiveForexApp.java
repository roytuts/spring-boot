package com.roytuts.spring.boot.reactive.mongodb.crud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EntityScan("com.roytuts.spring.boot.reactive.mongodb.crud.entity")
@EnableReactiveMongoRepositories("com.roytuts.spring.boot.reactive.mongodb.crud.repository")
@SpringBootApplication(scanBasePackages = "com.roytuts.spring.boot.reactive.mongodb.crud")
public class ReactiveForexApp {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveForexApp.class, args);
	}

}
