package com.ExPro.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ExPro.demo.entity.ordermeals;


@Repository
public interface OrdermealsRepository extends JpaRepository< ordermeals, Integer> {

	
	//public List<restaurants> findByDateAndActiveTrue(Date date);
	
	//public List<orders> findOrder(@Param("searchword") String searchword);
}