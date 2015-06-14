package com.bshop.entity;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Size;


@Embeddable
public class Address {

	@Size(max = 20)
	private String street;
	
	@Size(max = 50)
	private String landmark;
	
/*	@Enumerated(EnumType.STRING)
	private City city;*/

	private String State;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
/*	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}*/

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
	
}
