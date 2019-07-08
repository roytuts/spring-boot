package com.jeejava.spring.boot.mongodb.crud.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeejava.spring.boot.mongodb.crud.entity.User;
import com.jeejava.spring.boot.mongodb.crud.repository.UserRepository;
import com.jeejava.spring.boot.mongodb.crud.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<UserVo> getUserList() {
		return repository.findAll().stream().map(u -> {
			UserVo vo = new UserVo();
			vo.setId(u.getId());
			vo.setName(u.getName());
			vo.setEmail(u.getEmail());
			return vo;
		}).collect(Collectors.toList());
	}

	public UserVo getUserById(String id) {
		return repository.findById(id).map(u -> {
			UserVo vo = new UserVo();
			vo.setId(u.getId());
			vo.setName(u.getName());
			vo.setEmail(u.getEmail());
			return vo;
		}).orElse(null);
	}

	public void saveUser(UserVo vo) {
		User user = new User();
		user.setName(vo.getName());
		user.setEmail(vo.getEmail());
		user.setPwd(vo.getPwd());
		repository.save(user);
	}

	public void updateUser(UserVo vo) {
		User user = new User();
		user.setId(vo.getId());
		user.setName(vo.getName());
		user.setEmail(vo.getEmail());
		user.setPwd(vo.getPwd());
		repository.save(user);
	}

	public void deleteUser(UserVo vo) {
		User user = new User();
		user.setId(vo.getId());
		repository.delete(user);
	}

}
