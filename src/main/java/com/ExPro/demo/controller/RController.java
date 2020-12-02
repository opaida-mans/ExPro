package com.ExPro.demo.controller;


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

import com.ExPro.demo.entity.ROrder;
import com.ExPro.demo.service.RService;

@RestController
@RequestMapping("/api")
public class RController {
	
	@Autowired
	RService rService;

	
	@GetMapping(value= {"/viewOrder"})
	public  List<ROrder> getAll(){
		//throw new ExceptionController("OOps we cant get employees Emad");
		return rService.getAll();
	}
	
	@PostMapping(value= {"/addOrder"})
	public String addOrder(@RequestBody ROrder ord) {
		return rService.addOrder(ord);
	}
	
	@PutMapping(value= {"updateOrder"})
	public String updateOrder(@RequestBody ROrder ord) {
		return rService.updateOrder(ord);
	}
	
	@DeleteMapping("/deleteOrder")
	public String deleteOrder(@RequestParam (value="id",required = false,defaultValue = "0")int id) {
		return rService.deleteOrder(id);
	}
	
	@GetMapping(value= {"/searchK"})
	public  List<ROrder> search(@RequestParam (value="searchwoed")String searchword){
		//throw new ExceptionController("OOps we cant get employees Emad");
		return rService.search(searchword);
	}
	
	
}
	