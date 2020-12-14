package com.ExPro.demo.entity;




import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;


@Entity
@Table(name="orders")
public class orders {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int restaurant_id;
	private String date;
	private String created_by;
	private boolean active;
	
	
	
	  
	public orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	 @PrePersist
	  protected void onCreate() {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date2 = new Date();
		 date = sdf.format(date2);
			//date=date2;
	  }


	public orders(int id, int restaurant_id,String date, String created_by, boolean active) {
		super();
		

		this.id = id;
		this.restaurant_id = restaurant_id;
		this.date = date;
		this.created_by = created_by;
		this.active = active;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getRestaurant_id() {
		return restaurant_id;
	}




	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}









	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public String getCreated_by() {
		return created_by;
	}




	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}




	public boolean isActive() {
		return active;
	}




	public void setActive(boolean active) {
		this.active = active;
	}

	

	
}
