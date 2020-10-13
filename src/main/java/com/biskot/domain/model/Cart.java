package com.biskot.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private long id;
	
	private List<Product> products;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Product> getProducts() {
		if (products == null) {
			products = new ArrayList<>();
		}
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
