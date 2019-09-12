package com.roytuts.spring.boot.reactive.forex.microservice.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.roytuts.spring.boot.reactive.forex.microservice.entity.Forex;
import com.roytuts.spring.boot.reactive.forex.microservice.repository.ForexRepository;
import com.roytuts.spring.boot.reactive.forex.microservice.vo.ForexVo;

import reactor.core.publisher.Mono;

@Component
public class ForexHandler {

	@Autowired
	private ForexRepository repository;

	public Mono<ServerResponse> getForexByFromCurToCur(ServerRequest request) {
		String fromCur = request.pathVariable("fromCur");
		String toCur = request.pathVariable("toCur");

		Mono<ServerResponse> notFound = ServerResponse.notFound().build();

		Mono<Forex> forex = repository.findByFromCurAndToCur(fromCur, toCur);

		Mono<ForexVo> forexVo = Mono.from(forex.map(f -> {
			return new ForexVo(f.getId(), f.getFromCur(), f.getToCur(), f.getRateCur());
		}));

		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(forexVo, ForexVo.class)
				.switchIfEmpty(notFound);
	}

}
