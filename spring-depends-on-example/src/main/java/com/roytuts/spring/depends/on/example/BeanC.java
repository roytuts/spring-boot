package com.roytuts.spring.depends.on.example;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn(value = { "beanB" })
public class BeanC {

    public BeanC() {
        System.out.println("BeanC is initialized.");
    }

}
