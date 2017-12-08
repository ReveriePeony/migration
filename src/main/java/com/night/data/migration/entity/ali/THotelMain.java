package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_hotel_main database table.
 * 
 */
@Entity
@Table(name="t_hotel_main")
@NamedQuery(name="THotelMain.findAll", query="SELECT t FROM THotelMain t")
public class THotelMain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="hotel_address")
	private String hotelAddress;

	@Column(name="hotel_branch_id")
	private Integer hotelBranchId;

	@Column(name="hotel_bus_id")
	private Integer hotelBusId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="hotel_createtime")
	private Date hotelCreatetime;

	@Column(name="hotel_introduction")
	private String hotelIntroduction;

	@Column(name="hotel_latitude")
	private String hotelLatitude;

	@Column(name="hotel_level")
	private Integer hotelLevel;

	@Column(name="hotel_longitude")
	private String hotelLongitude;

	@Column(name="hotel_name")
	private String hotelName;

	@Column(name="hotel_phone")
	private String hotelPhone;

	@Column(name="hotel_pid")
	private Integer hotelPid;

	@Column(name="hotel_status")
	private Integer hotelStatus;

	@Column(name="hotel_type")
	private Integer hotelType;

	private String outerhotelid;

	private Integer room_bargainPrice;

	private Integer room_buyTicket;

	private Integer room_callCar;

	private Integer room_continuedToLive;

	private Integer room_groupBuy;

	@Column(name="room_spike")
	private Integer roomSpike;

	private Integer room_whenRent;

	@Column(name="shop_id")
	private Integer shopId;

	public THotelMain() {
	}

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getHotelAddress() {
		return hotelAddress;
	}



	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}



	public Integer getHotelBranchId() {
		return hotelBranchId;
	}



	public void setHotelBranchId(Integer hotelBranchId) {
		this.hotelBranchId = hotelBranchId;
	}



	public Integer getHotelBusId() {
		return hotelBusId;
	}



	public void setHotelBusId(Integer hotelBusId) {
		this.hotelBusId = hotelBusId;
	}



	public Date getHotelCreatetime() {
		return hotelCreatetime;
	}



	public void setHotelCreatetime(Date hotelCreatetime) {
		this.hotelCreatetime = hotelCreatetime;
	}



	public String getHotelIntroduction() {
		return hotelIntroduction;
	}



	public void setHotelIntroduction(String hotelIntroduction) {
		this.hotelIntroduction = hotelIntroduction;
	}



	public String getHotelLatitude() {
		return hotelLatitude;
	}



	public void setHotelLatitude(String hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}



	public Integer getHotelLevel() {
		return hotelLevel;
	}



	public void setHotelLevel(Integer hotelLevel) {
		this.hotelLevel = hotelLevel;
	}



	public String getHotelLongitude() {
		return hotelLongitude;
	}



	public void setHotelLongitude(String hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}



	public String getHotelName() {
		return hotelName;
	}



	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}



	public String getHotelPhone() {
		return hotelPhone;
	}



	public void setHotelPhone(String hotelPhone) {
		this.hotelPhone = hotelPhone;
	}



	public Integer getHotelPid() {
		return hotelPid;
	}



	public void setHotelPid(Integer hotelPid) {
		this.hotelPid = hotelPid;
	}



	public Integer getHotelStatus() {
		return hotelStatus;
	}



	public void setHotelStatus(Integer hotelStatus) {
		this.hotelStatus = hotelStatus;
	}



	public Integer getHotelType() {
		return hotelType;
	}



	public void setHotelType(Integer hotelType) {
		this.hotelType = hotelType;
	}



	public String getOuterhotelid() {
		return outerhotelid;
	}



	public void setOuterhotelid(String outerhotelid) {
		this.outerhotelid = outerhotelid;
	}



	public Integer getRoom_bargainPrice() {
		return room_bargainPrice;
	}



	public void setRoom_bargainPrice(Integer room_bargainPrice) {
		this.room_bargainPrice = room_bargainPrice;
	}



	public Integer getRoom_buyTicket() {
		return room_buyTicket;
	}



	public void setRoom_buyTicket(Integer room_buyTicket) {
		this.room_buyTicket = room_buyTicket;
	}



	public Integer getRoom_callCar() {
		return room_callCar;
	}



	public void setRoom_callCar(Integer room_callCar) {
		this.room_callCar = room_callCar;
	}



	public Integer getRoom_continuedToLive() {
		return room_continuedToLive;
	}



	public void setRoom_continuedToLive(Integer room_continuedToLive) {
		this.room_continuedToLive = room_continuedToLive;
	}



	public Integer getRoom_groupBuy() {
		return room_groupBuy;
	}



	public void setRoom_groupBuy(Integer room_groupBuy) {
		this.room_groupBuy = room_groupBuy;
	}



	public Integer getRoomSpike() {
		return roomSpike;
	}



	public void setRoomSpike(Integer roomSpike) {
		this.roomSpike = roomSpike;
	}



	public Integer getRoom_whenRent() {
		return room_whenRent;
	}



	public void setRoom_whenRent(Integer room_whenRent) {
		this.room_whenRent = room_whenRent;
	}



	public Integer getShopId() {
		return shopId;
	}



	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}



	@Override
	public String toString() {
		return "THotelMain [id=" + id + ", hotelAddress=" + hotelAddress + ", hotelBranchId=" + hotelBranchId
				+ ", hotelBusId=" + hotelBusId + ", hotelCreatetime=" + hotelCreatetime + ", hotelIntroduction="
				+ hotelIntroduction + ", hotelLatitude=" + hotelLatitude + ", hotelLevel=" + hotelLevel
				+ ", hotelLongitude=" + hotelLongitude + ", hotelName=" + hotelName + ", hotelPhone=" + hotelPhone
				+ ", hotelPid=" + hotelPid + ", hotelStatus=" + hotelStatus + ", hotelType=" + hotelType
				+ ", outerhotelid=" + outerhotelid + ", room_bargainPrice=" + room_bargainPrice + ", room_buyTicket="
				+ room_buyTicket + ", room_callCar=" + room_callCar + ", room_continuedToLive=" + room_continuedToLive
				+ ", room_groupBuy=" + room_groupBuy + ", roomSpike=" + roomSpike + ", room_whenRent=" + room_whenRent
				+ ", shopId=" + shopId + "]";
	}

	
}