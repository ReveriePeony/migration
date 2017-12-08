package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_hotel_check_in database table.
 * 
 */
@Entity
@Table(name="t_hotel_check_in")
@NamedQuery(name="THotelCheckIn.findAll", query="SELECT t FROM THotelCheckIn t")
public class THotelCheckIn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="check_in_name")
	private String checkInName;

	@Column(name="check_in_phone")
	private String checkInPhone;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="check_in_time")
	private Date checkInTime;

	@Column(name="member_id")
	private int memberId;

	@Column(name="order_number")
	private String orderNumber;

	private String outercode;

	private String outername;

	@Column(name="room_number")
	private String roomNumber;

	private int status;

	public THotelCheckIn() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCheckInName() {
		return this.checkInName;
	}

	public void setCheckInName(String checkInName) {
		this.checkInName = checkInName;
	}

	public String getCheckInPhone() {
		return this.checkInPhone;
	}

	public void setCheckInPhone(String checkInPhone) {
		this.checkInPhone = checkInPhone;
	}

	public Date getCheckInTime() {
		return this.checkInTime;
	}

	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOutercode() {
		return this.outercode;
	}

	public void setOutercode(String outercode) {
		this.outercode = outercode;
	}

	public String getOutername() {
		return this.outername;
	}

	public void setOutername(String outername) {
		this.outername = outername;
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}