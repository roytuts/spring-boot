package com.roytuts.spring.boot.reload.changes.without.server.restart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping("/greet")
	public String greet() {
		return "Greetings, Welcome!";
	}

}
