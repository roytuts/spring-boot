package com.jeejava.spring.boot.mongodb.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jeejava.spring.boot.mongodb.crud.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

}
