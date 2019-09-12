package com.roytuts.spring.boot.reactive.currency.conversion.microservice.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.roytuts.spring.boot.reactive.currency.conversion.microservice.handler.CurrencyConversionHandler;

@Configuration
public class CurrencyConversionRouter {

	@Bean
	public RouterFunction<ServerResponse> route(CurrencyConversionHandler handler) {
		return RouterFunctions.route(RequestPredicates.GET("/currency-exchange/from/{from}/to/{to}/quantity/{quantity}")
				.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::getCurrencyExchange);
	}

}
