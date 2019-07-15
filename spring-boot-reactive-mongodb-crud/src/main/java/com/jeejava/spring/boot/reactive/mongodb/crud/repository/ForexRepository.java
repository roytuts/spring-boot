package com.jeejava.spring.boot.reactive.mongodb.crud.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.jeejava.spring.boot.reactive.mongodb.crud.entity.Forex;

public interface ForexRepository extends ReactiveCrudRepository<Forex, String> {

}
