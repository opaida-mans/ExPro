package com.ExPro.demo.service;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExPro.demo.entity.ROrder;
import com.ExPro.demo.repositories.RRepositories;

@Service
public class RService {

	@Autowired 
	RRepositories rRepositories;

	public List<ROrder> getAll() {
		 
		return (List<ROrder>) rRepositories.findAll();
	}
 
	public String addOrder(ROrder ord) {
		if(rRepositories.save(ord) != null)
			return "Added Succesfulyy";
		else
		return "Something Went Wrong";
	}

	public String updateOrder(ROrder ord) {
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
	

	public List<ROrder> search(String searchword) {
		// TODO Auto-generated method stub
		return rRepositories.findByFirstNameStartingWithOrLastName(searchword,searchword);
	}
	
	
	
}
