package org.example;

public class Product {
	int id;
	String title;
	String description;
	double price;
	
	public Product (int id, String title, String description, double price) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
	}
	
	// Getters
	public int getId () {
		return id;
	}
	
	public String getTitle () {
		return title;
	}
	
	public String getDescription () {
		return description;
	}
	
	public double getPrice () {
		return price;
	}
	
	// Setters
	public void setId (int id) {
		this.id = id;
	}
	
	public void setTitle (String title) {
		this.title = title;
	}
	
	public void setDescription (String description) {
		this.description = description;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
}
