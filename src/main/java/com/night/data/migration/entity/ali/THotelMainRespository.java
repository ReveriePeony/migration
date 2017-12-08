package com.night.data.migration.entity.ali;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * 
 * @author Reverien9@gmail.com
 * 2017年12月5日 上午11:35:29
 */
public interface THotelMainRespository extends JpaRepository<THotelMain, Integer>{

//	@Query("SELECT * FROM t_hotel_main")
//	public List<Map<String, Object>> findAllII();
	
	@Query(value = "SELECT a.id, a.hotel_bus_id, a.hotel_branch_id, a.hotel_name, a.hotel_introduction, a.hotel_phone, a.hotel_address, b.longitude, b.latitude, "
			+ "d.hotel_is_reserve_man, d.hotel_is_reserve_phone, d.hotel_is_remarks, c.hotel_pay_type, c.hotel_is_order_phone, c.hotel_order_phone, c.hotel_is_check_out, "
			+ "c.hotel_is_food, c.hotel_is_announcement, c.hotel_announcement, c.hotel_is_room_amount, a.room_continuedToLive, c.isSendSms4Member, "
			+ "a.room_groupBuy, a.room_spike, a.room_whenRent, a.room_bargainPrice, c.hotel_food_status, c.hotel_check_out_phone, c.hotel_is_invoice, c.hotel_invoice_prompt,"
			+ " c.hotel_noinvoice_prompt "
			+ "FROM t_hotel_main a "
			+ "JOIN t_wx_shop b ON a.hotel_branch_id=b.id "
			+ "LEFT JOIN t_hotel_fn_info c ON a.id=c.hotel_id "
			+ "LEFT JOIN t_hotel_customer_info d ON a.id=d.hotel_id", nativeQuery = true)
	List<Object> findAllComplex();
}
