package com.roytuts.spring.boot.security.form.based.authentication.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringSecurityController {

	@GetMapping("/")
	public String defaultPage(Model model) {
		model.addAttribute("msg", "Welcome to Spring Security");
		return "index";
	}

	@GetMapping("/login")
	public String loginPage(Model model, @RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		if (error != null) {
			model.addAttribute("error", "Invalid Credentials");
		}
		if (logout != null) {
			model.addAttribute("msg", "You have been successfully logged out");
		}
		return "login";
	}

	@GetMapping("/logout")
	public String logoutPage(Model model, HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/login?logout";
	}

	@GetMapping("/admin")
	public String adminPage(Model model) {
		model.addAttribute("title", "Administrator Control Panel");
		model.addAttribute("message", "This page demonstrates how to use Spring security");
		return "admin";
	}

}
