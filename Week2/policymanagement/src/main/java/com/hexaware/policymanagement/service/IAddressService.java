package com.hexaware.policymanagement.service;

import java.util.List;

import com.hexaware.policymanagement.entity.Address;

public interface IAddressService {
	public Address createAddress(Address address);
	public Address updateAddress(Address address);
	public void deleteByAddressId(int addressId);
	public List<Address> getByState(String state);
	public List<Address> getByCityPincode(String cityPincode);
	public List<Address> getAllAddress();
}
