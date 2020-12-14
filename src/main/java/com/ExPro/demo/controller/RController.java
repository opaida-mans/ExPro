package com.ExPro.demo.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ExPro.demo.entity.meals;
import com.ExPro.demo.entity.ordermeals;
import com.ExPro.demo.entity.orders;
import com.ExPro.demo.entity.restaurants;
import com.ExPro.demo.entity.users;
import com.ExPro.demo.service.RService;

@RestController
@RequestMapping("/api")
public class RController {
	
	@Autowired
	RService rService;

	
	@GetMapping(value= {"/viewOrder"})
	public  List<orders> getAll(){
		//throw new ExceptionController("OOps we cant get employees Emad");
		return rService.getAll();
	}
	
	@PostMapping(value= {"/addOrder"})
	public String addOrder(@RequestBody orders ord) {
		return rService.addOrder(ord);
	}
	
	@GetMapping(value= {"/viewTodayOrder"})
	public  List<orders> search(){
		//throw new ExceptionController("OOps we cant get employees Emad");
		Date date=new Date();
		String d=date.toString(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(d);
		return rService.search(sdf.format(date));
	}
	 
	 
/*********************************************************************/	
	@GetMapping(value= {"/viewRestaurants"})
	public  List<restaurants> getAllRestaurants(){
		//throw new ExceptionController("OOps we cant get employees Emad");
		return rService.getAllRestaurants();
	}
	
	@PostMapping(value= {"/addRestaurant"})
	public String addRestaurant(@RequestBody restaurants rest) {
		return rService.addRestaurant(rest);
	}
	
	
	
	/*********************************************************************/	
	
	@GetMapping(value= {"/viewMeals"})
	public  List<meals> getAllMeals(){
		//throw new ExceptionController("OOps we cant get employees Emad");
		return rService.getAllMeals();
	}
	
	@PostMapping(value= {"/addMeal"})
	public String addMeals(@RequestBody meals meal) {
		return rService.addMeals(meal);
	}
	
	
	
	/*********************************************************************/	
	
	@GetMapping(value= {"/viewUsers"})
	public  List<users> getAllUsers(){
		//throw new ExceptionController("OOps we cant get employees Emad");
		return rService.getAllUsers();
	}
	
	@PostMapping(value= {"/addUser"})
	public String addUser(@RequestBody users user) {
		return rService.addUsers(user);
	}
	
	
	
	/*********************************************************************/	
	
	@GetMapping(value= {"/viewOrdermeals"})
	public  List<ordermeals> getAllOrdermeals(){
		//throw new ExceptionController("OOps we cant get employees Emad");
		return rService.getAllOrdermeals();
	}
	
	@PostMapping(value= {"/addOrdermeals"})
	public String addOrdermeal(@RequestBody ordermeals ordermeal) {
		return rService.addOrdermeals(ordermeal);
	}
	
	
	
	/*********************************************************************/	
	
	@PutMapping(value= {"updateOrder"})
	public String updateOrder(@RequestBody orders ord) {
		return rService.updateOrder(ord);
	}
	
	@DeleteMapping("/deleteOrder")
	public String deleteOrder(@RequestParam (value="id",required = false,defaultValue = "0")int id) {
		return rService.deleteOrder(id);
	}
	
	
	
	
}
	