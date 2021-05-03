package com.roytuts.spring.lookup.method.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLookupMethodInjectionApp implements CommandLineRunner {

	@Autowired
	private BeanA beanA;

	public static void main(String[] args) {
		SpringApplication.run(SpringLookupMethodInjectionApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		beanA.greetA();
		beanA.greetA();
	}

}
