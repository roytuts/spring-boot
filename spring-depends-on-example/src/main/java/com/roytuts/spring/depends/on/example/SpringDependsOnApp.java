package com.roytuts.spring.depends.on.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDependsOnApp implements CommandLineRunner {

    @Autowired
    private BeanA beanA;

    public static void main(String[] args) {
        SpringApplication.run(SpringDependsOnApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        beanA.getBeanB().setName("BeanB");

        System.out.println(beanA.getBeanB().getName());
    }

}
