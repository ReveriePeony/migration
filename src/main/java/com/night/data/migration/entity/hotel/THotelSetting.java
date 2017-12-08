package com.night.data.migration.entity.hotel;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the t_hotel_setting database table.
 * 
 */
@Entity
@Table(name="t_hotel_setting")
@NamedQuery(name="THotelSetting.findAll", query="SELECT t FROM THotelSetting t")
public class THotelSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="hotel_id")
	private Integer hotelId;

	private String bulletin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="created_by")
	private Integer createdBy;

	@Column(name="food_pay_mode")
	private Integer foodPayMode;

	@Column(name="invoice_categorys")
	private String invoiceCategorys;

	@Column(name="notice_enable")
	private Integer noticeEnable;

	@Column(name="pay_mode")
	private Integer payMode;

	@Column(name="remnant_room_enable")
	private Integer remnantRoomEnable;

	@Column(name="reservation_check_out_enable")
	private Integer reservationCheckOutEnable;

	@Column(name="reservation_check_out_phone")
	private String reservationCheckOutPhone;

	@Column(name="room_reservation_enable")
	private Integer roomReservationEnable;

	@Column(name="sms_enable")
	private Integer smsEnable;

	@Column(name="sms_phone")
	private String smsPhone;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="updated_by")
	private Integer updatedBy;

	public THotelSetting() {
	}

	public Integer getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getBulletin() {
		return this.bulletin;
	}

	public void setBulletin(String bulletin) {
		this.bulletin = bulletin;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getFoodPayMode() {
		return this.foodPayMode;
	}

	public void setFoodPayMode(Integer foodPayMode) {
		this.foodPayMode = foodPayMode;
	}

	public String getInvoiceCategorys() {
		return this.invoiceCategorys;
	}

	public void setInvoiceCategorys(String invoiceCategorys) {
		this.invoiceCategorys = invoiceCategorys;
	}

	public Integer getNoticeEnable() {
		return this.noticeEnable;
	}

	public void setNoticeEnable(Integer noticeEnable) {
		this.noticeEnable = noticeEnable;
	}

	public Integer getPayMode() {
		return this.payMode;
	}

	public void setPayMode(Integer payMode) {
		this.payMode = payMode;
	}

	public Integer getRemnantRoomEnable() {
		return this.remnantRoomEnable;
	}

	public void setRemnantRoomEnable(Integer remnantRoomEnable) {
		this.remnantRoomEnable = remnantRoomEnable;
	}

	public Integer getReservationCheckOutEnable() {
		return this.reservationCheckOutEnable;
	}

	public void setReservationCheckOutEnable(Integer reservationCheckOutEnable) {
		this.reservationCheckOutEnable = reservationCheckOutEnable;
	}

	public String getReservationCheckOutPhone() {
		return this.reservationCheckOutPhone;
	}

	public void setReservationCheckOutPhone(String reservationCheckOutPhone) {
		this.reservationCheckOutPhone = reservationCheckOutPhone;
	}

	public Integer getRoomReservationEnable() {
		return this.roomReservationEnable;
	}

	public void setRoomReservationEnable(Integer roomReservationEnable) {
		this.roomReservationEnable = roomReservationEnable;
	}

	public Integer getSmsEnable() {
		return this.smsEnable;
	}

	public void setSmsEnable(Integer smsEnable) {
		this.smsEnable = smsEnable;
	}

	public String getSmsPhone() {
		return this.smsPhone;
	}

	public void setSmsPhone(String smsPhone) {
		this.smsPhone = smsPhone;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

}