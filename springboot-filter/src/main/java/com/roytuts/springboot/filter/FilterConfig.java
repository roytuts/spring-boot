package com.roytuts.springboot.filter;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

	@Bean
	public FilterRegistrationBean<Filter> cacheControlFilter() {
		CacheControlFilter cacheControlFilter = new CacheControlFilter();

		return createFilterRegistration(cacheControlFilter);
	}

	@Bean
	public FilterRegistrationBean<Filter> cspControlFilter() {
		CspControlFilter cspControlFilter = new CspControlFilter();

		return createFilterRegistration(cspControlFilter);
	}

	private FilterRegistrationBean<Filter> createFilterRegistration(Filter filter) {
		FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<Filter>(filter);

		List<String> urlPatterns = new ArrayList<>();
		urlPatterns.add("/*");

		filterRegistrationBean.setUrlPatterns(urlPatterns);

		return filterRegistrationBean;
	}

}
