package com.ExPro.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="meals")
public class meals {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int restaurant_id;
	private String name;
	private String description;
	private String type;
	private double price;
	private boolean active;
	
	
	
	


	public meals(int id, int restaurant_id, String name, String description, String type, double price,
			boolean active) {
		super();
		this.id = id;
		this.restaurant_id = restaurant_id;
		this.name = name;
		this.description = description;
		this.type = type;
		this.price = price;
		this.active = active;
	}


	public meals() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getRestaurant_id() {
		return restaurant_id;
	}


	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
}


 