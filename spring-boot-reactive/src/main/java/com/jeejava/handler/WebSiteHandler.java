package com.jeejava.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.jeejava.model.WebSite;
import com.jeejava.repository.WebSiteRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class WebSiteHandler {

	@Autowired
	private WebSiteRepository webSiteRepository;

	public Mono<ServerResponse> getAllWebSites(ServerRequest serverRequest) {
		Flux<WebSite> webSites = webSiteRepository.findAll();
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(webSites, WebSite.class);
	}

	public Mono<ServerResponse> addWebSite(ServerRequest serverRequest) {
		Mono<WebSite> webSite = serverRequest.bodyToMono(WebSite.class);
		webSite.subscribe(wb -> webSiteRepository.add(wb));
		return ServerResponse.ok().build(Mono.empty());
	}

	public Mono<ServerResponse> updateWebSite(ServerRequest serverRequest) {
		Mono<WebSite> webSite = serverRequest.bodyToMono(WebSite.class);
		webSite.subscribe(wb -> webSiteRepository.update(wb));
		return ServerResponse.ok().build(Mono.empty());
	}

	public Mono<ServerResponse> deleteWebSite(ServerRequest serverRequest) {
		Integer webSiteId = Integer.valueOf(serverRequest.pathVariable("id"));
		webSiteRepository.delete(webSiteId);
		return ServerResponse.ok().build(Mono.empty());
	}

	public Mono<ServerResponse> getWebSite(ServerRequest serverRequest) {
		Integer webSiteId = Integer.valueOf(serverRequest.pathVariable("id"));
		Mono<ServerResponse> notFound = ServerResponse.notFound().build();
		Mono<WebSite> webSiteMono = webSiteRepository.findById(webSiteId);
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(webSiteMono, WebSite.class)
				.switchIfEmpty(notFound);
	}

}
