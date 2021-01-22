package com.tecnotab.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tecnotab.model.CalculatedAmount;

@FeignClient(name="currency-exchange-service", url="http://localhost:8022")
//@FeignClient(name="currency-exchange-service")
//@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy {

	@GetMapping("/currency-exchange/from/{USD}/to/{INR}")
	public CalculatedAmount getExchangeValue(@PathVariable("USD") String from, @PathVariable("INR") String to);
}
