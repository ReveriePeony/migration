package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_hotel_room_calendar database table.
 * 
 */
@Entity
@Table(name="t_hotel_room_calendar")
@NamedQuery(name="THotelRoomCalendar.findAll", query="SELECT t FROM THotelRoomCalendar t")
public class THotelRoomCalendar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private double price;

	@Column(name="room_id")
	private int roomId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date time;

	public THotelRoomCalendar() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRoomId() {
		return this.roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}