package com.roytuts.spring.lookup.method.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BeanA {

	// @Autowired
	// private BeanB beanB;
	
	public void greetA() {
		System.out.println("beanB: " + beanB());
		System.out.println("Msg: " + beanB().greetB());
	}

	@Lookup
	public BeanB beanB() {
		return null;
	}

}
