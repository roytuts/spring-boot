package com.jeejava.spring.boot.reactive.currency.conversion.microservice.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.jeejava.spring.boot.reactive.currency.conversion.microservice.proxy.CurrencyConversionProxy;
import com.jeejava.spring.boot.reactive.currency.conversion.microservice.vo.CurrencyExchange;

import reactor.core.publisher.Mono;

@Component
public class CurrencyConversionHandler {

	@Autowired
	private CurrencyConversionProxy proxy;

	public Mono<ServerResponse> getCurrencyExchange(ServerRequest request) {
		String fromCur = request.pathVariable("from");
		String toCur = request.pathVariable("to");
		Integer quantity = Integer.parseInt(request.pathVariable("quantity"));

		CurrencyExchange currencyExchange = proxy.getCurrency(fromCur, toCur);

		Mono<CurrencyExchange> mono = Mono.just(new CurrencyExchange(currencyExchange.getId(),
				currencyExchange.getFromCur(), currencyExchange.getToCur(), currencyExchange.getRateCur(), quantity,
				quantity * currencyExchange.getRateCur()));

		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(mono, CurrencyExchange.class)
				.switchIfEmpty(ServerResponse.notFound().build());
	}

}
