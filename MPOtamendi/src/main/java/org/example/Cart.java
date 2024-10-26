package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private int id;
	private List<Product> products;
	private String state;
	
	public Cart (int id, String state) {
		this.id = id;
		this.products = new ArrayList<>();
		this.state = state;
	}
	
	// Getters
	public int getId () {
		return id;
	}
	
	public List<Product> getProducts () {
		return products;
	}
	
	public String getState() {
		return state;
	}
	
	public double getTotal () {
		double total = 0;
		for (Product product : products) {
			total += product.getPrice();
		}
		return total;
	}
	
	public Product getProduct (int productId) {
		Product productReturn = null;
		
		for (Product product : products) {
			if (product.getId() == productId) {
				return productReturn = product;
			}
		}
		
		return productReturn;
	}
	
	// Setters
	public void setState(String state) {
		this.state = state;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public void addProduct (Product product) {
		products.add(product);
	}
}
