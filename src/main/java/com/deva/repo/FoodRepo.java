package com.deva.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deva.entities.Category;
import com.deva.entities.Food;

public interface FoodRepo extends JpaRepository<Food, Integer>{
	List<Food> findByCid(Category cid);
}
