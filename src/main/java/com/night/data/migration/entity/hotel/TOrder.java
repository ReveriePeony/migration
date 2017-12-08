package com.night.data.migration.entity.hotel;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the t_order database table.
 * 
 */
@Entity
@Table(name="t_order")
@NamedQuery(name="TOrder.findAll", query="SELECT t FROM TOrder t")
public class TOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="bill_price")
	private Integer billPrice;

	@Column(name="bus_id")
	private Integer busId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="completion_time")
	private Date completionTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="created_by")
	private Integer createdBy;

	private Integer fb;

	@Column(name="fb_discount")
	private Integer fbDiscount;

	@Column(name="hotel_id")
	private Integer hotelId;

	private Integer integral;

	@Column(name="integral_discount")
	private Integer integralDiscount;

	@Column(name="mark_modified")
	private Integer markModified;

	@Column(name="member_id")
	private Integer memberId;

	@Column(name="order_coupons_id")
	private Integer orderCouponsId;

	@Column(name="order_num")
	private String orderNum;

	@Column(name="order_status")
	private Integer orderStatus;

	@Column(name="pay_status")
	private Integer payStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pay_time")
	private Date payTime;

	@Column(name="pay_type")
	private Integer payType;

	@Column(name="real_price")
	private Integer realPrice;

	@Column(name="receivable_price")
	private Integer receivablePrice;

	@Column(name="refund_amount")
	private Integer refundAmount = 0;

	@Column(name="refund_reason")
	private String refundReason;

	private String remark;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="updated_by")
	private Integer updatedBy;

	public TOrder() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBillPrice() {
		return billPrice;
	}

	public void setBillPrice(Integer billPrice) {
		this.billPrice = billPrice;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public Date getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(Date completionTime) {
		this.completionTime = completionTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getFb() {
		return fb;
	}

	public void setFb(Integer fb) {
		this.fb = fb;
	}

	public Integer getFbDiscount() {
		return fbDiscount;
	}

	public void setFbDiscount(Integer fbDiscount) {
		this.fbDiscount = fbDiscount;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public Integer getIntegralDiscount() {
		return integralDiscount;
	}

	public void setIntegralDiscount(Integer integralDiscount) {
		this.integralDiscount = integralDiscount;
	}

	public Integer getMarkModified() {
		return markModified;
	}

	public void setMarkModified(Integer markModified) {
		this.markModified = markModified;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getOrderCouponsId() {
		return orderCouponsId;
	}

	public void setOrderCouponsId(Integer orderCouponsId) {
		this.orderCouponsId = orderCouponsId;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Integer getRealPrice() {
		return realPrice;
	}

	public void setRealPrice(Integer realPrice) {
		this.realPrice = realPrice;
	}

	public Integer getReceivablePrice() {
		return receivablePrice;
	}

	public void setReceivablePrice(Integer receivablePrice) {
		this.receivablePrice = receivablePrice;
	}

	public Integer getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(Integer refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return refundReason;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

}