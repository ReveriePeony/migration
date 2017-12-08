package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hotel_food_order_detial database table.
 * 
 */
@Entity
@Table(name="t_hotel_food_order_detial")
@NamedQuery(name="THotelFoodOrderDetial.findAll", query="SELECT t FROM THotelFoodOrderDetial t")
public class THotelFoodOrderDetial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="food_meal_id")
	private Integer foodMealId;

	@Column(name="food_order_id")
	private Integer foodOrderId;

	private Integer num;

	public THotelFoodOrderDetial() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFoodMealId() {
		return foodMealId;
	}

	public void setFoodMealId(Integer foodMealId) {
		this.foodMealId = foodMealId;
	}

	public Integer getFoodOrderId() {
		return foodOrderId;
	}

	public void setFoodOrderId(Integer foodOrderId) {
		this.foodOrderId = foodOrderId;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}


}