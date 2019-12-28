package com.roytuts.spring.boot.logback;

import org.apache.logging.log4j.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLogbackApp implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(SpringBootLogbackApp.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLogbackApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		printLog();
	}

	private static void printLog() {
		LOG.debug("Debug Message");
		LOG.warn("Warn Message");
		LOG.error("Error Message");
		LOG.info("Info Message");
		LOG.trace("Trace Message");
	}

}
