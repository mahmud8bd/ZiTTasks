package com.zit.repository;
/**
 * 
 *  This interface extends JpaRepository, which provides basic CRUD 
 *  (Create, Read, Update, Delete) operations for the Food entity. 
 * */
import org.springframework.data.jpa.repository.JpaRepository;

import com.zit.model.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {

}
