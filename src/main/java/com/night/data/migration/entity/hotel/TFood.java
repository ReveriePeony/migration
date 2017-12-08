package com.night.data.migration.entity.hotel;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the t_food database table.
 * 
 */
@Entity
@Table(name="t_food")
@NamedQuery(name="TFood.findAll", query="SELECT t FROM TFood t")
public class TFood implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="breakfast_begin")
	private Time breakfastBegin;

	@Column(name="breakfast_enable")
	private Integer breakfastEnable = 1;

	@Column(name="breakfast_end")
	private Time breakfastEnd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="created_by")
	private Integer createdBy;

	@Column(name="delivery_time")
	private Integer deliveryTime;

	@Column(name="dinner_begin")
	private Time dinnerBegin;

	@Column(name="dinner_enable")
	private Integer dinnerEnable = 1;

	@Column(name="dinner_end")
	private Time dinnerEnd;

	@Column(name="food_image")
	private String foodImage;

	@Column(name="food_provides")
	private Integer foodProvides;

	@Column(name="food_provides_name")
	private String foodProvidesName;

	@Column(name="hotel_id")
	private Integer hotelId;

	@Column(name="lunch_begin")
	private Time lunchBegin;

	@Column(name="lunch_enable")
	private Integer lunchEnable = 1;

	@Column(name="lunch_end")
	private Time lunchEnd;

	@Column(name="mark_modified")
	private Integer markModified = 0;

	private String name;

	@Column(name="order_receive_phone")
	private String orderReceivePhone;

	private Integer price;

	@Column(name="supper_begin")
	private Time supperBegin;

	@Column(name="supper_enable")
	private Integer supperEnable = 1;

	@Column(name="supper_end")
	private Time supperEnd;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="updated_by")
	private Integer updatedBy;

	public TFood() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Time getBreakfastBegin() {
		return breakfastBegin;
	}

	public void setBreakfastBegin(Time breakfastBegin) {
		this.breakfastBegin = breakfastBegin;
	}

	public Integer getBreakfastEnable() {
		return breakfastEnable;
	}

	public void setBreakfastEnable(Integer breakfastEnable) {
		this.breakfastEnable = breakfastEnable;
	}

	public Time getBreakfastEnd() {
		return breakfastEnd;
	}

	public void setBreakfastEnd(Time breakfastEnd) {
		this.breakfastEnd = breakfastEnd;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Integer deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Time getDinnerBegin() {
		return dinnerBegin;
	}

	public void setDinnerBegin(Time dinnerBegin) {
		this.dinnerBegin = dinnerBegin;
	}

	public Integer getDinnerEnable() {
		return dinnerEnable;
	}

	public void setDinnerEnable(Integer dinnerEnable) {
		this.dinnerEnable = dinnerEnable;
	}

	public Time getDinnerEnd() {
		return dinnerEnd;
	}

	public void setDinnerEnd(Time dinnerEnd) {
		this.dinnerEnd = dinnerEnd;
	}

	public String getFoodImage() {
		return foodImage;
	}

	public void setFoodImage(String foodImage) {
		this.foodImage = foodImage;
	}

	public Integer getFoodProvides() {
		return foodProvides;
	}

	public void setFoodProvides(Integer foodProvides) {
		this.foodProvides = foodProvides;
	}

	public String getFoodProvidesName() {
		return foodProvidesName;
	}

	public void setFoodProvidesName(String foodProvidesName) {
		this.foodProvidesName = foodProvidesName;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public Time getLunchBegin() {
		return lunchBegin;
	}

	public void setLunchBegin(Time lunchBegin) {
		this.lunchBegin = lunchBegin;
	}

	public Integer getLunchEnable() {
		return lunchEnable;
	}

	public void setLunchEnable(Integer lunchEnable) {
		this.lunchEnable = lunchEnable;
	}

	public Time getLunchEnd() {
		return lunchEnd;
	}

	public void setLunchEnd(Time lunchEnd) {
		this.lunchEnd = lunchEnd;
	}

	public Integer getMarkModified() {
		return markModified;
	}

	public void setMarkModified(Integer markModified) {
		this.markModified = markModified;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrderReceivePhone() {
		return orderReceivePhone;
	}

	public void setOrderReceivePhone(String orderReceivePhone) {
		this.orderReceivePhone = orderReceivePhone;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Time getSupperBegin() {
		return supperBegin;
	}

	public void setSupperBegin(Time supperBegin) {
		this.supperBegin = supperBegin;
	}

	public Integer getSupperEnable() {
		return supperEnable;
	}

	public void setSupperEnable(Integer supperEnable) {
		this.supperEnable = supperEnable;
	}

	public Time getSupperEnd() {
		return supperEnd;
	}

	public void setSupperEnd(Time supperEnd) {
		this.supperEnd = supperEnd;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

}