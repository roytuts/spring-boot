package com.roytuts.spring.sse.push.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.roytuts.spring.sse.push.notification")
public class SpringSsePushNotificationApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringSsePushNotificationApp.class, args);
	}

}
