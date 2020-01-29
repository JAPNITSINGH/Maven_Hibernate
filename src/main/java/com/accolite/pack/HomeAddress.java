package com.accolite.pack;

import javax.persistence.Entity;

@Entity
public class HomeAddress extends Address {
	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public HomeAddress(int pin)
	{
		this.pin = pin;
		//this.addressID = 4001;
		this.streetName = "Home LF Street";
		
	}
}
