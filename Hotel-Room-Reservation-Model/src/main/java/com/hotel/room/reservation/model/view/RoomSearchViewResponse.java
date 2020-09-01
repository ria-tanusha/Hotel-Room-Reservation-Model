package com.hotel.room.reservation.model.view;

import java.util.List;

public class RoomSearchViewResponse {

	private List<PerDayViewRoomDetails> perDayViewRooms;
	private StatusView status;

	public List<PerDayViewRoomDetails> getPerDayViewRooms() {
		return perDayViewRooms;
	}

	public void setPerDayViewRooms(List<PerDayViewRoomDetails> perDayViewRooms) {
		this.perDayViewRooms = perDayViewRooms;
	}

	public StatusView getStatus() {
		return status;
	}

	public void setStatus(StatusView status) {
		this.status = status;
	}

}
