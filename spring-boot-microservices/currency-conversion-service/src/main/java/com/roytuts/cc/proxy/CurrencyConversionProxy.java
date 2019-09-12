package com.roytuts.cc.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.roytuts.cc.model.CurrencyConversion;

@FeignClient(name = "forex-service"/*, url = "localhost:9000"*/)
@RibbonClient(name = "forex-service")
public interface CurrencyConversionProxy {

	@GetMapping("forex-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
