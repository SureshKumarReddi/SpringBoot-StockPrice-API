package com.Suresh.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Suresh.Models.StockPrices;

public interface StockPricesRepository extends CrudRepository<StockPrices, Integer> {

	public StockPrices findByCompanyName(String name);
}
