package com.roytuts.spring.boot.jquery.multistep.form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void save(final User user) {
		userRepository.save(user);
	}

}
