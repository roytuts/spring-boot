package com.roytuts.spring.file.download;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.roytuts.spring.file.download.entity")
@EnableJpaRepositories("com.roytuts.spring.file.download.repository")
public class SpringRestFileDownload {
	public static void main(String[] args) {
		SpringApplication.run(SpringRestFileDownload.class, args);
	}
}