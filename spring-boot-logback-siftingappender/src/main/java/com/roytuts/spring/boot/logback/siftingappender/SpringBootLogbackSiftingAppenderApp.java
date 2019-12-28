package com.roytuts.spring.boot.logback.siftingappender;

import org.apache.logging.log4j.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLogbackSiftingAppenderApp implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(SpringBootLogbackSiftingAppenderApp.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLogbackSiftingAppenderApp.class, args);
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
		
		MDC.put("module", "MDC");
		LOG.debug("Debug Message");
		LOG.warn("Warn Message");
		LOG.error("Error Message");
		LOG.info("Info Message");
		LOG.trace("Trace Message");

		MDC.remove("MDC");		

		ThreadContext.put("module", "Module1");
		LOG.debug("Module1 Debug Message");
		LOG.warn("Module1 Warn Message");
		LOG.error("Module1 Error Message");
		LOG.info("Module1 Info Message");

		ThreadContext.put("module", "Module2");
		LOG.debug("Module2 Debug Message");
		LOG.warn("Module2 Warn Message");
		LOG.error("Module2 Error Message");
		LOG.info("Module2 Info Message");

		ThreadContext.remove("module");
	}

}
