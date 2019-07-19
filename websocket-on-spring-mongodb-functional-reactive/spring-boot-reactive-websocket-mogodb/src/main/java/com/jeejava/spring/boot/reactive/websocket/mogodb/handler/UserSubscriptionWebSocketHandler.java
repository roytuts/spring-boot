package com.jeejava.spring.boot.reactive.websocket.mogodb.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;

import com.jeejava.spring.boot.reactive.websocket.mogodb.entity.UserSubscription;
import com.jeejava.spring.boot.reactive.websocket.mogodb.repository.UserSubscriptionRepository;

import reactor.core.publisher.Mono;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserSubscriptionWebSocketHandler implements WebSocketHandler {

	@Autowired
	private UserSubscriptionRepository repository;

	@Override
	public Mono<Void> handle(WebSocketSession session) {
		return session.send(
				session.receive().map(email -> new UserSubscription(email.getPayloadAsText())).flatMap(repository::save)
						.map(us -> session.textMessage(us.getEmail())));
	}

}
