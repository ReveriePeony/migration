package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hotel_facility_relation database table.
 * 
 */
@Entity
@Table(name="t_hotel_facility_relation")
@NamedQuery(name="THotelFacilityRelation.findAll", query="SELECT t FROM THotelFacilityRelation t")
public class THotelFacilityRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="hotel_id")
	private int hotelId;

	@Column(name="hotel_items_type")
	private int hotelItemsType;

	public THotelFacilityRelation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public int getHotelItemsType() {
		return this.hotelItemsType;
	}

	public void setHotelItemsType(int hotelItemsType) {
		this.hotelItemsType = hotelItemsType;
	}

}