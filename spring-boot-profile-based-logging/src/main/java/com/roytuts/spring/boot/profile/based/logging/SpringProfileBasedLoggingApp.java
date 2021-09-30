package com.roytuts.spring.boot.profile.based.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfileBasedLoggingApp implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(SpringProfileBasedLoggingApp.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringProfileBasedLoggingApp.class, args).close();
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.debug("Debug Message");
		LOG.warn("Warn Message");
		LOG.error("Error Message");
		LOG.info("Info Message");
		LOG.trace("Trace Message");
	}

}
