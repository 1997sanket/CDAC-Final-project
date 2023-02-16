package com.hobman.rest.models;
import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.util.List;

	
	public class FindTheHotel  {
		private int hotelId;
		private String hotelName;
		private String city;
		private String state;
		private String pinCode;
		private float distFromCityCenter;
		private String roomType;
		private double rent;
      public FindTheHotel() {
      }
      
		
		public int getHotelId() {
			return hotelId;
		}
		public FindTheHotel(int hotelId, String hotelName, String city, String state, String pinCode,
				float distFromCityCenter, String roomType, double rent) {
			super();
			this.hotelId = hotelId;
			this.hotelName = hotelName;
			this.city = city;
			this.state = state;
			this.pinCode = pinCode;
			this.distFromCityCenter = distFromCityCenter;
			this.roomType = roomType;
			this.rent = rent;
		}
		@Override
		public String toString() {
			return "FindTheHotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", city=" + city + ", state=" + state
					+ ", pinCode=" + pinCode + ", distFromCityCenter=" + distFromCityCenter + ", roomType=" + roomType
					+ ", rent=" + rent + "]";
		}
		public void setHotelId(int hotelId) {
			this.hotelId = hotelId;
		}
		public String getHotelName() {
			return hotelName;
		}
		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPinCode() {
			return pinCode;
		}
		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}
		public float getDistFromCityCenter() {
			return distFromCityCenter;
		}
		public void setDistFromCityCenter(float distFromCityCenter) {
			this.distFromCityCenter = distFromCityCenter;
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
		
	}

