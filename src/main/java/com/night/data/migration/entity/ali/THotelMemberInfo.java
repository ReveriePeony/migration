package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hotel_member_info database table.
 * 
 */
@Entity
@Table(name="t_hotel_member_info")
@NamedQuery(name="THotelMemberInfo.findAll", query="SELECT t FROM THotelMemberInfo t")
public class THotelMemberInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="member_id")
	private int memberId;

	private String name;

	private String phone;

	public THotelMemberInfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}