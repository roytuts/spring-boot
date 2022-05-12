package com.roytuts.spring.boot.jquery.multistep.form;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String showUserForm(User user) {
		return "index";
	}

	@PostMapping("/")
	public String validateUserForm(@Valid User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "index";
		}

		userService.save(user);

		return "redirect:/success";
	}

	@ResponseBody
	@GetMapping("/success")
	public String success() {
		return "User data successfully saved!";
	}

}
