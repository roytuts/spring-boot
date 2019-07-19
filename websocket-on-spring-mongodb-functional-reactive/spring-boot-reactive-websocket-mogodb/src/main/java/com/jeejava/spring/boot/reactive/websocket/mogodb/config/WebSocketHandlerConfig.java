package com.jeejava.spring.boot.reactive.websocket.mogodb.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.reactive.HandlerMapping;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.server.WebSocketService;
import org.springframework.web.reactive.socket.server.support.HandshakeWebSocketService;
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter;
import org.springframework.web.reactive.socket.server.upgrade.ReactorNettyRequestUpgradeStrategy;

import com.jeejava.spring.boot.reactive.websocket.mogodb.handler.UserSubscriptionWebSocketHandler;

@Configuration
public class WebSocketHandlerConfig {

	@Autowired
	private UserSubscriptionWebSocketHandler userSubscriptionWebSocketHandler;

	@Bean
	public HandlerMapping handlerMapping() {
		Map<String, WebSocketHandler> map = new HashMap<>();
		map.put("/subscribe", userSubscriptionWebSocketHandler);

		SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
		mapping.setUrlMap(map);
		mapping.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return mapping;
	}

	@Bean
	public WebSocketHandlerAdapter handlerAdapter(WebSocketService webSocketService) {
		return new WebSocketHandlerAdapter(webSocketService);
	}

	@Bean
	public WebSocketService webSocketService() {
		// TomcatRequestUpgradeStrategy strategy = new TomcatRequestUpgradeStrategy();
		ReactorNettyRequestUpgradeStrategy strategy = new ReactorNettyRequestUpgradeStrategy();
		// strategy.setMaxSessionIdleTimeout(0L); //for Tomcat server
		return new HandshakeWebSocketService(strategy);
	}

}
