package org.example;

import java.util.ArrayList;
import java.util.List;

public class Buyer {
	private String name;
	private String surname;
	private String email;
	private int dni;
	private List<Cart> carts;
	
	public  Buyer (String name, String surname, String email, int dni) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.dni = dni;
		this.carts = new ArrayList<>();
	}
	
	// Getters
	public String getName () {
		return name;
	}
	
	public String getSurname () {
		return surname;
	}
	
	public String getEmail () {
		return email;
	}
	
	public int getDni () { 
		return dni;
	}
	
	public List<Cart> getCart () {
		return carts;
	}
	
	// Setters
	public void setName (String name) {
		this.name = name;
	}
	
	public void setSurname (String surname) {
		this.surname = surname;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public void setCart (List<Cart> carts) {
		this.carts = carts;
	}
	
	public void addCart (Cart cart) {
		carts.add(cart);
	}
}
