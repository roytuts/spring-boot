package com.roytuts.spring.service.layer.bean.validation.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.spring.service.layer.bean.validation.service.GreetingService;
import com.roytuts.spring.service.layer.bean.validation.vo.User;

@RestController
public class GreetingRestController {

	@Autowired
	private GreetingService service;

	@PostMapping("/greet")
	public Object getGreetingMsg(@RequestBody User user) {
		return service.getGreetingMsg(user);
	}

}
