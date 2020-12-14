package com.ExPro.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ordermeals")
public class ordermeals {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int meal_Id;
	private int order_id;
	private int quantity;
	private double total;
	public ordermeals(int id, int meal_Id, int order_id, int quantity, double total) {
		super();
		this.id = id;
		this.meal_Id = meal_Id;
		this.order_id = order_id;
		this.quantity = quantity;
		this.total = total;
	}
	public ordermeals() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMeal_Id() {
		return meal_Id;
	}
	public void setMeal_Id(int meal_Id) {
		this.meal_Id = meal_Id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
}

