/**
 * 
 */
package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author User
 *
 */
@Entity
public class Staff {
	
	@Id 
	private String username;
	private String password;
	private String hotelCode;
	
	
	
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String hotelCode, String username, String password) {
		super();
		this.hotelCode = hotelCode;
		this.username = username;
		this.password = password;
	}

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
