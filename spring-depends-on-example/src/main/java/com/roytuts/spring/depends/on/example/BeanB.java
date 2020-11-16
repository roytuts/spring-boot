package com.roytuts.spring.depends.on.example;

import org.springframework.stereotype.Component;

@Component
public class BeanB {

    private String name;

    public BeanB() {
        System.out.println("BeanB is initialized.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
