package com.roytuts.springboot.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.RequestContextFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

public class CacheControlFilter extends RequestContextFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		System.out.println("Cache Filter...");

		ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
		ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);

		filterChain.doFilter(requestWrapper, responseWrapper);

		setCacheHeaders(responseWrapper);

		responseWrapper.copyBodyToResponse();
	}

	private void setCacheHeaders(ContentCachingResponseWrapper responseWrapper) {
		responseWrapper.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		responseWrapper.setHeader("Pragma", "no-cache"); // HTTP 1.0
		responseWrapper.setHeader("Expires", "0");
	}

}
