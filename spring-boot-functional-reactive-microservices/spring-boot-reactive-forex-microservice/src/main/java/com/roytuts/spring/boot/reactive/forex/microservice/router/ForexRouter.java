package com.roytuts.spring.boot.reactive.forex.microservice.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.roytuts.spring.boot.reactive.forex.microservice.handler.ForexHandler;

@Configuration
public class ForexRouter {

	@Bean
	public RouterFunction<ServerResponse> route(ForexHandler handler) {
		return RouterFunctions.route(RequestPredicates.GET("/forex/fromCur/{fromCur}/toCur/{toCur}")
				.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::getForexByFromCurToCur);
	}

}
