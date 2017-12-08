package com.night.data.migration.entity.ali;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hotel_activity database table.
 * 
 */
@Entity
@Table(name="t_hotel_activity")
@NamedQuery(name="THotelActivity.findAll", query="SELECT t FROM THotelActivity t")
public class THotelActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="activity_etime")
	private String activityEtime;

	@Column(name="activity_name")
	private String activityName;

	@Column(name="activity_status")
	private int activityStatus;

	@Column(name="activity_stime")
	private String activityStime;

	@Column(name="bus_id")
	private int busId;

	private String createtime;

	private int groupLowest;

	private String groupLowestTip;

	@Column(name="hotel_id")
	private int hotelId;

	@Column(name="is_cardvolume")
	private int isCardvolume;

	@Column(name="is_room_count")
	private int isRoomCount;

	@Column(name="is_room_limit")
	private int isRoomLimit;

	@Column(name="is_vipcard")
	private int isVipcard;

	@Column(name="limit_hour")
	private int limitHour;

	@Column(name="live_etime")
	private String liveEtime;

	@Column(name="live_stime")
	private String liveStime;

	@Column(name="room_count")
	private int roomCount;

	@Column(name="room_limit")
	private int roomLimit;

	private String rule;

	private int type;

	private String whenRentETime;

	private String whenRentSTime;

	public THotelActivity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivityEtime() {
		return this.activityEtime;
	}

	public void setActivityEtime(String activityEtime) {
		this.activityEtime = activityEtime;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public int getActivityStatus() {
		return this.activityStatus;
	}

	public void setActivityStatus(int activityStatus) {
		this.activityStatus = activityStatus;
	}

	public String getActivityStime() {
		return this.activityStime;
	}

	public void setActivityStime(String activityStime) {
		this.activityStime = activityStime;
	}

	public int getBusId() {
		return this.busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public int getGroupLowest() {
		return this.groupLowest;
	}

	public void setGroupLowest(int groupLowest) {
		this.groupLowest = groupLowest;
	}

	public String getGroupLowestTip() {
		return this.groupLowestTip;
	}

	public void setGroupLowestTip(String groupLowestTip) {
		this.groupLowestTip = groupLowestTip;
	}

	public int getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public int getIsCardvolume() {
		return this.isCardvolume;
	}

	public void setIsCardvolume(int isCardvolume) {
		this.isCardvolume = isCardvolume;
	}

	public int getIsRoomCount() {
		return this.isRoomCount;
	}

	public void setIsRoomCount(int isRoomCount) {
		this.isRoomCount = isRoomCount;
	}

	public int getIsRoomLimit() {
		return this.isRoomLimit;
	}

	public void setIsRoomLimit(int isRoomLimit) {
		this.isRoomLimit = isRoomLimit;
	}

	public int getIsVipcard() {
		return this.isVipcard;
	}

	public void setIsVipcard(int isVipcard) {
		this.isVipcard = isVipcard;
	}

	public int getLimitHour() {
		return this.limitHour;
	}

	public void setLimitHour(int limitHour) {
		this.limitHour = limitHour;
	}

	public String getLiveEtime() {
		return this.liveEtime;
	}

	public void setLiveEtime(String liveEtime) {
		this.liveEtime = liveEtime;
	}

	public String getLiveStime() {
		return this.liveStime;
	}

	public void setLiveStime(String liveStime) {
		this.liveStime = liveStime;
	}

	public int getRoomCount() {
		return this.roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public int getRoomLimit() {
		return this.roomLimit;
	}

	public void setRoomLimit(int roomLimit) {
		this.roomLimit = roomLimit;
	}

	public String getRule() {
		return this.rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getWhenRentETime() {
		return this.whenRentETime;
	}

	public void setWhenRentETime(String whenRentETime) {
		this.whenRentETime = whenRentETime;
	}

	public String getWhenRentSTime() {
		return this.whenRentSTime;
	}

	public void setWhenRentSTime(String whenRentSTime) {
		this.whenRentSTime = whenRentSTime;
	}

}