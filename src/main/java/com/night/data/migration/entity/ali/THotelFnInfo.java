package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hotel_fn_info database table.
 * 
 */
@Entity
@Table(name="t_hotel_fn_info")
@NamedQuery(name="THotelFnInfo.findAll", query="SELECT t FROM THotelFnInfo t")
public class THotelFnInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="hotel_announcement")
	private String hotelAnnouncement;

	@Column(name="hotel_check_out_phone")
	private String hotelCheckOutPhone;

	@Column(name="hotel_food_status")
	private Integer hotelFoodStatus;

	@Column(name="hotel_id")
	private Integer hotelId;

	@Column(name="hotel_invoice_prompt")
	private String hotelInvoicePrompt;

	@Column(name="hotel_is_announcement")
	private Integer hotelIsAnnouncement;

	@Column(name="hotel_is_check_out")
	private Integer hotelIsCheckOut;

	@Column(name="hotel_is_food")
	private Integer hotelIsFood;

	@Column(name="hotel_is_idcard")
	private Integer hotelIsIdcard;

	private Integer hotel_is_idcardImg;

	@Column(name="hotel_is_invoice")
	private Integer hotelIsInvoice;

	@Column(name="hotel_is_link_qq")
	private Integer hotelIsLinkQq;

	@Column(name="hotel_is_order_mail")
	private Integer hotelIsOrderMail;

	@Column(name="hotel_is_order_phone")
	private Integer hotelIsOrderPhone;

	@Column(name="hotel_is_room_amount")
	private Integer hotelIsRoomAmount;

	@Column(name="hotel_is_travel")
	private Integer hotelIsTravel;

	@Column(name="hotel_is_vipcard")
	private Integer hotelIsVipcard;

	@Column(name="hotel_link_qq_num")
	private String hotelLinkQqNum;

	@Column(name="hotel_noinvoice_prompt")
	private String hotelNoinvoicePrompt;

	@Column(name="hotel_order_mail")
	private String hotelOrderMail;

	@Column(name="hotel_order_phone")
	private String hotelOrderPhone;

	@Column(name="hotel_pay_type")
	private Integer hotelPayType;

	@Column(name="hotel_vipcard_id")
	private Integer hotelVipcardId;

	private Integer isSendSms4Member;

	public THotelFnInfo() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHotelAnnouncement() {
		return this.hotelAnnouncement;
	}

	public void setHotelAnnouncement(String hotelAnnouncement) {
		this.hotelAnnouncement = hotelAnnouncement;
	}

	public String getHotelCheckOutPhone() {
		return this.hotelCheckOutPhone;
	}

	public void setHotelCheckOutPhone(String hotelCheckOutPhone) {
		this.hotelCheckOutPhone = hotelCheckOutPhone;
	}

	public Integer getHotelFoodStatus() {
		return this.hotelFoodStatus;
	}

	public void setHotelFoodStatus(Integer hotelFoodStatus) {
		this.hotelFoodStatus = hotelFoodStatus;
	}

	public Integer getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelInvoicePrompt() {
		return this.hotelInvoicePrompt;
	}

	public void setHotelInvoicePrompt(String hotelInvoicePrompt) {
		this.hotelInvoicePrompt = hotelInvoicePrompt;
	}

	public Integer getHotelIsAnnouncement() {
		return this.hotelIsAnnouncement;
	}

	public void setHotelIsAnnouncement(Integer hotelIsAnnouncement) {
		this.hotelIsAnnouncement = hotelIsAnnouncement;
	}

	public Integer getHotelIsCheckOut() {
		return this.hotelIsCheckOut;
	}

	public void setHotelIsCheckOut(Integer hotelIsCheckOut) {
		this.hotelIsCheckOut = hotelIsCheckOut;
	}

	public Integer getHotelIsFood() {
		return this.hotelIsFood;
	}

	public void setHotelIsFood(Integer hotelIsFood) {
		this.hotelIsFood = hotelIsFood;
	}

	public Integer getHotelIsIdcard() {
		return this.hotelIsIdcard;
	}

	public void setHotelIsIdcard(Integer hotelIsIdcard) {
		this.hotelIsIdcard = hotelIsIdcard;
	}

	public Integer getHotel_is_idcardImg() {
		return this.hotel_is_idcardImg;
	}

	public void setHotel_is_idcardImg(Integer hotel_is_idcardImg) {
		this.hotel_is_idcardImg = hotel_is_idcardImg;
	}

	public Integer getHotelIsInvoice() {
		return this.hotelIsInvoice;
	}

	public void setHotelIsInvoice(Integer hotelIsInvoice) {
		this.hotelIsInvoice = hotelIsInvoice;
	}

	public Integer getHotelIsLinkQq() {
		return this.hotelIsLinkQq;
	}

	public void setHotelIsLinkQq(Integer hotelIsLinkQq) {
		this.hotelIsLinkQq = hotelIsLinkQq;
	}

	public Integer getHotelIsOrderMail() {
		return this.hotelIsOrderMail;
	}

	public void setHotelIsOrderMail(Integer hotelIsOrderMail) {
		this.hotelIsOrderMail = hotelIsOrderMail;
	}

	public Integer getHotelIsOrderPhone() {
		return this.hotelIsOrderPhone;
	}

	public void setHotelIsOrderPhone(Integer hotelIsOrderPhone) {
		this.hotelIsOrderPhone = hotelIsOrderPhone;
	}

	public Integer getHotelIsRoomAmount() {
		return this.hotelIsRoomAmount;
	}

	public void setHotelIsRoomAmount(Integer hotelIsRoomAmount) {
		this.hotelIsRoomAmount = hotelIsRoomAmount;
	}

	public Integer getHotelIsTravel() {
		return this.hotelIsTravel;
	}

	public void setHotelIsTravel(Integer hotelIsTravel) {
		this.hotelIsTravel = hotelIsTravel;
	}

	public Integer getHotelIsVipcard() {
		return this.hotelIsVipcard;
	}

	public void setHotelIsVipcard(Integer hotelIsVipcard) {
		this.hotelIsVipcard = hotelIsVipcard;
	}

	public String getHotelLinkQqNum() {
		return this.hotelLinkQqNum;
	}

	public void setHotelLinkQqNum(String hotelLinkQqNum) {
		this.hotelLinkQqNum = hotelLinkQqNum;
	}

	public String getHotelNoinvoicePrompt() {
		return this.hotelNoinvoicePrompt;
	}

	public void setHotelNoinvoicePrompt(String hotelNoinvoicePrompt) {
		this.hotelNoinvoicePrompt = hotelNoinvoicePrompt;
	}

	public String getHotelOrderMail() {
		return this.hotelOrderMail;
	}

	public void setHotelOrderMail(String hotelOrderMail) {
		this.hotelOrderMail = hotelOrderMail;
	}

	public String getHotelOrderPhone() {
		return this.hotelOrderPhone;
	}

	public void setHotelOrderPhone(String hotelOrderPhone) {
		this.hotelOrderPhone = hotelOrderPhone;
	}

	public Integer getHotelPayType() {
		return this.hotelPayType;
	}

	public void setHotelPayType(Integer hotelPayType) {
		this.hotelPayType = hotelPayType;
	}

	public Integer getHotelVipcardId() {
		return this.hotelVipcardId;
	}

	public void setHotelVipcardId(Integer hotelVipcardId) {
		this.hotelVipcardId = hotelVipcardId;
	}

	public Integer getIsSendSms4Member() {
		return this.isSendSms4Member;
	}

	public void setIsSendSms4Member(Integer isSendSms4Member) {
		this.isSendSms4Member = isSendSms4Member;
	}

}