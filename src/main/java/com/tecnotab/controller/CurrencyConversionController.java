package com.tecnotab.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnotab.model.CalculatedAmount;
import com.tecnotab.proxy.CurrencyExchangeProxy;

@RestController
@RequestMapping("/currency-conversion")
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeProxy currencyExchangeProxy;
	

	@GetMapping("/from/{USD}/to/{INR}/quantity/{quantity}")
	public CalculatedAmount getValue(@PathVariable("USD") String from, @PathVariable("INR") String to, @PathVariable("quantity") BigDecimal quantity) {
		CalculatedAmount calculatedAmount = currencyExchangeProxy.getExchangeValue(from, to);
		
		return new CalculatedAmount(1000L, calculatedAmount.getFrom(), calculatedAmount.getTo(), quantity, calculatedAmount.getConversionMultiple(), calculatedAmount.getConversionMultiple().multiply(quantity));
	}
}
