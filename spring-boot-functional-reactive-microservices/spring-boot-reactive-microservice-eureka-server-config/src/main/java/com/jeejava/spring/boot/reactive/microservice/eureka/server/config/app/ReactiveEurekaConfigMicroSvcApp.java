package com.jeejava.spring.boot.reactive.microservice.eureka.server.config.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ReactiveEurekaConfigMicroSvcApp {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveEurekaConfigMicroSvcApp.class, args);
	}

}
