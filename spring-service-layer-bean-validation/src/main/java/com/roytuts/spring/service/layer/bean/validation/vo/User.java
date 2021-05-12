package com.roytuts.spring.service.layer.bean.validation.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class User {

	@NotEmpty(message = "Name is required field")
	@NotNull(message = "Name is required field")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
