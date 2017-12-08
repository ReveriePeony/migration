package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_hotel_room_order database table.
 * 
 */
@Entity
@Table(name="t_hotel_room_order")
@NamedQuery(name="THotelRoomOrder.findAll", query="SELECT t FROM THotelRoomOrder t")
public class THotelRoomOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer activityId;

	@Column(name="bus_id")
	private Integer busId;

	private String cardVolumeCode;

	private Double fenbi;

	@Column(name="hotel_id")
	private Integer hotelId;

	@Column(name="member_id")
	private Integer memberId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date order_createTime;

	@Column(name="order_num")
	private String orderNum;

	@Column(name="order_pay_status")
	private Integer orderPayStatus;

	@Column(name="order_pay_type")
	private Integer orderPayType;

	@Column(name="order_price")
	private Double orderPrice;

	@Column(name="order_remarks")
	private String orderRemarks;

	@Column(name="order_status")
	private Integer orderStatus;

	@Column(name="reserve_day_count")
	private Integer reserveDayCount;

	@Column(name="reserve_idcard")
	private String reserveIdcard;

	@Column(name="reserve_idcard_img")
	private String reserveIdcardImg;

	@Column(name="reserve_name")
	private String reserveName;

	@Column(name="reserve_number")
	private Integer reserveNumber;

	@Column(name="reserve_phone")
	private String reservePhone;

	@Column(name="room_id")
	private Integer roomId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="room_in_time")
	private Date roomInTime;

	@Column(name="room_num")
	private Integer roomNum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="room_out_time")
	private Date roomOutTime;

	public THotelRoomOrder() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public String getCardVolumeCode() {
		return cardVolumeCode;
	}

	public void setCardVolumeCode(String cardVolumeCode) {
		this.cardVolumeCode = cardVolumeCode;
	}

	public Double getFenbi() {
		return fenbi;
	}

	public void setFenbi(Double fenbi) {
		this.fenbi = fenbi;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Date getOrder_createTime() {
		return order_createTime;
	}

	public void setOrder_createTime(Date order_createTime) {
		this.order_createTime = order_createTime;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public Integer getOrderPayStatus() {
		return orderPayStatus;
	}

	public void setOrderPayStatus(Integer orderPayStatus) {
		this.orderPayStatus = orderPayStatus;
	}

	public Integer getOrderPayType() {
		return orderPayType;
	}

	public void setOrderPayType(Integer orderPayType) {
		this.orderPayType = orderPayType;
	}

	public Double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderRemarks() {
		return orderRemarks;
	}

	public void setOrderRemarks(String orderRemarks) {
		this.orderRemarks = orderRemarks;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getReserveDayCount() {
		return reserveDayCount;
	}

	public void setReserveDayCount(Integer reserveDayCount) {
		this.reserveDayCount = reserveDayCount;
	}

	public String getReserveIdcard() {
		return reserveIdcard;
	}

	public void setReserveIdcard(String reserveIdcard) {
		this.reserveIdcard = reserveIdcard;
	}

	public String getReserveIdcardImg() {
		return reserveIdcardImg;
	}

	public void setReserveIdcardImg(String reserveIdcardImg) {
		this.reserveIdcardImg = reserveIdcardImg;
	}

	public String getReserveName() {
		return reserveName;
	}

	public void setReserveName(String reserveName) {
		this.reserveName = reserveName;
	}

	public Integer getReserveNumber() {
		return reserveNumber;
	}

	public void setReserveNumber(Integer reserveNumber) {
		this.reserveNumber = reserveNumber;
	}

	public String getReservePhone() {
		return reservePhone;
	}

	public void setReservePhone(String reservePhone) {
		this.reservePhone = reservePhone;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Date getRoomInTime() {
		return roomInTime;
	}

	public void setRoomInTime(Date roomInTime) {
		this.roomInTime = roomInTime;
	}

	public Integer getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(Integer roomNum) {
		this.roomNum = roomNum;
	}

	public Date getRoomOutTime() {
		return roomOutTime;
	}

	public void setRoomOutTime(Date roomOutTime) {
		this.roomOutTime = roomOutTime;
	}

	

}