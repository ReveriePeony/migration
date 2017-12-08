package com.night.data.migration.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.night.data.migration.entity.ali.THotelCashPledge;
import com.night.data.migration.entity.ali.THotelFoodMeal;
import com.night.data.migration.entity.ali.THotelFoodOrder;
import com.night.data.migration.entity.ali.THotelFoodOrderDetial;
import com.night.data.migration.entity.ali.THotelMain;
import com.night.data.migration.entity.ali.THotelRoom;
import com.night.data.migration.entity.ali.THotelRoomOrder;
import com.night.data.migration.entity.hotel.TOrder;
import com.night.data.migration.entity.hotel.TOrderCoupon;
import com.night.data.migration.entity.hotel.TOrderFood;
import com.night.data.migration.entity.hotel.TOrderFoodDetail;
import com.night.data.migration.entity.hotel.TOrderRoom;
import com.night.data.migration.entity.hotel.TOrderRoomCustomer;
import com.night.data.migration.util.RespositoryFactory;

/**
 * 
 * @author Reverien9@gmail.com
 * 2017年12月7日 上午10:52:53
 */
@Service
public class OrderService {
	
	@Autowired
	private RespositoryFactory factory;
	
	@Transactional
	public void tRoomOrder() throws Exception {
		List<THotelMain> hotelMains = factory.getHotelMain().findAll();
		List<THotelRoom> hotelRooms = factory.gettHotelRoom().findAll();
		List<THotelRoomOrder> hotelRoomOrders = factory.gettHotelRoomOrder().findAll();
		List<THotelCashPledge> hotelCashPledges = factory.gettHotelCashPledge().findAll();
		
		List<TOrder> orders = new ArrayList<>();
		List<TOrderRoom> orderRooms = new ArrayList<>();
		List<TOrderRoomCustomer> orderRoomCustomers = new ArrayList<>();
		
		for(THotelRoomOrder ro : hotelRoomOrders) {
			TOrder order = new TOrder();
			TOrderRoom orderRoom = new TOrderRoom();
			TOrderRoomCustomer orderRoomCustomer = new TOrderRoomCustomer();
			Integer orderPrice = Double.valueOf(ro.getOrderPrice() * 100).intValue();
			if(orderPrice < 0) {
				orderPrice = 0;
			}
			
			order.setId(ro.getId());
			order.setOrderNum(ro.getOrderNum());
			order.setHotelId(ro.getHotelId());
			for(THotelMain h : hotelMains) {
				if(ro.getHotelId().equals(h.getId())) {
					order.setBusId(h.getHotelBusId());
					orderRoom.setHotelName(h.getHotelName());
					break;
				}else {
					order.setBusId(0);
					orderRoom.setHotelName("");
				}
			}
			order.setMemberId(ro.getMemberId());
			order.setPayType(ro.getOrderPayType());
			if(ro.getOrderPayStatus() == 0) {
				order.setPayStatus(0);
				orderRoom.setPayStatus(1);
			}else if(ro.getOrderPayStatus() == 3){
				order.setPayStatus(3);
				orderRoom.setPayStatus(3);
			}else {
				order.setPayStatus(1);
				orderRoom.setPayStatus(0);
			}
			order.setPayTime(ro.getOrder_createTime());
			switch (ro.getOrderStatus()) {
			case 1:
				order.setOrderStatus(2);
				break;
			case 2:
				order.setOrderStatus(1);
				break;
			case 3:
				order.setOrderStatus(3);
				break;
			case 4:
			case 5:
				order.setOrderStatus(0);
				break;
			case 6:
				order.setOrderStatus(4);
				break;
			}
			order.setCreateTime(ro.getOrder_createTime() == null ? new Date() : ro.getOrder_createTime());
			order.setRealPrice(orderPrice);
			order.setBillPrice(orderPrice);
			order.setFb(Double.valueOf(ro.getFenbi()).intValue());
			order.setIntegral(0);
			if(ro.getCardVolumeCode() != null) {
				TOrderCoupon coupon = new TOrderCoupon();
				coupon.setCouponsId(0);
				coupon.setCouponsDiscount(0);
				coupon.setOrderId(ro.getId());
				coupon.setOrderNum(ro.getOrderNum());
				coupon.setCouponsCode(ro.getCardVolumeCode());
				coupon.setCouponsNum(1);
				coupon = factory.gettOrderCoupon().save(coupon);
				order.setOrderCouponsId(coupon.getId());
			}else {
				order.setOrderCouponsId(0);
			}
			order.setReceivablePrice(orderPrice);
			order.setRemark(ro.getOrderRemarks());
			order.setCompletionTime(ro.getOrder_createTime());
			order.setMarkModified(0);
			order.setCreatedAt(ro.getOrder_createTime() == null ? new Date() : ro.getOrder_createTime());
			order.setCreatedBy(0);
			order.setUpdatedBy(0);
			if(ro.getOrderPayType().equals(3)) {
				order.setRefundAmount(orderPrice);
			}else if(ro.getOrderPayType().equals(6)){
				for(THotelCashPledge cash : hotelCashPledges) {
					if(cash.getOrderId().equals(ro.getId().toString()) && cash.getStatus().equals(1)) {
						order.setRefundAmount(Double.valueOf(cash.getCashPledge() * 100).intValue());
						order.setRefundReason(cash.getRefundsExplain());
						break;
					}else {
						order.setRefundAmount(0);
						order.setRefundReason("");
					}
				}
			}
			orderRoom.setOrderId(ro.getId());
			orderRoom.setOrderNum(ro.getOrderNum());
			orderRoom.setHotelId(ro.getHotelId());
			orderRoom.setCategoryId(ro.getRoomId() == null ? 0 : ro.getRoomId());
			for(THotelRoom r : hotelRooms) {
				if(r.getId().equals(ro.getRoomId())) {
					orderRoom.setCategoryName(r.getRoomName());
					orderRoom.setRackRate(Double.valueOf(r.getRoomPrice() * 100).intValue());
					orderRoom.setRoomPrice(Double.valueOf(r.getRoomPrice() * 100).intValue());
					orderRoom.setDeposit(Double.valueOf(r.getRoom_cashPledge() * 100).intValue());
					break;
				}else {
					orderRoom.setCategoryName("");
					orderRoom.setRackRate(0);
					orderRoom.setRoomPrice(0);
					orderRoom.setDeposit(0);
				}
			}
			orderRoom.setCheckInWay(ro.getOrderPayType() == 2 ? 1 : 2);
			orderRoom.setCustomerName(ro.getReserveName() == null ? "" : ro.getReserveName());
			orderRoom.setCustomerPhone(ro.getReservePhone() == null ? "" : ro.getReservePhone());
			orderRoom.setNumber(ro.getReserveNumber() == null ? 0 : ro.getReserveNumber());
			orderRoom.setRoomInTime(ro.getRoomInTime() == null ? new Date() : ro.getRoomInTime());
			orderRoom.setRoomOutTime(ro.getRoomOutTime() == null ? new Date() : ro.getRoomOutTime());
			orderRoom.setReceivablePrice(orderPrice);
			orderRoom.setOrderFrom(0);
			orderRoom.setCreateTime(ro.getOrder_createTime() == null ? new Date() : ro.getOrder_createTime());
			orderRoom.setCreatedAt(ro.getOrder_createTime() == null ? new Date() : ro.getOrder_createTime());
			orderRoom.setCreatedBy(0);
			orderRoom.setUpdatedBy(0);
			orderRoom.setMarkModified(0);
			orderRoom.setGuestType(0);
			orderRoom.setCheckStandard(0);
			orderRoom.setDepositVisible(1);
			orderRoomCustomer.setName(ro.getReserveName() == null ? "" : ro.getReserveName());
			orderRoomCustomer.setIdType(0);
			orderRoomCustomer.setPhone(ro.getReservePhone() == null ? "" : ro.getReservePhone());
			orderRoomCustomer.setIdCard("");
			orderRoomCustomer.setOrderId(ro.getId());
			orderRoomCustomer.setRoomNum("");
			orderRoomCustomer.setMarkModified(0);
			orderRoomCustomer.setCreatedAt(ro.getOrder_createTime() == null ? new Date() : ro.getOrder_createTime());
			orderRoomCustomer.setCreatedBy(0);
			orderRoomCustomer.setUpdatedBy(0);
			
			orders.add(order);
			orderRooms.add(orderRoom);
			orderRoomCustomers.add(orderRoomCustomer);
		}
		factory.gettOrder().save(orders);
		factory.gettOrderRoom().save(orderRooms);
		factory.gettOrderRoomCustomer().save(orderRoomCustomers);
	}
	
