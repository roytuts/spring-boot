package com.jeejava.spring.boot.reactive.forex.microservice.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.jeejava.spring.boot.reactive.forex.microservice.entity.Forex;

import reactor.core.publisher.Mono;

public interface ForexRepository extends ReactiveCrudRepository<Forex, String> {

	Mono<Forex> findByFromCurAndToCur(String fromCur, String toCur);

}
