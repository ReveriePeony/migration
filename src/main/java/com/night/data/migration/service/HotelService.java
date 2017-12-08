package com.night.data.migration.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.night.data.migration.entity.ali.THotelFnInfo;
import com.night.data.migration.entity.ali.THotelInvoiceCategory;
import com.night.data.migration.entity.ali.THotelMain;
import com.night.data.migration.entity.hotel.THotelSetting;
import com.night.data.migration.util.RespositoryFactory;

/**
 * 
 * @author Reverien9@gmail.com
 * 2017年12月6日 下午4:42:38
 */
@Service
public class HotelService {
	
	@Autowired
	@Qualifier("hotelJdbcTemplate")
	private JdbcTemplate hotelJDBC;

	@Autowired
	@Qualifier("aliyuanJdbcTemplate")
	private JdbcTemplate aliyuanJDBC;
	
	@Autowired
	private RespositoryFactory factory;
	
	@Transactional
	public void tHotel() throws Exception {
		List<THotelMain> hotelMains = factory.getHotelMain().findAll();
		List<Map<String, Object>> hotelMains2 = aliyuanJDBC.queryForList("SELECT a.id, a.hotel_bus_id, a.hotel_branch_id, a.hotel_name, a.hotel_introduction, a.hotel_phone, a.hotel_address, b.longitude, b.latitude, "
				+ "d.hotel_is_reserve_man, d.hotel_is_reserve_phone, d.hotel_is_remarks, c.hotel_pay_type, c.hotel_is_order_phone, c.hotel_order_phone, c.hotel_is_check_out, "
				+ "c.hotel_is_food, c.hotel_is_announcement, c.hotel_announcement, c.hotel_is_room_amount, a.room_continuedToLive, c.isSendSms4Member, "
				+ "a.room_groupBuy, a.room_spike, a.room_whenRent, a.room_bargainPrice, c.hotel_food_status, c.hotel_check_out_phone, c.hotel_is_invoice, c.hotel_invoice_prompt,"
				+ " c.hotel_noinvoice_prompt, e.resource_url "
				+ "FROM t_hotel_main a "
				+ "JOIN t_wx_shop b ON a.hotel_branch_id=b.id "
				+ "LEFT JOIN t_hotel_fn_info c ON a.id=c.hotel_id "
				+ "LEFT JOIN t_hotel_customer_info d ON a.id=d.hotel_id "
				+ "LEFT JOIN t_hotel_image e ON a.id = e.hotel_id GROUP BY a.id ");
		List<Object[]> batchArgs = new ArrayList<>();
		for(THotelMain hotelMain : hotelMains) {
			List<Object> l = new ArrayList<>();
			l.add(hotelMain.getId());
			l.add(hotelMain.getHotelBusId());
			l.add(hotelMain.getHotelBranchId());
			l.add(hotelMain.getHotelName());
			l.add(hotelMain.getHotelIntroduction());
			l.add(hotelMain.getHotelPhone());
			l.add(hotelMain.getHotelAddress());
			for(Map<String, Object> hotelMain2 : hotelMains2) {
				if(Integer.valueOf(hotelMain2.get("id").toString()).equals(hotelMain.getId())) {
					l.add(Double.valueOf(hotelMain2.get("longitude").toString()));
					l.add(Double.valueOf(hotelMain2.get("latitude").toString()));
					l.add(hotelMain2.get("resource_url"));
					l.add(hotelMain2.get("resource_url"));
				}
			}
			l.add(hotelMain.getHotelStatus() - 1);
			l.add(hotelMain.getHotelBusId());
			l.add(hotelMain.getHotelCreatetime());
			l.add(hotelMain.getHotelBusId());
			batchArgs.add(l.toArray());
		}
		hotelJDBC.batchUpdate("INSERT INTO `t_hotel`(id, bus_id, shop_id, name, `desc`, phone, address, longitude, latitude, thumbnail, logo, mark_modified, created_by, created_at, updated_by) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", 
				batchArgs);	
	}
	
	@Transactional
	public void tHotelSetting() throws Exception {
		List<THotelSetting> hotelSettings = new ArrayList<>();
		List<THotelFnInfo> tHotelFnInfos = factory.gettHotelFnInfo().findAll();
		List<THotelInvoiceCategory> categories = factory.gettHotelInvoiceCategory().findAll();
		for(THotelFnInfo info : tHotelFnInfos) {
			THotelSetting setting = new THotelSetting();
			setting.setCreatedBy(0);
			setting.setUpdatedBy(0);
			setting.setCreatedAt(new Date());
			setting.setHotelId(info.getHotelId());
			setting.setPayMode(info.getHotelPayType());
			setting.setSmsEnable(info.getHotelIsOrderPhone());
			setting.setSmsPhone(info.getHotelOrderPhone());
			setting.setNoticeEnable(info.getHotelIsAnnouncement());
			setting.setBulletin(info.getHotelAnnouncement());
			setting.setRoomReservationEnable(info.getHotelIsFood());
			setting.setRemnantRoomEnable(info.getHotelIsRoomAmount());
			setting.setFoodPayMode(info.getHotelFoodStatus());
			setting.setReservationCheckOutEnable(info.getHotelIsCheckOut());
			setting.setReservationCheckOutPhone(info.getHotelCheckOutPhone());
			StringBuffer sb = new StringBuffer();
			for(THotelInvoiceCategory category : categories) {
				if(category.getHotelId().equals(info.getHotelId())) {
					sb.append(category.getHotelInvoiceType()+",");
				}
			}
			if(sb.toString().trim().length() > 0) {
				setting.setInvoiceCategorys(sb.toString().substring(0, sb.toString().length()-1));
			}else {
				setting.setInvoiceCategorys("");
			}
			hotelSettings.add(setting);
		}
		factory.gettHotelSetting().save(hotelSettings);
	}
	
}
