package com.night.data.migration.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.night.data.migration.entity.ali.THotelCashPledgeRespository;
import com.night.data.migration.entity.ali.THotelCustomerInfoRespository;
import com.night.data.migration.entity.ali.THotelFnInfoRespository;
import com.night.data.migration.entity.ali.THotelFoodMealRespository;
import com.night.data.migration.entity.ali.THotelFoodOrderDetialRespository;
import com.night.data.migration.entity.ali.THotelFoodOrderRespository;
import com.night.data.migration.entity.ali.THotelImageRespository;
import com.night.data.migration.entity.ali.THotelInvoiceCategoryRespository;
import com.night.data.migration.entity.ali.THotelMainRespository;
import com.night.data.migration.entity.ali.THotelRoomImageRespository;
import com.night.data.migration.entity.ali.THotelRoomOrderRespository;
import com.night.data.migration.entity.ali.THotelRoomRespository;
import com.night.data.migration.entity.hotel.TFileRecordRespository;
import com.night.data.migration.entity.hotel.TFoodRespository;
import com.night.data.migration.entity.hotel.THotelRespository;
import com.night.data.migration.entity.hotel.THotelSettingRespository;
import com.night.data.migration.entity.hotel.TOrderCouponRespository;
import com.night.data.migration.entity.hotel.TOrderFoodDetailRespository;
import com.night.data.migration.entity.hotel.TOrderFoodRespository;
import com.night.data.migration.entity.hotel.TOrderRespository;
import com.night.data.migration.entity.hotel.TOrderRoomCustomerRespository;
import com.night.data.migration.entity.hotel.TOrderRoomRespository;
import com.night.data.migration.entity.hotel.TRoomCalendarRespository;
import com.night.data.migration.entity.hotel.TRoomCategoryRespository;

/**
 * 
 * @author Reverien9@gmail.com
 * 2017年12月6日 下午2:19:38
 */
@Component
public class RespositoryFactory {

	@Autowired
	THotelRespository hotel;
	
	@Autowired
	THotelMainRespository hotelMain;
	
	@Autowired
	TFileRecordRespository fileRecord;
	
	@Autowired
	THotelImageRespository hotelImage;
	
	@Autowired
	THotelFoodMealRespository hotelFoodMeal;
	
	@Autowired
	THotelRoomImageRespository hotelRoomImage;
	
	@Autowired
	TFoodRespository tFood;
	
	@Autowired
	THotelSettingRespository tHotelSetting;
	
	@Autowired
	THotelCustomerInfoRespository tHotelCustomerInfo;
	
	@Autowired
	THotelFnInfoRespository tHotelFnInfo;
	
	@Autowired
	TRoomCalendarRespository tRoomCalendar;
	
	@Autowired
	THotelInvoiceCategoryRespository tHotelInvoiceCategory;
	
	@Autowired
	TRoomCategoryRespository tRoomCategory;

	@Autowired
	THotelRoomRespository tHotelRoom;
	
	@Autowired
	TOrderRespository tOrder;
	
	@Autowired
	THotelRoomOrderRespository tHotelRoomOrder;
	
	@Autowired
	THotelFoodOrderRespository tHotelFoodOrder;
	
	@Autowired
	THotelFoodOrderDetialRespository tHotelFoodOrderDetial;
	
	@Autowired
	TOrderCouponRespository tOrderCoupon;
	
	@Autowired
	THotelCashPledgeRespository tHotelCashPledge;
	
	@Autowired
	TOrderRoomRespository tOrderRoom;
	
	@Autowired
	TOrderRoomCustomerRespository tOrderRoomCustomer;
	
	@Autowired
	TOrderFoodRespository tOrderFood;
	
	@Autowired
	TOrderFoodDetailRespository tOrderFoodDetail;
	
	@Autowired
	THotelFoodMealRespository tHotelFoodMeal;
	
	public THotelFoodMealRespository gettHotelFoodMeal() {
		return tHotelFoodMeal;
	}

	public TOrderFoodRespository gettOrderFood() {
		return tOrderFood;
	}

	public TOrderFoodDetailRespository gettOrderFoodDetail() {
		return tOrderFoodDetail;
	}

	public TOrderRoomRespository gettOrderRoom() {
		return tOrderRoom;
	}

	public TOrderRoomCustomerRespository gettOrderRoomCustomer() {
		return tOrderRoomCustomer;
	}

	public TOrderCouponRespository gettOrderCoupon() {
		return tOrderCoupon;
	}

	public THotelCashPledgeRespository gettHotelCashPledge() {
		return tHotelCashPledge;
	}

	public TOrderRespository gettOrder() {
		return tOrder;
	}

	public THotelRoomOrderRespository gettHotelRoomOrder() {
		return tHotelRoomOrder;
	}

	public THotelFoodOrderRespository gettHotelFoodOrder() {
		return tHotelFoodOrder;
	}

	public THotelFoodOrderDetialRespository gettHotelFoodOrderDetial() {
		return tHotelFoodOrderDetial;
	}

	public THotelRoomRespository gettHotelRoom() {
		return tHotelRoom;
	}

	public TRoomCategoryRespository gettRoomCategory() {
		return tRoomCategory;
	}

	public THotelRespository getHotel() {
		return hotel;
	}

	public THotelMainRespository getHotelMain() {
		return hotelMain;
	}

	public TFileRecordRespository getFileRecord() {
		return fileRecord;
	}

	public THotelImageRespository getHotelImage() {
		return hotelImage;
	}

	public THotelFoodMealRespository getHotelFoodMeal() {
		return hotelFoodMeal;
	}

	public THotelRoomImageRespository getHotelRoomImage() {
		return hotelRoomImage;
	}

	public TFoodRespository gettFood() {
		return tFood;
	}

	public THotelSettingRespository gettHotelSetting() {
		return tHotelSetting;
	}

	public THotelCustomerInfoRespository gettHotelCustomerInfo() {
		return tHotelCustomerInfo;
	}

	public THotelFnInfoRespository gettHotelFnInfo() {
		return tHotelFnInfo;
	}

	public THotelInvoiceCategoryRespository gettHotelInvoiceCategory() {
		return tHotelInvoiceCategory;
	}

	public TRoomCalendarRespository gettRoomCalendar() {
		return tRoomCalendar;
	}

}
