package com.roytuts.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.roytuts.handler.WebSiteHandler;

@Configuration
public class WebSiteRouter {

	@Bean
	public RouterFunction<ServerResponse> route(WebSiteHandler webSiteHandler) {
		RouterFunction<ServerResponse> webSiteRoute = RouterFunctions
				.route(RequestPredicates.GET("/website").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
						webSiteHandler::getAllWebSites)
				.andRoute(RequestPredicates.GET("/website/{id}")
						.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), webSiteHandler::getWebSite)
				.andRoute(
						RequestPredicates.POST("/website").and(RequestPredicates.accept(MediaType.APPLICATION_JSON))
								.and(RequestPredicates.contentType(MediaType.APPLICATION_JSON)),
						webSiteHandler::addWebSite)
				.andRoute(
						RequestPredicates.PUT("/website").and(RequestPredicates.accept(MediaType.APPLICATION_JSON))
								.and(RequestPredicates.contentType(MediaType.APPLICATION_JSON)),
						webSiteHandler::updateWebSite)
				.andRoute(
						RequestPredicates.DELETE("/website/{id}")
								.and(RequestPredicates.contentType(MediaType.APPLICATION_JSON)),
						webSiteHandler::deleteWebSite);
		return webSiteRoute;
	}

}
