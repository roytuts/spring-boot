package com.jeejava.spring.boot.reactive.currency.conversion.microservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jeejava.spring.boot.reactive.currency.conversion.microservice.vo.CurrencyExchange;

//@FeignClient(name = "forex-microservice", url = "localhost:8080")
@FeignClient(name = "forex-microservice")
@RibbonClient(name = "forex-microservice")
public interface CurrencyConversionProxy {

	@GetMapping("/forex/fromCur/{fromCur}/toCur/{toCur}")
	public CurrencyExchange getCurrency(@PathVariable(name = "fromCur") String fromCur,
			@PathVariable(name = "toCur") String toCur);

}
