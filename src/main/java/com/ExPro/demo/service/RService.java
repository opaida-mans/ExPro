package com.ExPro.demo.service;





import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExPro.demo.entity.meals;
import com.ExPro.demo.entity.ordermeals;
import com.ExPro.demo.entity.orders;
import com.ExPro.demo.entity.restaurants;
import com.ExPro.demo.entity.users;
import com.ExPro.demo.repositories.MealRepository;
import com.ExPro.demo.repositories.OrdermealsRepository;
import com.ExPro.demo.repositories.RRepositories;
import com.ExPro.demo.repositories.RestRepository;
import com.ExPro.demo.repositories.UserRepository;

@Service
public class RService {

	@Autowired 
	RRepositories rRepositories;
	@Autowired 
	RestRepository restRepository;
	@Autowired 
	MealRepository mealRepository;
	@Autowired 
	UserRepository userRepository;
	@Autowired 
	OrdermealsRepository ordermealsRepository;

	public List<orders> getAll() {
		 
		return (List<orders>) rRepositories.findAll();
	}
 
	public String addOrder(orders ord) {
		if(rRepositories.save(ord) != null)
			return "Added Succesfulyy";
		else
		return "Something Went Wrong";
	}
	
	/*********************************************************************/	
	
	public List<restaurants> getAllRestaurants() {
		 
		return (List<restaurants>) restRepository.findAll();
	}
	
	public String addRestaurant(restaurants rest) {
		if(restRepository.save(rest) != null)
			return "Added Succesfulyy";
		else
		return "Something Went Wrong";
	}
	
	/*********************************************************************/	
	
	public List<meals> getAllMeals() {
		 
		return (List<meals>) mealRepository.findAll();
	}
	
	public String addMeals(meals meal) {
		if(mealRepository.save(meal) != null)
			return "Added Succesfulyy";
		else
		return "Something Went Wrong";
	}
	
	/*********************************************************************/	
	
	public List<users> getAllUsers() {
		 
		return (List<users>) userRepository.findAll();
	}
	
	public String addUsers(users user) {
		if(userRepository.save(user) != null)
			return "Added Succesfulyy";
		else
		return "Something Went Wrong";
	}
	
	/*********************************************************************/	
	public List<ordermeals> getAllOrdermeals() {
		 
		return (List<ordermeals>) ordermealsRepository.findAll();
	}
	
	public String addOrdermeals(ordermeals ordermeal) {
		if(ordermealsRepository.save(ordermeal) != null)
			return "Added Succesfulyy";
		else
		return "Something Went Wrong";
	}
	
	/*********************************************************************/	
	
	

	public String updateOrder(orders ord) {
		if(rRepositories.save(ord) != null)
			return "Added Succesfuly";
		else
		return "Something Went Wrong ";
	}

	public String deleteOrder(int id) {
	try {	rRepositories.deleteById(id);
			return "Deleted Succesfuly";
	}catch (IllegalArgumentException e) {
		return "Something Went Wrong ";
	}} 
	

	public List<orders> search(String date) {
		// TODO Auto-generated method stub
		return rRepositories.findByDateAndActiveTrue(date);
	}

	

	
	
	
}
