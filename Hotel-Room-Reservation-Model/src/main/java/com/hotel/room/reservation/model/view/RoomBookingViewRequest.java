package com.hotel.room.reservation.model.view;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

public class RoomBookingViewRequest {

	@NotBlank(message = "Check-In-Date is mandatory")
	private String checkInDt;

	@NotBlank(message = "Check-Out-Date is mandatory")
	private String checkOutDt;
	private GuestView guest;
	private int guestCount;
	private int roomCount;

	@NotBlank(message = "Room type is mandatory")
	private String roomType;

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
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

	public GuestView getGuest() {
		return guest;
	}

	public void setGuests(GuestView guest) {
		this.guest = guest;
	}

	public int getGuestCount() {
		return guestCount;
	}

	public void setGuestCount(int guestCount) {
		this.guestCount = guestCount;
	}

}
