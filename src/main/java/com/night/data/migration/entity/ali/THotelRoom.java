package com.night.data.migration.entity.ali;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the t_hotel_room database table.
 * 
 */
@Entity
@Table(name="t_hotel_room")
@NamedQuery(name="THotelRoom.findAll", query="SELECT t FROM THotelRoom t")
public class THotelRoom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="hotel_id")
	private Integer hotelId;

	@Column(name="integral_is_display")
	private Integer integralIsDisplay;

	@Column(name="is_fenbi")
	private Integer isFenbi;

	@Column(name="is_integral")
	private Integer isIntegral;

	private Double room_cashPledge;

	@Column(name="room_discount_price")
	private Double roomDiscountPrice;

	@Column(name="room_instruction")
	private String roomInstruction;

	@Column(name="room_integral")
	private Integer roomIntegral;

	@Column(name="room_introduce")
	private String roomIntroduce;

	private Integer room_is_cardVolume;

	@Column(name="room_is_discount_price")
	private Integer roomIsDiscountPrice;

	@Column(name="room_is_travel_price")
	private Integer roomIsTravelPrice;

	@Column(name="room_is_vipcard")
	private Integer roomIsVipcard;

	@Column(name="room_is_weekend_price")
	private Integer roomIsWeekendPrice;

	@Column(name="room_name")
	private String roomName;

	@Column(name="room_price")
	private Double roomPrice;

	@Column(name="room_seq")
	private Integer roomSeq;

	@Column(name="room_status")
	private Integer roomStatus;

	@Column(name="room_total_count")
	private Integer roomTotalCount;

	@Column(name="room_travel_price")
	private Double roomTravelPrice;

	@Column(name="room_vipcard_id")
	private Integer roomVipcardId;

	@Column(name="room_weekend_price")
	private Double roomWeekendPrice;

	public THotelRoom() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public Integer getIntegralIsDisplay() {
		return integralIsDisplay;
	}

	public void setIntegralIsDisplay(Integer integralIsDisplay) {
		this.integralIsDisplay = integralIsDisplay;
	}

	public Integer getIsFenbi() {
		return isFenbi;
	}

	public void setIsFenbi(Integer isFenbi) {
		this.isFenbi = isFenbi;
	}

	public Integer getIsIntegral() {
		return isIntegral;
	}

	public void setIsIntegral(Integer isIntegral) {
		this.isIntegral = isIntegral;
	}

	public Double getRoom_cashPledge() {
		return room_cashPledge;
	}

	public void setRoom_cashPledge(Double room_cashPledge) {
		this.room_cashPledge = room_cashPledge;
	}

	public Double getRoomDiscountPrice() {
		return roomDiscountPrice;
	}

	public void setRoomDiscountPrice(Double roomDiscountPrice) {
		this.roomDiscountPrice = roomDiscountPrice;
	}

	public String getRoomInstruction() {
		return roomInstruction;
	}

	public void setRoomInstruction(String roomInstruction) {
		this.roomInstruction = roomInstruction;
	}

	public Integer getRoomIntegral() {
		return roomIntegral;
	}

	public void setRoomIntegral(Integer roomIntegral) {
		this.roomIntegral = roomIntegral;
	}

	public String getRoomIntroduce() {
		return roomIntroduce;
	}

	public void setRoomIntroduce(String roomIntroduce) {
		this.roomIntroduce = roomIntroduce;
	}

	public Integer getRoom_is_cardVolume() {
		return room_is_cardVolume;
	}

	public void setRoom_is_cardVolume(Integer room_is_cardVolume) {
		this.room_is_cardVolume = room_is_cardVolume;
	}

	public Integer getRoomIsDiscountPrice() {
		return roomIsDiscountPrice;
	}

	public void setRoomIsDiscountPrice(Integer roomIsDiscountPrice) {
		this.roomIsDiscountPrice = roomIsDiscountPrice;
	}

	public Integer getRoomIsTravelPrice() {
		return roomIsTravelPrice;
	}

	public void setRoomIsTravelPrice(Integer roomIsTravelPrice) {
		this.roomIsTravelPrice = roomIsTravelPrice;
	}

	public Integer getRoomIsVipcard() {
		return roomIsVipcard;
	}

	public void setRoomIsVipcard(Integer roomIsVipcard) {
		this.roomIsVipcard = roomIsVipcard;
	}

	public Integer getRoomIsWeekendPrice() {
		return roomIsWeekendPrice;
	}

	public void setRoomIsWeekendPrice(Integer roomIsWeekendPrice) {
		this.roomIsWeekendPrice = roomIsWeekendPrice;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public Integer getRoomSeq() {
		return roomSeq;
	}

	public void setRoomSeq(Integer roomSeq) {
		this.roomSeq = roomSeq;
	}

	public Integer getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(Integer roomStatus) {
		this.roomStatus = roomStatus;
	}

	public Integer getRoomTotalCount() {
		return roomTotalCount;
	}

	public void setRoomTotalCount(Integer roomTotalCount) {
		this.roomTotalCount = roomTotalCount;
	}

	public Double getRoomTravelPrice() {
		return roomTravelPrice;
	}

	public void setRoomTravelPrice(Double roomTravelPrice) {
		this.roomTravelPrice = roomTravelPrice;
	}

	public Integer getRoomVipcardId() {
		return roomVipcardId;
	}

	public void setRoomVipcardId(Integer roomVipcardId) {
		this.roomVipcardId = roomVipcardId;
	}

	public Double getRoomWeekendPrice() {
		return roomWeekendPrice;
	}

	public void setRoomWeekendPrice(Double roomWeekendPrice) {
		this.roomWeekendPrice = roomWeekendPrice;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hotelId == null) ? 0 : hotelId.hashCode());
		result = prime * result + ((roomName == null) ? 0 : roomName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
        if (obj == null || getClass() != obj.getClass()) {
        	return false;
        }
		THotelRoom a = (THotelRoom) obj;
		if(this.hotelId.equals(a.getHotelId()) && this.roomName.equals(a.getRoomName())) {
			return true;
		}
		return false;
	}

}