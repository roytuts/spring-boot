package com.roytuts.sso.oauth2.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.roytuts.sso.oauth2")
public class SsoOAuth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SsoOAuth2Application.class, args);
	}

}
