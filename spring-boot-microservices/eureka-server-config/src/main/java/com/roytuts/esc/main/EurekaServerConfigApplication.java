package com.roytuts.esc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerConfigApplication.class, args);
	}

}
