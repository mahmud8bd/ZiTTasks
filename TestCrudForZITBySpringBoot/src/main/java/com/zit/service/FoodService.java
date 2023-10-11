package com.zit.service;

import org.springframework.http.ResponseEntity;

import com.zit.model.Food;

public interface FoodService {
	ResponseEntity<?> getAllFood();

	ResponseEntity<?> saveFood(Food food);

	ResponseEntity<?> getFoodById(int foodId);

	ResponseEntity<?> deleteFoodById(int foodId);

	ResponseEntity<?> updateFood(int foodId, Food food);

}
