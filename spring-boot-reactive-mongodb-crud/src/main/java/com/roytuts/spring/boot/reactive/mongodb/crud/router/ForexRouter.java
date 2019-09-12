package com.roytuts.spring.boot.reactive.mongodb.crud.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.roytuts.spring.boot.reactive.mongodb.crud.handler.ForexHandler;

@Configuration
public class ForexRouter {

	@Bean
	public RouterFunction<ServerResponse> route(ForexHandler handler) {
		return RouterFunctions
				.route(RequestPredicates.GET("/forex").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
						handler::getForexList)
				.andRoute(
						RequestPredicates.GET("/forex/{id}").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
						handler::getForexById)
				.andRoute(RequestPredicates.POST("/forex").and(RequestPredicates.accept(MediaType.APPLICATION_JSON))
						.and(RequestPredicates.contentType(MediaType.APPLICATION_JSON)), handler::addForex)
				.andRoute(RequestPredicates.PUT("/forex").and(RequestPredicates.accept(MediaType.APPLICATION_JSON))
						.and(RequestPredicates.contentType(MediaType.APPLICATION_JSON)), handler::updateForex)
				.andRoute(RequestPredicates.DELETE("/forex").and(RequestPredicates.accept(MediaType.APPLICATION_JSON))
						.and(RequestPredicates.contentType(MediaType.APPLICATION_JSON)), handler::deleteForex);
	}

}
