package com.roytuts.spring.depends.on.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn(value = { "beanB", "beanC" })
public class BeanA {

    @Autowired
    private BeanB beanB;

    public BeanA() {
        System.out.println("Initializing BeanA");
    }

    public BeanB getBeanB() {
        return beanB;
    }

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

}
