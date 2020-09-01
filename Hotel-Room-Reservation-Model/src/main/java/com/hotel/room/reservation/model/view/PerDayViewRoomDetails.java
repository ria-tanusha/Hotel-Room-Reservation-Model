package com.hotel.room.reservation.model.view;

import java.util.List;

public class PerDayViewRoomDetails {
	
	private String date;
	private List<RoomView> rooms;
	private String msg;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<RoomView> getRooms() {
		return rooms;
	}
	public void setRooms(List<RoomView> rooms) {
		this.rooms = rooms;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
	