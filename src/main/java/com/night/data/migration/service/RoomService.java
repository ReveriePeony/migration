package com.night.data.migration.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.night.data.migration.entity.ali.THotelRoom;
import com.night.data.migration.entity.hotel.TRoomCalendar;
import com.night.data.migration.util.RespositoryFactory;

/**
 * 
 * @author Reverien9@gmail.com
 * 2017年12月6日 下午8:23:15
 */
@Service
public class RoomService {
	
	@Autowired
	@Qualifier("aliyuanJdbcTemplate")
	private JdbcTemplate aliyuanJDBC;
	
	@Autowired
	@Qualifier("hotelJdbcTemplate")
	private JdbcTemplate hotelJDBC;

	
	@Autowired
	private RespositoryFactory factory;
	
	@Transactional
	public void tRoomCalendar() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<TRoomCalendar> tRoomCalendars = new ArrayList<>();
		List<Map<String, Object>> aliRoomCals = aliyuanJDBC.queryForList(
				"SELECT a.id, a.room_id, a.price, a.time, b.hotel_id FROM t_hotel_room_calendar a JOIN t_hotel_room b ON a.room_id = b.id ");
		for(Map<String, Object> m : aliRoomCals) {
			Date beginTime = sdf2.parse(m.get("time").toString());
			TRoomCalendar rc = new TRoomCalendar();
			rc.setCategoryId(Integer.valueOf(m.get("room_id").toString()));
			rc.setHotelId(Integer.valueOf(m.get("hotel_id").toString()));
			rc.setPrice( Double.valueOf((Double.valueOf(m.get("price").toString()) * 100)).intValue() );
			rc.setBeginTime(beginTime);
			rc.setEndTime(sdf2.parse(sdf.format(beginTime) + " 23:59:59"));
			rc.setCreatedAt(new Date());
			rc.setCreatedBy(0);
			rc.setUpdatedBy(0);
			tRoomCalendars.add(rc);
		}
		factory.gettRoomCalendar().save(tRoomCalendars);
	}
	
	@Transactional
	public void tRoomCategory() throws Exception {
		List<THotelRoom> hotelRooms = factory.gettHotelRoom().findAll();
		List<THotelRoom> hotelRoomsTemp = new ArrayList<>();
		List<Object[]> categories = new ArrayList<>();
		int i = 1;
		for(THotelRoom r : hotelRooms) {
			List<Object> l = new ArrayList<>();
			l.add(r.getId());
			if(hotelRoomsTemp.contains(r)) {
				l.add(r.getRoomName() + i);
				i++;
			}else {
				l.add(r.getRoomName());
			}
//			l.add(r.getRoomTotalCount());
			l.add(0);
			l.add(r.getHotelId());
			l.add(r.getRoomInstruction());
			l.add(Double.valueOf(r.getRoomPrice() == null ? 0 : r.getRoomPrice() * 100).intValue());
			l.add(Double.valueOf(r.getRoom_cashPledge() == null ? 0 : r.getRoom_cashPledge() * 100).intValue());
			l.add(r.getRoomIsWeekendPrice());
			l.add(Double.valueOf(r.getRoomWeekendPrice() == null ? 0 : r.getRoomWeekendPrice() * 100).intValue());
			l.add(0);
			l.add(new Date());
			l.add(0);
			categories.add(l.toArray());
			hotelRoomsTemp.add(r);
		}
		hotelJDBC.batchUpdate("INSERT INTO `t_room_category`(id, name, room_count, hotel_id, `desc`, rack_rate, deposit, "
				+ "weekend_fare_enable, weekend_fare, created_by, created_at, updated_by) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", 
				categories);	
	}
}
