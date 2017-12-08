package com.night.data.migration.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.night.data.migration.entity.ali.THotelImage;
import com.night.data.migration.entity.ali.THotelRoomImage;
import com.night.data.migration.entity.hotel.TFileRecord;
import com.night.data.migration.util.RespositoryFactory;

/**
 * 
 * @author Reverien9@gmail.com
 * 2017年12月6日 上午9:18:29
 */
@Service
public class FileService {
	
	@Autowired
	private RespositoryFactory factory;
	
	@Transactional
	public void tFileRecord() throws Exception {
		List<TFileRecord> fileRecords = new ArrayList<>();
		List<THotelImage> hotelImages = factory.getHotelImage().findAll();
		List<THotelRoomImage> hotelRoomImages = factory.getHotelRoomImage().findAll();
		for(THotelImage hi : hotelImages) {
			TFileRecord a = new TFileRecord();
			String picUrl = hi.getResourceUrl();
			picUrl = picUrl.substring((picUrl.lastIndexOf("/")+1), picUrl.length());
			a.setName(picUrl);
			a.setOriginalName(picUrl);
			a.setPath(hi.getResourceUrl());
			a.setModule("HOTEL");
			a.setReferenceId(hi.getHotelId());
			a.setCreatedAt(hi.getCreateTime());
			a.setCreatedBy(0);
			a.setUpdatedBy(0);
			fileRecords.add(a);
		}
		for(THotelRoomImage hri : hotelRoomImages) {
			TFileRecord a = new TFileRecord();
			String picUrl = hri.getResourceUrl();
			picUrl = picUrl.substring((picUrl.lastIndexOf("/")+1), picUrl.length());
			a.setName(picUrl);
			a.setOriginalName(picUrl);
			a.setPath(hri.getResourceUrl());
			a.setModule("ROOM_CATEGORY");
			a.setReferenceId(hri.getRoomId());
			a.setCreatedAt(hri.getCreateTime());
			a.setCreatedBy(0);
			a.setUpdatedBy(0);
			fileRecords.add(a);
		}
		factory.getFileRecord().save(fileRecords);
	}
	
}
