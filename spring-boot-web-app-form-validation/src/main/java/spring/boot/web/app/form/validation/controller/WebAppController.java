package spring.boot.web.app.form.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.boot.web.app.form.validation.dto.User;

@Controller
public class WebAppController {

	@GetMapping("/")
	public String showPage(User user) {
		return "form";
	}

	@PostMapping("/")
	public String validateUser(@Valid User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "form";
		}

		return "redirect:/success";
	}

	@ResponseBody
	@GetMapping("/success")
	public String success() {
		return "Your form was successfully validated!";
	}

}
