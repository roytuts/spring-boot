package com.roytuts.spring.internationalization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringInternationalizationController {

	@GetMapping("/")
	public String view() {
		return "i18n";
	}

}
