package com.night.data.migration.entity.hotel;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the t_room_category database table.
 * 
 */
@Entity
@Table(name="t_room_category")
@NamedQuery(name="TRoomCategory.findAll", query="SELECT t FROM TRoomCategory t")
public class TRoomCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="breakfast_enable")
	private Integer breakfastEnable;

	@Column(name="breakfast_quantity")
	private Integer breakfastQuantity;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="created_by")
	private Integer createdBy;

	private Integer deposit;

	private String desc;

	@Column(name="hotel_id")
	private Integer hotelId;

	@Column(name="mark_modified")
	private Integer markModified;

	private String name;

	@Column(name="rack_rate")
	private Integer rackRate;

	@Column(name="room_count")
	private Integer roomCount;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="updated_by")
	private Integer updatedBy;

	@Column(name="weekend_fare")
	private Integer weekendFare;

	@Column(name="weekend_fare_enable")
	private Integer weekendFareEnable;

	public TRoomCategory() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBreakfastEnable() {
		return breakfastEnable;
	}

	public void setBreakfastEnable(Integer breakfastEnable) {
		this.breakfastEnable = breakfastEnable;
	}

	public Integer getBreakfastQuantity() {
		return breakfastQuantity;
	}

	public void setBreakfastQuantity(Integer breakfastQuantity) {
		this.breakfastQuantity = breakfastQuantity;
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

	public Integer getDeposit() {
		return deposit;
	}

	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
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

	public Integer getRackRate() {
		return rackRate;
	}

	public void setRackRate(Integer rackRate) {
		this.rackRate = rackRate;
	}

	public Integer getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(Integer roomCount) {
		this.roomCount = roomCount;
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

	public Integer getWeekendFare() {
		return weekendFare;
	}

	public void setWeekendFare(Integer weekendFare) {
		this.weekendFare = weekendFare;
	}

	public Integer getWeekendFareEnable() {
		return weekendFareEnable;
	}

	public void setWeekendFareEnable(Integer weekendFareEnable) {
		this.weekendFareEnable = weekendFareEnable;
	}


}