package com.ExPro.demo.repositories;


import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ExPro.demo.entity.ROrder;


@Repository
public interface RRepositories extends JpaRepository<ROrder, Integer> {

	
	public List<ROrder> findByFirstNameStartingWithOrLastName(String firstName,String lastName);
	
	//public List<ROrder> findOrder(@Param("searchword") String searchword);
}


