package com.hobman.rest.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class RoomType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomTypeId;
	private String roomType;
	private double rent;
	
	@OneToMany(targetEntity=Hotel.class ,cascade=CascadeType.ALL)
	@JoinColumn(name="room_type_id", referencedColumnName="roomTypeId")
	private Set<Hotel> hotels;
	
	public RoomType() {
		super();
	}
	
	

	public RoomType(int roomTypeId, String roomType, double rent, Set<Hotel> hotels) {
		super();
		this.roomTypeId = roomTypeId;
		this.roomType = roomType;
		this.rent = rent;
		this.hotels = hotels;
	}

	public int getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(int roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public Set<Hotel> getHotels() {
		return hotels;
	}
	public void setHotels(Set<Hotel> hotels) {
		this.hotels = hotels;
	}
	
	
	
}
