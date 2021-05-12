package com.roytuts.spring.service.layer.bean.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.service.layer.bean.validation.vo.User;

@Service
public class GreetingService {

	@Autowired
	private Validator validator;

	public String getGreetingMsg(@Valid User user) {
		Set<ConstraintViolation<User>> violations = validator.validate(user);

		if (!violations.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for (ConstraintViolation<User> constraintViolation : violations) {
				sb.append(constraintViolation.getMessage());
			}

			throw new ConstraintViolationException("Error occurred: " + sb.toString(), violations);
		}

		return "Hi " + user.getName() + ", Good Morning!";
	}

}
