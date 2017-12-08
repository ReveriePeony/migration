package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hotel_cash_pledge database table.
 * 
 */
@Entity
@Table(name="t_hotel_cash_pledge")
@NamedQuery(name="THotelCashPledge.findAll", query="SELECT t FROM THotelCashPledge t")
public class THotelCashPledge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="book_name")
	private String bookName;

	@Column(name="book_phone")
	private String bookPhone;

	@Column(name="bus_id")
	private Integer busId;

	@Column(name="cash_pledge")
	private Double cashPledge;

	@Column(name="check_in_time")
	private String checkInTime;

	@Column(name="check_out_time")
	private String checkOutTime;

	private String createtime;

	@Column(name="hotel_id")
	private Integer hotelId;

	private Integer lookStatus;

	@Column(name="member_id")
	private Integer memberId;

	@Column(name="order_id")
	private String orderId;

	private Double refunds;

	@Column(name="refunds_explain")
	private String refundsExplain;

	private Integer status;

	public THotelCashPledge() {
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

	public String getBookPhone() {
		return bookPhone;
	}

	public void setBookPhone(String bookPhone) {
		this.bookPhone = bookPhone;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public Double getCashPledge() {
		return cashPledge;
	}

	public void setCashPledge(Double cashPledge) {
		this.cashPledge = cashPledge;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public Integer getLookStatus() {
		return lookStatus;
	}

	public void setLookStatus(Integer lookStatus) {
		this.lookStatus = lookStatus;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Double getRefunds() {
		return refunds;
	}

	public void setRefunds(Double refunds) {
		this.refunds = refunds;
	}

	public String getRefundsExplain() {
		return refundsExplain;
	}

	public void setRefundsExplain(String refundsExplain) {
		this.refundsExplain = refundsExplain;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	
}