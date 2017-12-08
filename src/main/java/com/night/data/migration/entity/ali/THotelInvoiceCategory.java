package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hotel_invoice_category database table.
 * 
 */
@Entity
@Table(name="t_hotel_invoice_category")
@NamedQuery(name="THotelInvoiceCategory.findAll", query="SELECT t FROM THotelInvoiceCategory t")
public class THotelInvoiceCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="hotel_id")
	private Integer hotelId;

	@Column(name="hotel_invoice_type")
	private Integer hotelInvoiceType;

	public THotelInvoiceCategory() {
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

	public Integer getHotelInvoiceType() {
		return this.hotelInvoiceType;
	}

	public void setHotelInvoiceType(Integer hotelInvoiceType) {
		this.hotelInvoiceType = hotelInvoiceType;
	}

}