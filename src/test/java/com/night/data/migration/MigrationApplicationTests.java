package com.night.data.migration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.night.data.migration.entity.ali.THotelMain;
import com.night.data.migration.entity.ali.THotelMainRespository;
import com.night.data.migration.entity.hotel.THotelRespository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MigrationApplication.class)
public class MigrationApplicationTests {

	@Autowired
	@Qualifier("hotelJdbcTemplate")
	protected JdbcTemplate hotelJDBC;

	@Autowired
	@Qualifier("aliyuanJdbcTemplate")
	protected JdbcTemplate aliyuanJDBC;
	
	@Autowired
	THotelRespository hotelRespository;
	
	@Autowired
	THotelMainRespository hotelMainRespository;
	
//	@Before
//	public void setUp() {
//		jdbcTemplate1.update("DELETE  FROM  test_migration ");
//		jdbcTemplate2.update("DELETE  FROM  test_migration ");
//	}

//	@Test
//	public void contextLoads() throws Exception {
//
////		hotelJDBC.update("insert into test_migration(id,name,age) values(?, ?, ?)", 1, "aaa", 20);
////		hotelJDBC.update("insert into test_migration(id,name,age) values(?, ?, ?)", 2, "bbb", 30);
////		aliyuanJDBC.update("insert into test_migration(id,name,age) values(?, ?, ?)", 1, "aaa", 20);
////		Assert.assertEquals("2", hotelJDBC.queryForObject("select count(1) from test_migration", String.class));
////		Assert.assertEquals("1", aliyuanJDBC.queryForObject("select count(1) from test_migration", String.class));
//
////		List<Map<String, Object>> l = aliyuanJDBC.queryForList("SELECT a.id, a.hotel_bus_id, a.hotel_branch_id, a.hotel_name, a.hotel_introduction, a.hotel_phone, a.hotel_address, b.longitude, b.latitude, "
////			+ "d.hotel_is_reserve_man, d.hotel_is_reserve_phone, d.hotel_is_remarks, c.hotel_pay_type, c.hotel_is_order_phone, c.hotel_order_phone, c.hotel_is_check_out, "
////			+ "c.hotel_is_food, c.hotel_is_announcement, c.hotel_announcement, c.hotel_is_room_amount, a.room_continuedToLive, c.isSendSms4Member, "
////			+ "a.room_groupBuy, a.room_spike, a.room_whenRent, a.room_bargainPrice, c.hotel_food_status, c.hotel_check_out_phone, c.hotel_is_invoice, c.hotel_invoice_prompt,"
////			+ " c.hotel_noinvoice_prompt "
////			+ "FROM t_hotel_main a "
////			+ "JOIN t_wx_shop b ON a.hotel_branch_id=b.id "
////			+ "LEFT JOIN t_hotel_fn_info c ON a.id=c.hotel_id "
////			+ "LEFT JOIN t_hotel_customer_info d ON a.id=d.hotel_id");
////		System.err.println(l);
//		THotel h = new THotel();
//		h.setId(100);
//		h.setCreatedBy(33);
//		h.setCreatedAt(new Date());
//		hotelRespository.save(h);
//	}
	
	@Test
	public void hotel() throws Exception {
		List<THotelMain> hotelMains = hotelMainRespository.findAll();
		List<Map<String, Object>> hotelMains2 = aliyuanJDBC.queryForList("SELECT a.id, a.hotel_bus_id, a.hotel_branch_id, a.hotel_name, a.hotel_introduction, a.hotel_phone, a.hotel_address, b.longitude, b.latitude, "
				+ "d.hotel_is_reserve_man, d.hotel_is_reserve_phone, d.hotel_is_remarks, c.hotel_pay_type, c.hotel_is_order_phone, c.hotel_order_phone, c.hotel_is_check_out, "
				+ "c.hotel_is_food, c.hotel_is_announcement, c.hotel_announcement, c.hotel_is_room_amount, a.room_continuedToLive, c.isSendSms4Member, "
				+ "a.room_groupBuy, a.room_spike, a.room_whenRent, a.room_bargainPrice, c.hotel_food_status, c.hotel_check_out_phone, c.hotel_is_invoice, c.hotel_invoice_prompt,"
				+ " c.hotel_noinvoice_prompt "
				+ "FROM t_hotel_main a "
				+ "JOIN t_wx_shop b ON a.hotel_branch_id=b.id "
				+ "LEFT JOIN t_hotel_fn_info c ON a.id=c.hotel_id "
				+ "LEFT JOIN t_hotel_customer_info d ON a.id=d.hotel_id");
//		List<THotel> hotels = new ArrayList<THotel>();
		List<Object[]> batchArgs = new ArrayList<>();
		for(THotelMain hotelMain : hotelMains) {
			List<Object> l = new ArrayList<>();
			l.add(hotelMain.getId());
			l.add(hotelMain.getHotelBusId());
			l.add(hotelMain.getHotelBranchId());
			l.add(hotelMain.getHotelName());
			l.add(hotelMain.getHotelIntroduction());
			System.err.println(hotelMain.getHotelIntroduction().length());
			l.add(hotelMain.getHotelPhone());
			l.add(hotelMain.getHotelAddress());
			for(Map<String, Object> hotelMain2 : hotelMains2) {
				if(Integer.valueOf(hotelMain2.get("id").toString()).equals(hotelMain.getId())) {
//					hotel.setLongitude(Double.valueOf(hotelMain2.get("longitude").toString()));
//					hotel.setLatitude(Double.valueOf(hotelMain2.get("latitude").toString()));
					l.add(Double.valueOf(hotelMain2.get("longitude").toString()));
					l.add(Double.valueOf(hotelMain2.get("latitude").toString()));
				}
			}
			l.add(hotelMain.getHotelStatus() - 1);
			l.add(hotelMain.getHotelBusId());
			l.add(hotelMain.getHotelCreatetime());
			l.add(hotelMain.getHotelBusId());
			
//			THotel hotel = new THotel();
//			hotel.setId(hotelMain.getId()+1000);
//			hotel.setBusId(hotelMain.getHotelBusId());
//			hotel.setShopId(hotelMain.getHotelBranchId());
//			hotel.setName(hotelMain.getHotelName());
//			hotel.setDesc(hotelMain.getHotelIntroduction());
//			hotel.setPhone(hotelMain.getHotelPhone());
//			hotel.setAddress(hotelMain.getHotelAddress());
//			hotel.setMarkModified(hotelMain.getHotelStatus() - 1);
//			hotel.setCreatedAt(hotelMain.getHotelCreatetime());
//			hotel.setCreatedBy(hotelMain.getHotelBusId());
//			hotel.setUpdatedBy(hotelMain.getHotelBusId());
			//			hotels.add(hotel);
			batchArgs.add(l.toArray());
		}
//		hotelRespository.save(hotels);
		
		hotelJDBC.batchUpdate("INSERT INTO `t_hotel`(id, bus_id, shop_id, name, `desc`, phone, address, longitude, latitude, mark_modified, created_by, created_at, updated_by) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", 
				batchArgs);
	}
	
}
