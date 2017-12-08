package com.night.data.migration.entity.hotel;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_order_food_detail database table.
 * 
 */
@Entity
@Table(name="t_order_food_detail")
@NamedQuery(name="TOrderFoodDetail.findAll", query="SELECT t FROM TOrderFoodDetail t")
public class TOrderFoodDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	@Column(name="food_id")
	private int foodId;

	@Column(name="food_name")
	private String foodName;

	@Column(name="food_number")
	private int foodNumber;

	@Column(name="food_price")
	private int foodPrice;

	@Column(name="food_provides_name")
	private String foodProvidesName;

	@Column(name="food_provides_phone")
	private String foodProvidesPhone;

	@Column(name="order_food_id")
	private int orderFoodId;

	public TOrderFoodDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFoodId() {
		return this.foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return this.foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodNumber() {
		return this.foodNumber;
	}

	public void setFoodNumber(int foodNumber) {
		this.foodNumber = foodNumber;
	}

	public int getFoodPrice() {
		return this.foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getFoodProvidesName() {
		return this.foodProvidesName;
	}

	public void setFoodProvidesName(String foodProvidesName) {
		this.foodProvidesName = foodProvidesName;
	}

	public String getFoodProvidesPhone() {
		return this.foodProvidesPhone;
	}

	public void setFoodProvidesPhone(String foodProvidesPhone) {
		this.foodProvidesPhone = foodProvidesPhone;
	}

	public int getOrderFoodId() {
		return this.orderFoodId;
	}

	public void setOrderFoodId(int orderFoodId) {
		this.orderFoodId = orderFoodId;
	}

	@Override
	public String toString() {
		return "TOrderFoodDetail [id=" + id + ", foodId=" + foodId + ", foodName=" + foodName + ", foodNumber="
				+ foodNumber + ", foodPrice=" + foodPrice + ", foodProvidesName=" + foodProvidesName
				+ ", foodProvidesPhone=" + foodProvidesPhone + ", orderFoodId=" + orderFoodId + "]";
	}

}