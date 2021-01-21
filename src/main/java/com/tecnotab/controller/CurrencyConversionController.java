package com.tecnotab.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnotab.model.CalculatedAmount;

@RestController
@RequestMapping("/currency-conversion")
public class CurrencyConversionController {

	@GetMapping("/from/{USD}/to/{INR}/quantity/{quantity}")
	public CalculatedAmount getValue(@PathVariable("USD") String from, @PathVariable("INR") String to, @PathVariable("quantity") BigDecimal quantity) {
		return new CalculatedAmount(1000L, from, to, quantity, BigDecimal.ONE, quantity);
	}
}
