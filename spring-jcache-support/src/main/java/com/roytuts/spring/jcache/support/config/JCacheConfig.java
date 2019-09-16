package com.roytuts.spring.jcache.support.config;

import javax.cache.CacheManager;

import org.ehcache.jcache.JCacheCachingProvider;
import org.ehcache.jcache.JCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JCacheConfig {

	@Bean
	public CacheManager jCacheManager() {
		JCacheManager cacheManager = new JCacheManager(new JCacheCachingProvider(), ehcache(), null, null);
		return cacheManager;
	}

	private net.sf.ehcache.CacheManager ehcache() {
		net.sf.ehcache.CacheManager cacheManager = new net.sf.ehcache.CacheManager();
		return cacheManager;
	}

}
