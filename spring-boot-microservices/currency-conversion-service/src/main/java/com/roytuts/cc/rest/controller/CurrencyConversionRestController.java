package com.roytuts.cc.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.cc.model.CurrencyConversion;
import com.roytuts.cc.proxy.CurrencyConversionProxy;

@RestController
public class CurrencyConversionRestController {

	@Autowired
	private CurrencyConversionProxy currencyConversionProxy;

	@GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public ResponseEntity<CurrencyConversion> getCurrencyExchange(@PathVariable String from, @PathVariable String to,
			@PathVariable Integer quantity) {
		CurrencyConversion response = currencyConversionProxy.retrieveExchangeValue(from, to);
		return new ResponseEntity<CurrencyConversion>(new CurrencyConversion(response.getId(), from, to,
				response.getRate(), quantity, quantity * response.getRate()), HttpStatus.OK);
	}

}
