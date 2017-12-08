package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_hotel_check_out database table.
 * 
 */
@Entity
@Table(name="t_hotel_check_out")
@NamedQuery(name="THotelCheckOut.findAll", query="SELECT t FROM THotelCheckOut t")
public class THotelCheckOut implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="check_out_time")
	private Date checkOutTime;

	@Column(name="hote_id")
	private int hoteId;

	@Column(name="invoice_category")
	private String invoiceCategory;

	@Column(name="invoice_title")
	private String invoiceTitle;

	@Column(name="room_number")
	private String roomNumber;

	public THotelCheckOut() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCheckOutTime() {
		return this.checkOutTime;
	}

	public void setCheckOutTime(Date checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public int getHoteId() {
		return this.hoteId;
	}

	public void setHoteId(int hoteId) {
		this.hoteId = hoteId;
	}

	public String getInvoiceCategory() {
		return this.invoiceCategory;
	}

	public void setInvoiceCategory(String invoiceCategory) {
		this.invoiceCategory = invoiceCategory;
	}

	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

}