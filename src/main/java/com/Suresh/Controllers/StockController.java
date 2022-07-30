package com.Suresh.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Suresh.Models.StockPrices;
import com.Suresh.Repository.StockPricesRepository;

@RestController
public class StockController {
	
	@Autowired
	private StockPricesRepository repo;

	@GetMapping("/price/{cname}")
	public double getStockPrice(@PathVariable String cname) {
		 StockPrices obj = repo.findByCompanyName(cname);
		return obj.getPrice();
	}
}
