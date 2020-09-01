package com.hotel.room.reservation.model.database;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "guest")
public class Guest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int guest_id;
	private String identifier_number;
	private String first_name;
	private String last_name;
	private String phone;
	private int age;
	
	@OneToMany(mappedBy = "guest", cascade = CascadeType.ALL,
			fetch=FetchType.EAGER)//where guest is variable name of Guest Entity under Reservation Entity
	private List<Reservation> reservations;
	
	public Guest() {
    }

    public Guest(String identifier_number, String first_name,String last_name,String phone,int age) {

        this.identifier_number = identifier_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.age = age;
    }
	
	public int getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}
	public String getIdentifier_number() {
		return identifier_number;
	}
	public void setIdentifier_number(String identifier_number) {
		this.identifier_number = identifier_number;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		for(Reservation reservation : reservations) {
			reservation.setGuest(this);
		}
		this.reservations = reservations;
	}

}
