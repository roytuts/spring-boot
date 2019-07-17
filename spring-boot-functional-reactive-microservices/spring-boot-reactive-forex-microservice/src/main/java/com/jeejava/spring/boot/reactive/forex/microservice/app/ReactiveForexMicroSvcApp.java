package com.jeejava.spring.boot.reactive.forex.microservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableDiscoveryClient
@EntityScan("com.jeejava.spring.boot.reactive.forex.microservice.entity")
@EnableReactiveMongoRepositories("com.jeejava.spring.boot.reactive.forex.microservice.repository")
@SpringBootApplication(scanBasePackages = "com.jeejava.spring.boot.reactive.forex.microservice")
public class ReactiveForexMicroSvcApp {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveForexMicroSvcApp.class, args);
	}

}
