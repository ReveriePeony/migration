package model;

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
	private int id;

	@Column(name="hotel_announcement")
	private String hotelAnnouncement;

	@Column(name="hotel_check_out_phone")
	private String hotelCheckOutPhone;

	@Column(name="hotel_food_status")
	private int hotelFoodStatus;

	@Column(name="hotel_id")
	private int hotelId;

	@Column(name="hotel_invoice_prompt")
	private String hotelInvoicePrompt;

	@Column(name="hotel_is_announcement")
	private int hotelIsAnnouncement;

	@Column(name="hotel_is_check_out")
	private int hotelIsCheckOut;

	@Column(name="hotel_is_food")
	private int hotelIsFood;

	@Column(name="hotel_is_idcard")
	private int hotelIsIdcard;

	private int hotel_is_idcardImg;

	@Column(name="hotel_is_invoice")
	private int hotelIsInvoice;

	@Column(name="hotel_is_link_qq")
	private int hotelIsLinkQq;

	@Column(name="hotel_is_order_mail")
	private int hotelIsOrderMail;

	@Column(name="hotel_is_order_phone")
	private int hotelIsOrderPhone;

	@Column(name="hotel_is_room_amount")
	private int hotelIsRoomAmount;

	@Column(name="hotel_is_travel")
	private int hotelIsTravel;

	@Column(name="hotel_is_vipcard")
	private int hotelIsVipcard;

	@Column(name="hotel_link_qq_num")
	private String hotelLinkQqNum;

	@Column(name="hotel_noinvoice_prompt")
	private String hotelNoinvoicePrompt;

	@Column(name="hotel_order_mail")
	private String hotelOrderMail;

	@Column(name="hotel_order_phone")
	private String hotelOrderPhone;

	@Column(name="hotel_pay_type")
	private int hotelPayType;

	@Column(name="hotel_vipcard_id")
	private int hotelVipcardId;

	private int isSendSms4Member;

	public THotelFnInfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
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

	public int getHotelFoodStatus() {
		return this.hotelFoodStatus;
	}

	public void setHotelFoodStatus(int hotelFoodStatus) {
		this.hotelFoodStatus = hotelFoodStatus;
	}

	public int getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelInvoicePrompt() {
		return this.hotelInvoicePrompt;
	}

	public void setHotelInvoicePrompt(String hotelInvoicePrompt) {
		this.hotelInvoicePrompt = hotelInvoicePrompt;
	}

	public int getHotelIsAnnouncement() {
		return this.hotelIsAnnouncement;
	}

	public void setHotelIsAnnouncement(int hotelIsAnnouncement) {
		this.hotelIsAnnouncement = hotelIsAnnouncement;
	}

	public int getHotelIsCheckOut() {
		return this.hotelIsCheckOut;
	}

	public void setHotelIsCheckOut(int hotelIsCheckOut) {
		this.hotelIsCheckOut = hotelIsCheckOut;
	}

	public int getHotelIsFood() {
		return this.hotelIsFood;
	}

	public void setHotelIsFood(int hotelIsFood) {
		this.hotelIsFood = hotelIsFood;
	}

	public int getHotelIsIdcard() {
		return this.hotelIsIdcard;
	}

	public void setHotelIsIdcard(int hotelIsIdcard) {
		this.hotelIsIdcard = hotelIsIdcard;
	}

	public int getHotel_is_idcardImg() {
		return this.hotel_is_idcardImg;
	}

	public void setHotel_is_idcardImg(int hotel_is_idcardImg) {
		this.hotel_is_idcardImg = hotel_is_idcardImg;
	}

	public int getHotelIsInvoice() {
		return this.hotelIsInvoice;
	}

	public void setHotelIsInvoice(int hotelIsInvoice) {
		this.hotelIsInvoice = hotelIsInvoice;
	}

	public int getHotelIsLinkQq() {
		return this.hotelIsLinkQq;
	}

	public void setHotelIsLinkQq(int hotelIsLinkQq) {
		this.hotelIsLinkQq = hotelIsLinkQq;
	}

	public int getHotelIsOrderMail() {
		return this.hotelIsOrderMail;
	}

	public void setHotelIsOrderMail(int hotelIsOrderMail) {
		this.hotelIsOrderMail = hotelIsOrderMail;
	}

	public int getHotelIsOrderPhone() {
		return this.hotelIsOrderPhone;
	}

	public void setHotelIsOrderPhone(int hotelIsOrderPhone) {
		this.hotelIsOrderPhone = hotelIsOrderPhone;
	}

	public int getHotelIsRoomAmount() {
		return this.hotelIsRoomAmount;
	}

	public void setHotelIsRoomAmount(int hotelIsRoomAmount) {
		this.hotelIsRoomAmount = hotelIsRoomAmount;
	}

	public int getHotelIsTravel() {
		return this.hotelIsTravel;
	}

	public void setHotelIsTravel(int hotelIsTravel) {
		this.hotelIsTravel = hotelIsTravel;
	}

	public int getHotelIsVipcard() {
		return this.hotelIsVipcard;
	}

	public void setHotelIsVipcard(int hotelIsVipcard) {
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

	public int getHotelPayType() {
		return this.hotelPayType;
	}

	public void setHotelPayType(int hotelPayType) {
		this.hotelPayType = hotelPayType;
	}

	public int getHotelVipcardId() {
		return this.hotelVipcardId;
	}

	public void setHotelVipcardId(int hotelVipcardId) {
		this.hotelVipcardId = hotelVipcardId;
	}

	public int getIsSendSms4Member() {
		return this.isSendSms4Member;
	}

	public void setIsSendSms4Member(int isSendSms4Member) {
		this.isSendSms4Member = isSendSms4Member;
	}

}