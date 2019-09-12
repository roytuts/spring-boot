package com.roytuts.spring.boot.reactive.mongodb.crud.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.roytuts.spring.boot.reactive.mongodb.crud.entity.Forex;
import com.roytuts.spring.boot.reactive.mongodb.crud.repository.ForexRepository;
import com.roytuts.spring.boot.reactive.mongodb.crud.vo.ForexVo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ForexHandler {

	@Autowired
	private ForexRepository repository;

	public Mono<ServerResponse> getForexList(ServerRequest request) {
		Flux<Forex> forexList = repository.findAll();

		Flux<ForexVo> forexVoList = forexList.map(f -> {
			return new ForexVo(f.getId(), f.getFromCur(), f.getToCur(), f.getRateCur());
		});

		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(forexVoList, ForexVo.class);
	}

	public Mono<ServerResponse> getForexById(ServerRequest request) {
		String forexId = request.pathVariable("id");

		Mono<ServerResponse> notFound = ServerResponse.notFound().build();

		Mono<Forex> forex = repository.findById(forexId);

		Mono<ForexVo> forexVo = Mono.from(forex.map(f -> {
			return new ForexVo(f.getId(), f.getFromCur(), f.getToCur(), f.getRateCur());
		}));

		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(forexVo, ForexVo.class)
				.switchIfEmpty(notFound);
	}

	public Mono<ServerResponse> addForex(ServerRequest serverRequest) {
		Mono<ForexVo> forexVo = serverRequest.bodyToMono(ForexVo.class);

		Mono<Forex> forex = forexVo.map(f -> new Forex(f.getFromCur(), f.getToCur(), f.getRateCur()))
				.flatMap(repository::save);

		forexVo = Mono.from(forex.map(f -> {
			return new ForexVo(f.getId(), f.getFromCur(), f.getToCur(), f.getRateCur());
		}));

		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(forexVo, ForexVo.class);
	}

	public Mono<ServerResponse> updateForex(ServerRequest serverRequest) {
		Mono<ForexVo> forexVo = serverRequest.bodyToMono(ForexVo.class);

		Mono<Forex> forex = forexVo.map(f -> new Forex(f.getId(), f.getFromCur(), f.getToCur(), f.getRateCur()))
				.flatMap(repository::save);

		forexVo = Mono.from(forex.map(f -> {
			return new ForexVo(f.getId(), f.getFromCur(), f.getToCur(), f.getRateCur());
		}));

		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(forexVo, ForexVo.class);
	}

	public Mono<ServerResponse> deleteForex(ServerRequest serverRequest) {
		Mono<ForexVo> forexVo = serverRequest.bodyToMono(ForexVo.class);

		return forexVo.flatMap(f -> repository.findById(f.getId())).flatMap(f -> repository.delete(f))
				.then(ServerResponse.ok().build(Mono.empty()));
	}

}
