package com.roytuts.web.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.email.service.EmailService;
import com.roytuts.user.service.UserService;
import com.roytuts.user.service.model.User;

@RestController
public class WebRestController {

	@Autowired
	private EmailService emailService;

	@Autowired
	private UserService userService;

	@GetMapping("user/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@PostMapping("user/")
	public ResponseEntity<String> sendEmail(@RequestBody User user) {
		userService.sendEmail(user);
		return new ResponseEntity<>("Email Successfully sent", HttpStatus.OK);
	}

	@PostMapping("email/{toAddress}")
	public ResponseEntity<Void> sendEmail(@PathVariable String toAddress) {
		emailService.sendEmail(toAddress);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
