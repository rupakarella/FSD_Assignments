package com.hexaware.policymanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	private int addressId;
	private String addressLine;
	private String cityPincode;
	private String State;
	@OneToMany(mappedBy="address",cascade=CascadeType.ALL)
	private List<Users> user;
	public Address() {
		super();
	}
	public Address(int addressId, String addressLine, String cityPincode, String state, List<Users> user) {
		super();
		this.addressId = addressId;
		this.addressLine = addressLine;
		this.cityPincode = cityPincode;
		State = state;
		this.user = user;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCityPincode() {
		return cityPincode;
	}
	public void setCityPincode(String cityPincode) {
		this.cityPincode = cityPincode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public List<Users> getUser() {
		return user;
	}
	public void setUser(List<Users> user) {
		this.user = user;
	}
}