package com.night.data.migration.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.night.data.migration.entity.ali.THotelFoodMeal;
import com.night.data.migration.entity.hotel.TFood;
import com.night.data.migration.util.RespositoryFactory;

/**
 * 
 * @author Reverien9@gmail.com
 * 2017年12月6日 上午9:18:29
 */
@Service
public class FoodService {
	
	@Autowired
	private RespositoryFactory factory;
	
	@Transactional
	public void tFood() throws Exception {
		Date date = new Date();
		List<TFood> foods = new ArrayList<>();
		List<THotelFoodMeal> foodMeals = factory.getHotelFoodMeal().findAll();
		for(THotelFoodMeal hfm : foodMeals) {
			TFood tFood = new TFood();
			tFood.setId(hfm.getId());
			tFood.setHotelId(hfm.getHotelId());
			tFood.setName(hfm.getFoodName());
			tFood.setPrice(Double.valueOf(hfm.getFoodPrice() / 100).intValue());
			tFood.setDeliveryTime(hfm.getFoodDeliverTime());
			tFood.setFoodProvides(hfm.getFoodProvideFrom());
			tFood.setFoodProvidesName(hfm.getFoodCompanyName());
			tFood.setOrderReceivePhone(hfm.getFoodOrderPhone());
			tFood.setFoodImage(hfm.getFoodImage());
			List<String> types = Arrays.asList(hfm.getFoodType().toString().split(""));
			if(types.contains("1")) {
				tFood.setBreakfastEnable(0);
			}else if(types.contains("2")) {
				tFood.setLunchEnable(0);
			}else if(types.contains("3")) {
				tFood.setDinnerEnable(0);
			}else if(types.contains("4")) {
				tFood.setSupperEnable(0);
			}
			tFood.setCreatedAt(date );
			tFood.setCreatedBy(0);
			tFood.setUpdatedBy(0);
			foods.add(tFood);
		}
		factory.gettFood().save(foods);
	}
	
}
