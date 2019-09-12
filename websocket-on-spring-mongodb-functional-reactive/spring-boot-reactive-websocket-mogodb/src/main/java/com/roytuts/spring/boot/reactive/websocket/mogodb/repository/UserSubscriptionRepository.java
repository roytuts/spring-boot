package com.roytuts.spring.boot.reactive.websocket.mogodb.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.roytuts.spring.boot.reactive.websocket.mogodb.entity.UserSubscription;

public interface UserSubscriptionRepository extends ReactiveMongoRepository<UserSubscription, String> {

}
