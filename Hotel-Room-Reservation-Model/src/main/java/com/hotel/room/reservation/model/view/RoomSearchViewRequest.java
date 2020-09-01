package com.hotel.room.reservation.model.view;

import org.hibernate.validator.constraints.NotBlank;

public class RoomSearchViewRequest {
	
	@NotBlank(message="From date is mandatory")
	private String fromDt;
	
	@NotBlank(message="To date is mandatory")
	private String toDt;
	private String roomType;
	
	public String getFromDt() {
		return fromDt;
	}
	public void setFromDt(String fromDt) {
		this.fromDt = fromDt;
	}
	public String getToDt() {
		return toDt;
	}
	public void setToDt(String toDt) {
		this.toDt = toDt;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	

}
