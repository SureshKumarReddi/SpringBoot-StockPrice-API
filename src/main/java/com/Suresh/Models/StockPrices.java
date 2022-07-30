package com.Suresh.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK_PRICES")
public class StockPrices {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "s.no")
	private int sno;
	private String companyName;
	private double price;
	
	public StockPrices() {
		// TODO Auto-generated constructor stub
	}

	public StockPrices(String name, double price) {
		super();
		this.companyName = name;
		this.price = price;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return companyName;
	}

	public void setName(String name) {
		this.companyName = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "StockPrices [sno=" + sno + ", name=" + companyName + ", price=" + price + "]";
	}
	
	
}
