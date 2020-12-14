package com.ExPro.demo.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="restaurants")
public class restaurants {
	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String name;
		private String loction;
		private String facebook_page;
		private String phone;
		private String type;
		
		
		
		public restaurants(int id, String name, String loction, String facebook_page, String phone, String type) {
			super();
			this.id = id;
			this.name = name;
			this.loction = loction;
			this.facebook_page = facebook_page;
			this.phone = phone;
			this.type = type;
		}
		
		
		
		public restaurants() {
			super();
			// TODO Auto-generated constructor stub
		}



		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLoction() {
			return loction;
		}
		public void setLoction(String loction) {
			this.loction = loction;
		}
		public String getFacebook_page() {
			return facebook_page;
		}
		public void setFacebook_page(String facebook_page) {
			this.facebook_page = facebook_page;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		
		
}
