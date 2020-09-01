package com.hotel.room.reservation.model.view;

import java.util.List;

public class ViewReservationResponse {

	private String checkInDt;
	private String checkOutDt;
	private GuestView guest;
	private int roomCounnt;
	private int guestCount;
	private String roomtype;
	private StatusView status;

	public GuestView getGuest() {
		return guest;
	}

	public void setGuest(GuestView guest) {
		this.guest = guest;
	}

	public String getCheckInDt() {
		return checkInDt;
	}

	public void setCheckInDt(String checkInDt) {
		this.checkInDt = checkInDt;
	}

	public String getCheckOutDt() {
		return checkOutDt;
	}

	public void setCheckOutDt(String checkOutDt) {
		this.checkOutDt = checkOutDt;
	}

	public int getGuestCount() {
		return guestCount;
	}

	public void setGuestCount(int guestCount) {
		this.guestCount = guestCount;
	}

	public StatusView getStatus() {
		return status;
	}

	public void setStatus(StatusView status) {
		this.status = status;
	}

}
