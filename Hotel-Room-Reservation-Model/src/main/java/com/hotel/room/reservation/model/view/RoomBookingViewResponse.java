package com.hotel.room.reservation.model.view;

public class RoomBookingViewResponse {

	private StatusView status;
	private String reason;

	public StatusView getStatus() {
		return status;
	}

	public void setStatus(StatusView status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
