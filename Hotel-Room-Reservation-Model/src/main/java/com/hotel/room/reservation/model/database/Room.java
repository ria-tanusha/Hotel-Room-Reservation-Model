package com.hotel.room.reservation.model.database;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int room_number;
	private String room_type;
	private String room_features;
	private BigDecimal room_rate;
	
	public Room() {
    }

    public Room(String room_type, String room_features,BigDecimal room_rate) {

        this.room_type = room_type;
        this.room_features = room_features;
        this.room_rate = room_rate;
    }

	public int getRoom_number() {
		return room_number;
	}

	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public String getRoom_features() {
		return room_features;
	}

	public void setRoom_features(String room_features) {
		this.room_features = room_features;
	}

	public BigDecimal getRoom_rate() {
		return room_rate;
	}

	public void setRoom_rate(BigDecimal room_rate) {
		this.room_rate = room_rate;
	}

}
