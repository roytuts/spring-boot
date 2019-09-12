package com.roytuts.spring.boot.mongodb.crud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EntityScan("com.roytuts.spring.boot.mongodb.crud.entity")
@EnableMongoRepositories("com.roytuts.spring.boot.mongodb.crud.repository")
@SpringBootApplication(scanBasePackages = "com.roytuts.spring.boot.mongodb.crud")
public class SpringMongoDbJpaCrudApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbJpaCrudApp.class, args);
	}

}
