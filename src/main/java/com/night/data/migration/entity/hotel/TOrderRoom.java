package com.night.data.migration.entity.hotel;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the t_order_room database table.
 * 
 */
@Entity
@Table(name="t_order_room")
@NamedQuery(name="TOrderRoom.findAll", query="SELECT t FROM TOrderRoom t")
public class TOrderRoom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name="activity_id")
	private Integer activityId;

	@Column(name="category_id")
	private Integer categoryId;

	@Column(name="category_name")
	private String categoryName;

	@Column(name="check_in_way")
	private Integer checkInWay;

	@Column(name="check_out_instructions")
	private String checkOutInstructions;

	@Column(name="check_standard")
	private Integer checkStandard;

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

	@Column(name="customer_gender")
	private Integer customerGender;

	@Column(name="customer_id_card")
	private String customerIdCard;

	@Column(name="customer_id_card_image")
	private String customerIdCardImage;

	@Column(name="customer_id_type")
	private Integer customerIdType;

	@Column(name="customer_name")
	private String customerName;

	@Column(name="customer_phone")
	private String customerPhone;

	private Integer deposit;

	@Column(name="deposit_visible")
	private Integer depositVisible;

	@Column(name="order_from")
	private Integer orderFrom;

	@Column(name="guest_type")
	private Integer guestType;

	@Column(name="hotel_id")
	private Integer hotelId;

	@Column(name="hotel_name")
	private String hotelName;

	@Column(name="hour_room_check_in_time")
	private Time hourRoomCheckInTime;

	@Column(name="mark_modified")
	private Integer markModified;

	private Integer number;

	@Column(name="order_id")
	private Integer orderId;

	@Column(name="order_num")
	private String orderNum;

	@Column(name="pay_status")
	private Integer payStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pay_time")
	private Date payTime;

	@Column(name="rack_rate")
	private Integer rackRate;

	@Column(name="receivable_price")
	private Integer receivablePrice;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="room_in_time")
	private Date roomInTime;

	@Column(name="room_num")
	private String roomNum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="room_out_time")
	private Date roomOutTime;

	@Column(name="room_price")
	private Integer roomPrice;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="updated_by")
	private Integer updatedBy;

	public TOrderRoom() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getCheckInWay() {
		return checkInWay;
	}

	public void setCheckInWay(Integer checkInWay) {
		this.checkInWay = checkInWay;
	}

	public String getCheckOutInstructions() {
		return checkOutInstructions;
	}

	public void setCheckOutInstructions(String checkOutInstructions) {
		this.checkOutInstructions = checkOutInstructions;
	}

	public Integer getCheckStandard() {
		return checkStandard;
	}

	public void setCheckStandard(Integer checkStandard) {
		this.checkStandard = checkStandard;
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

	public Integer getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(Integer customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerIdCard() {
		return customerIdCard;
	}

	public void setCustomerIdCard(String customerIdCard) {
		this.customerIdCard = customerIdCard;
	}

	public String getCustomerIdCardImage() {
		return customerIdCardImage;
	}

	public void setCustomerIdCardImage(String customerIdCardImage) {
		this.customerIdCardImage = customerIdCardImage;
	}

	public Integer getCustomerIdType() {
		return customerIdType;
	}

	public void setCustomerIdType(Integer customerIdType) {
		this.customerIdType = customerIdType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Integer getDeposit() {
		return deposit;
	}

	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}

	public Integer getDepositVisible() {
		return depositVisible;
	}

	public void setDepositVisible(Integer depositVisible) {
		this.depositVisible = depositVisible;
	}

	public Integer getOrderFrom() {
		return orderFrom;
	}

	public void setOrderFrom(Integer orderFrom) {
		this.orderFrom = orderFrom;
	}

	public Integer getGuestType() {
		return guestType;
	}

	public void setGuestType(Integer guestType) {
		this.guestType = guestType;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Time getHourRoomCheckInTime() {
		return hourRoomCheckInTime;
	}

	public void setHourRoomCheckInTime(Time hourRoomCheckInTime) {
		this.hourRoomCheckInTime = hourRoomCheckInTime;
	}

	public Integer getMarkModified() {
		return markModified;
	}

	public void setMarkModified(Integer markModified) {
		this.markModified = markModified;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
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

	public Integer getRackRate() {
		return rackRate;
	}

	public void setRackRate(Integer rackRate) {
		this.rackRate = rackRate;
	}

	public Integer getReceivablePrice() {
		return receivablePrice;
	}

	public void setReceivablePrice(Integer receivablePrice) {
		this.receivablePrice = receivablePrice;
	}

	public Date getRoomInTime() {
		return roomInTime;
	}

	public void setRoomInTime(Date roomInTime) {
		this.roomInTime = roomInTime;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public Date getRoomOutTime() {
		return roomOutTime;
	}

	public void setRoomOutTime(Date roomOutTime) {
		this.roomOutTime = roomOutTime;
	}

	public Integer getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Integer roomPrice) {
		this.roomPrice = roomPrice;
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