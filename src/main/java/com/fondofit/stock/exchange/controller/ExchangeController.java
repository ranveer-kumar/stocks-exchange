package com.fondofit.stock.exchange.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fondofit.stock.exchange.repository.ExchangeRepository;
import com.fondofit.stock.exchnage.model.ExchangeBean;

@RestController
public class ExchangeController {

	@Autowired
	ExchangeRepository repository;
	
	@GetMapping("/")
	public String helloPortfolio() {
		return "Hello from Stock Exchange";
	}
	@GetMapping("/api/stock/price/{id}")
	public Optional<ExchangeBean> getPortFolioByID(@PathVariable("id") String id) {
		System.out.println("inside the controller method getPortFolioByID= "+repository.findById(id).toString());
		return repository.findById(id);
	}
	
	@GetMapping("/model")
	public ExchangeBean getModel() {
		return new ExchangeBean();
	}
}
