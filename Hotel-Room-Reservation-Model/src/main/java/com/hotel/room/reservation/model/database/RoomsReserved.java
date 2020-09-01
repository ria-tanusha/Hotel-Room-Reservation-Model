package com.hotel.room.reservation.model.database;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "roomsreserved")
public class RoomsReserved {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int room_booked_id;
	private String room_type;
	private String reserved_date;
	private String rooms_booked;
	private boolean active;
	
	@ManyToOne(cascade = CascadeType.ALL)
	//private String reservation_id;//Before setting the relationship with Reservation Table
	@JoinColumn(name = "reservation_id")//Data attribute name
	private Reservation reservation;
	
	
	
	public RoomsReserved() {
    }

    public RoomsReserved(String room_type, String reserved_date,String rooms_booked,Reservation reservation,boolean active) {

        this.room_type = room_type;
        this.reserved_date = reserved_date;
        this.rooms_booked = rooms_booked;
        this.reservation = reservation;
        this.active = active;
    }
	
	
	public int getRoom_booked_id() {
		return room_booked_id;
	}
	public void setRoom_booked_id(int room_booked_id) {
		this.room_booked_id = room_booked_id;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public String getReserved_date() {
		return reserved_date;
	}
	public void setReserved_date(String reserved_date) {
		this.reserved_date = reserved_date;
	}
	public String getRooms_booked() {
		return rooms_booked;
	}
	public void setRooms_booked(String rooms_booked) {
		this.rooms_booked = rooms_booked;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
