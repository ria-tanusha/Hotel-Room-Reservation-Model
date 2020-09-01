package com.hotel.room.reservation.model.database;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reservation_id;
	private String check_in_date;
	private String check_out_date;
	private int guest_count;
	private boolean active;
	
	@ManyToOne(cascade = CascadeType.ALL)
	//private int guest_id;//Before setting the relationship with Guest Entity
	@JoinColumn(name = "guest_id")//Data attribute name
	private Guest guest;
	
	
	@OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL,
			fetch=FetchType.EAGER)//where guest is variable name of Reservation Entity under RoomsReserved Entity
	private List<RoomsReserved> roomsReserveds;

	

	public Reservation() {
	}

	public Reservation(String check_in_date, String check_out_date, Guest guest, int guest_count,
			boolean active) {

		this.check_in_date = check_in_date;
		this.check_out_date = check_out_date;
		this.guest = guest;
		this.guest_count = guest_count;
		this.active = active;
	}

	public int getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}

	public String getCheck_in_date() {
		return check_in_date;
	}

	public void setCheck_in_date(String check_in_date) {
		this.check_in_date = check_in_date;
	}

	public String getCheck_out_date() {
		return check_out_date;
	}

	public void setCheck_out_date(String check_out_date) {
		this.check_out_date = check_out_date;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public int getGuest_count() {
		return guest_count;
	}

	public void setGuest_count(int guest_count) {
		this.guest_count = guest_count;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	public List<RoomsReserved> getRoomsReserveds() {
		return roomsReserveds;
	}

	public void setRoomsReserveds(List<RoomsReserved> roomsReserveds) {
		for(RoomsReserved reserved : roomsReserveds) {
			reserved.setReservation(this);
		}
		this.roomsReserveds = roomsReserveds;
	}

}
