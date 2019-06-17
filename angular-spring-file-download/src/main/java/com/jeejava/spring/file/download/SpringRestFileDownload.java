package com.jeejava.spring.file.download;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.jeejava.spring.file.download.entity")
@EnableJpaRepositories("com.jeejava.spring.file.download.repository")
@SpringBootApplication(scanBasePackages = "com.jeejava.spring.file.download")
public class SpringRestFileDownload {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestFileDownload.class, args);
	}

}
