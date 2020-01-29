package com.accolite.pack;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Embeddable
@Entity
public class Address {
	 @Id 	// Don't use this if you are uisng Embedble good practice is not using @Embeddable 
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int addressID;
	 protected String streetName;
	
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public Address()
	{}
	public Address( String streetName)
	{
		
		this.streetName = streetName;
	}
}
