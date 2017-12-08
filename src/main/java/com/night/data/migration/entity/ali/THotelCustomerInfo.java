package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hotel_customer_info database table.
 * 
 */
@Entity
@Table(name="t_hotel_customer_info")
@NamedQuery(name="THotelCustomerInfo.findAll", query="SELECT t FROM THotelCustomerInfo t")
public class THotelCustomerInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="hotel_id")
	private Integer hotelId;

	@Column(name="hotel_is_idcard_image")
	private Integer hotelIsIdcardImage;

	@Column(name="hotel_is_idcard_number")
	private Integer hotelIsIdcardNumber;

	@Column(name="hotel_is_remarks")
	private Integer hotelIsRemarks;

	@Column(name="hotel_is_reserve_man")
	private Integer hotelIsReserveMan;

	@Column(name="hotel_is_reserve_phone")
	private Integer hotelIsReservePhone;

	public THotelCustomerInfo() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public Integer getHotelIsIdcardImage() {
		return this.hotelIsIdcardImage;
	}

	public void setHotelIsIdcardImage(Integer hotelIsIdcardImage) {
		this.hotelIsIdcardImage = hotelIsIdcardImage;
	}

	public Integer getHotelIsIdcardNumber() {
		return this.hotelIsIdcardNumber;
	}

	public void setHotelIsIdcardNumber(Integer hotelIsIdcardNumber) {
		this.hotelIsIdcardNumber = hotelIsIdcardNumber;
	}

	public Integer getHotelIsRemarks() {
		return this.hotelIsRemarks;
	}

	public void setHotelIsRemarks(Integer hotelIsRemarks) {
		this.hotelIsRemarks = hotelIsRemarks;
	}

	public Integer getHotelIsReserveMan() {
		return this.hotelIsReserveMan;
	}

	public void setHotelIsReserveMan(Integer hotelIsReserveMan) {
		this.hotelIsReserveMan = hotelIsReserveMan;
	}

	public Integer getHotelIsReservePhone() {
		return this.hotelIsReservePhone;
	}

	public void setHotelIsReservePhone(Integer hotelIsReservePhone) {
		this.hotelIsReservePhone = hotelIsReservePhone;
	}

}