package com.Suresh;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.Suresh.Models.StockPrices;
import com.Suresh.Repository.StockPricesRepository;

/**
 * @author sresh
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringBootStockPriceApiApplication {

	@Autowired
	private StockPricesRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStockPriceApiApplication.class, args);
	}

	/*
	 * @PostConstruct public void initDB() { StockPrices p1 = new StockPrices("HCL",
	 * 1700.00); StockPrices p2 = new StockPrices("Infosys", 1900.00); StockPrices
	 * p3 = new StockPrices("Tcs", 3400.00);
	 * 
	 * List<StockPrices> listOfStockPrices = Arrays.asList(p1, p2, p3);
	 * repo.saveAll(listOfStockPrices);
	 * 
	 * }
	 */

}
