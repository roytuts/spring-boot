package com.roytuts.spring.boot.reactive.currency.conversion.microservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients("com.roytuts.spring.boot.reactive.currency.conversion.microservice.proxy")
@SpringBootApplication(scanBasePackages = "com.roytuts.spring.boot.reactive.currency.conversion.microservice")
public class ReactiveCurrencyConversionMicroSvcApp {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveCurrencyConversionMicroSvcApp.class, args);
	}

}
