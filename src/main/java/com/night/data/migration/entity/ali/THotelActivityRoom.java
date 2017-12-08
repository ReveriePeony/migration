package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hotel_activity_room database table.
 * 
 */
@Entity
@Table(name="t_hotel_activity_room")
@NamedQuery(name="THotelActivityRoom.findAll", query="SELECT t FROM THotelActivityRoom t")
public class THotelActivityRoom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="activity_id")
	private int activityId;

	@Column(name="room_count")
	private int roomCount;

	@Column(name="room_id")
	private int roomId;

	@Column(name="room_time")
	private int roomTime;

	@Column(name="spike_price")
	private double spikePrice;

	public THotelActivityRoom() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActivityId() {
		return this.activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public int getRoomCount() {
		return this.roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public int getRoomId() {
		return this.roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getRoomTime() {
		return this.roomTime;
	}

	public void setRoomTime(int roomTime) {
		this.roomTime = roomTime;
	}

	public double getSpikePrice() {
		return this.spikePrice;
	}

	public void setSpikePrice(double spikePrice) {
		this.spikePrice = spikePrice;
	}

}