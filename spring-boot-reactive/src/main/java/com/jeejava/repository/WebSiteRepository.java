package com.jeejava.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.jeejava.model.WebSite;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class WebSiteRepository {

	private static final Map<Integer, WebSite> WEBSITES = new HashMap<>();
	static {
		WebSite webSite1 = new WebSite();
		webSite1.setId(1);
		webSite1.setTitle("Roy Tutorials");
		webSite1.setUrl("https://www.roytuts.com");
		WEBSITES.put(1, webSite1);
		WebSite webSite2 = new WebSite();
		webSite2.setId(2);
		webSite2.setTitle("JEE Tutorials");
		webSite2.setUrl("https://www.jeejava.com");
		WEBSITES.put(2, webSite2);
	}
	private static int ID_COUNTER = 3;

	public Flux<WebSite> findAll() {
		return Flux.fromIterable(WEBSITES.values());
	}

	public Mono<WebSite> findById(Integer id) {
		return Mono.just(WEBSITES.get(id));
	}

	public Mono<Void> delete(Integer id) {
		WEBSITES.remove(id);
		return Mono.empty();
	}

	public Mono<Void> add(WebSite webSite) {
		Integer id = ID_COUNTER++;
		webSite.setId(id);
		WEBSITES.put(id, webSite);
		return Mono.empty();
	}

	public Mono<Void> update(WebSite website) {
		WEBSITES.put(website.getId(), website);
		return Mono.empty();
	}

}
