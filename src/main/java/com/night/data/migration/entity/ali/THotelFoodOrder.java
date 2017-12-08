package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_hotel_food_order database table.
 * 
 */
@Entity
@Table(name="t_hotel_food_order")
@NamedQuery(name="THotelFoodOrder.findAll", query="SELECT t FROM THotelFoodOrder t")
public class THotelFoodOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="book_name")
	private String bookName;

	@Column(name="bus_id")
	private Integer busId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createtime;

	@Column(name="hotel_id")
	private Integer hotelId;

	@Column(name="invoice_title")
	private String invoiceTitle;

	@Column(name="order_code")
	private String orderCode;

	@Column(name="order_memberid")
	private Integer orderMemberid;

	@Column(name="order_pay")
	private Double orderPay;

	@Column(name="order_pay_status")
	private Integer orderPayStatus;

	@Column(name="order_pay_type")
	private Integer orderPayType;

	@Column(name="order_remarks")
	private String orderRemarks;

	@Column(name="order_status")
	private Integer orderStatus;

	private String phone;

	@Column(name="room_num")
	private String roomNum;

	public THotelFoodOrder() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getInvoiceTitle() {
		return invoiceTitle;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getOrderMemberid() {
		return orderMemberid;
	}

	public void setOrderMemberid(Integer orderMemberid) {
		this.orderMemberid = orderMemberid;
	}

	public Double getOrderPay() {
		return orderPay;
	}

	public void setOrderPay(Double orderPay) {
		this.orderPay = orderPay;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	

}