	@Transactional
	public void tFoodOrder() throws Exception {
		List<THotelMain> hotelMains = factory.getHotelMain().findAll();
		List<THotelFoodOrder> hotelFoodOrders = factory.gettHotelFoodOrder().findAll();
		List<THotelFoodOrderDetial> hotelFoodOrderDetials = factory.gettHotelFoodOrderDetial().findAll();
		List<THotelFoodMeal> hotelFoodMeals = factory.gettHotelFoodMeal().findAll();
		
		List<TOrder> orders = new ArrayList<>();
		List<TOrderFood> orderFoods = new ArrayList<>();
		Set<TOrderFoodDetail> foodOrderDetials = new HashSet<>();
		
		for(THotelFoodOrder fo : hotelFoodOrders) {
			TOrder order = new TOrder();
			TOrderFood orderFood = new TOrderFood();
			TOrderFoodDetail orderFoodDetail = new TOrderFoodDetail();
			Integer orderPrice = Double.valueOf(fo.getOrderPay() * 100).intValue();
			if(orderPrice < 0) {
				orderPrice = 0;
			}
			
			Integer orderId = fo.getId() + 9000;
			order.setId(orderId);
			order.setOrderNum(fo.getOrderCode());
			order.setHotelId(fo.getHotelId());
			for(THotelMain h : hotelMains) {
				if(fo.getHotelId().equals(h.getId())) {
					order.setBusId(h.getHotelBusId());
					orderFood.setHotelName(h.getHotelName());
					break;
				}else {
					order.setBusId(0);
					orderFood.setHotelName("");
				}
			}
			order.setMemberId(fo.getOrderMemberid());
			order.setPayType(fo.getOrderPayType());
			order.setPayStatus(fo.getOrderPayStatus());
			if(fo.getOrderPayStatus() == 0) {
				order.setPayStatus(0);
			}else {
				order.setPayStatus(1);
			}
			order.setPayTime(fo.getCreatetime());
			switch (fo.getOrderStatus()) {
			case 1:
				order.setOrderStatus(2);
				orderFood.setOrderStatus(2);
				break;
			case 2:
				order.setOrderStatus(1);
				orderFood.setOrderStatus(1);
				break;
			case 3:
				order.setOrderStatus(3);
				orderFood.setOrderStatus(3);
				break;
			case 4:
			case 5:
				order.setOrderStatus(0);
				orderFood.setOrderStatus(0);
				break;
			case 6:
				order.setPayType(3);
				break;
			}
			order.setCreateTime(fo.getCreatetime() == null ? new Date() : fo.getCreatetime());
			order.setRealPrice(orderPrice);
			order.setBillPrice(orderPrice);
			order.setFb(0);
			order.setIntegral(0);
			order.setOrderCouponsId(0);
			order.setReceivablePrice(orderPrice);
			order.setRemark("");
			order.setCompletionTime(fo.getCreatetime());
			order.setMarkModified(0);
			order.setCreatedAt(fo.getCreatetime() == null ? new Date() : fo.getCreatetime());
			order.setCreatedBy(0);
			order.setUpdatedBy(0);
			if(fo.getOrderStatus().equals(6)) {
				order.setRefundAmount(orderPrice);
			}else {
				order.setRefundAmount(0);
			}
			orderFood.setId(fo.getId());
			orderFood.setOrderId(orderId);
			orderFood.setOrderNum(fo.getOrderCode());
			orderFood.setHotelId(fo.getHotelId());
			orderFood.setRoomNum(fo.getRoomNum());
			orderFood.setCategoryId(0);
			orderFood.setCustomerName(fo.getBookName() == null ? "" : fo.getBookName());
			orderFood.setCustomerPhone(fo.getPhone() == null ? "" : fo.getPhone());
			orderFood.setPayStatus(fo.getOrderPayStatus());
			orderFood.setPayTime(fo.getCreatetime());
			orderFood.setFoodTotalPrice(orderPrice);
			orderFood.setInvoiceHead(fo.getInvoiceTitle());
			orderFood.setCompletionTime(fo.getCreatetime());
			orderFood.setMarkModified(0);
			orderFood.setCreateTime(fo.getCreatetime() == null ? new Date() : fo.getCreatetime());
			orderFood.setCreatedAt(fo.getCreatetime() == null ? new Date() : fo.getCreatetime());
			orderFood.setCreatedBy(0);
			orderFood.setUpdatedBy(0);
			for(THotelFoodOrderDetial detial : hotelFoodOrderDetials) {
				if(detial.getFoodOrderId().equals(fo.getId())) {
					orderFoodDetail.setOrderFoodId(orderId);
					orderFoodDetail.setFoodId(detial.getFoodMealId());
					for(THotelFoodMeal meal : hotelFoodMeals) {
						if(meal.getId().equals(detial.getFoodMealId())) {
							orderFoodDetail.setFoodName(meal.getFoodName());
							orderFoodDetail.setFoodPrice(Double.valueOf(meal.getFoodPrice() * 100).intValue());
							orderFoodDetail.setFoodProvidesName(meal.getFoodCompanyName());
							orderFoodDetail.setFoodProvidesPhone(meal.getFoodOrderPhone());
						}
					}
					orderFoodDetail.setFoodNumber(detial.getNum() == null ? 1 : detial.getNum());
				}
				foodOrderDetials.add(orderFoodDetail);
			}
			orders.add(order);
			orderFoods.add(orderFood);
		}
		factory.gettOrder().save(orders);
		factory.gettOrderFood().save(orderFoods);
		factory.gettOrderFoodDetail().save(foodOrderDetials);
	}
	
}
