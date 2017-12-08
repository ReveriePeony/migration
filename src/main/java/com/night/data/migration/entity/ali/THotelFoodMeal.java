package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hotel_food_meal database table.
 * 
 */
@Entity
@Table(name="t_hotel_food_meal")
@NamedQuery(name="THotelFoodMeal.findAll", query="SELECT t FROM THotelFoodMeal t")
public class THotelFoodMeal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="food_company_name")
	private String foodCompanyName;

	@Column(name="food_deliver_time")
	private Integer foodDeliverTime;

	@Column(name="food_image")
	private String foodImage;

	@Column(name="food_name")
	private String foodName;

	@Column(name="food_order_phone")
	private String foodOrderPhone;

	@Column(name="food_price")
	private double foodPrice;

	@Column(name="food_provide_from")
	private Integer foodProvideFrom;

	@Column(name="food_status")
	private Integer foodStatus;

	@Column(name="food_type")
	private Integer foodType;

	@Column(name="hotel_id")
	private Integer hotelId;

	public THotelFoodMeal() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFoodCompanyName() {
		return foodCompanyName;
	}

	public void setFoodCompanyName(String foodCompanyName) {
		this.foodCompanyName = foodCompanyName;
	}

	public Integer getFoodDeliverTime() {
		return foodDeliverTime;
	}

	public void setFoodDeliverTime(Integer foodDeliverTime) {
		this.foodDeliverTime = foodDeliverTime;
	}

	public String getFoodImage() {
		return foodImage;
	}

	public void setFoodImage(String foodImage) {
		this.foodImage = foodImage;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodOrderPhone() {
		return foodOrderPhone;
	}

	public void setFoodOrderPhone(String foodOrderPhone) {
		this.foodOrderPhone = foodOrderPhone;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}

	public Integer getFoodProvideFrom() {
		return foodProvideFrom;
	}

	public void setFoodProvideFrom(Integer foodProvideFrom) {
		this.foodProvideFrom = foodProvideFrom;
	}

	public Integer getFoodStatus() {
		return foodStatus;
	}

	public void setFoodStatus(Integer foodStatus) {
		this.foodStatus = foodStatus;
	}

	public Integer getFoodType() {
		return foodType;
	}

	public void setFoodType(Integer foodType) {
		this.foodType = foodType;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}


}