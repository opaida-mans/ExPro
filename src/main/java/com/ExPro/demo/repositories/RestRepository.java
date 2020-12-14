package com.ExPro.demo.repositories;


import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ExPro.demo.entity.restaurants;


@Repository
public interface RestRepository extends JpaRepository<restaurants, Integer> {

	
	//public List<restaurants> findByDateAndActiveTrue(Date date);
	
	//public List<orders> findOrder(@Param("searchword") String searchword);
}




