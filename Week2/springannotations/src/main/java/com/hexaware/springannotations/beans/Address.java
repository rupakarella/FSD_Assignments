package com.hexaware.springannotations.beans;

public class Address {
	private String city;

	public Address(String city) {
		super();
		this.city = city;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
}
