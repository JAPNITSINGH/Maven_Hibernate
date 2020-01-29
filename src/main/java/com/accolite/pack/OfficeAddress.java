package com.accolite.pack;

import javax.persistence.Entity;

@Entity
public class OfficeAddress extends Address{
	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phone_number) {
		this.phoneNumber = phone_number;
	}
	
	public OfficeAddress(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
		//this.addressID = 2001;
		this.streetName = "Office LF Street";
	}

}
