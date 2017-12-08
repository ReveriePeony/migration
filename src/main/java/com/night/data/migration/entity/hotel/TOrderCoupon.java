package com.night.data.migration.entity.hotel;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_order_coupons database table.
 * 
 */
@Entity
@Table(name="t_order_coupons")
@NamedQuery(name="TOrderCoupon.findAll", query="SELECT t FROM TOrderCoupon t")
public class TOrderCoupon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name="coupons_code")
	private String couponsCode;

	@Column(name="coupons_discount")
	private Integer couponsDiscount;

	@Column(name="coupons_id")
	private Integer couponsId;

	@Column(name="coupons_num")
	private Integer couponsNum;

	@Column(name="order_id")
	private Integer orderId;

	@Column(name="order_num")
	private String orderNum;

	public TOrderCoupon() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCouponsCode() {
		return couponsCode;
	}

	public void setCouponsCode(String couponsCode) {
		this.couponsCode = couponsCode;
	}

	public Integer getCouponsDiscount() {
		return couponsDiscount;
	}

	public void setCouponsDiscount(Integer couponsDiscount) {
		this.couponsDiscount = couponsDiscount;
	}

	public Integer getCouponsId() {
		return couponsId;
	}

	public void setCouponsId(Integer couponsId) {
		this.couponsId = couponsId;
	}

	public Integer getCouponsNum() {
		return couponsNum;
	}

	public void setCouponsNum(Integer couponsNum) {
		this.couponsNum = couponsNum;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}


}