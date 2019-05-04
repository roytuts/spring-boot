package com.jeejava.forex.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@EntityScan("com.jeejava.forex.entity")
@EnableJpaRepositories("com.jeejava.forex.repository")
@SpringBootApplication(scanBasePackages = "com.jeejava.forex")
public class ForexApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexApplication.class, args);
	}

}
