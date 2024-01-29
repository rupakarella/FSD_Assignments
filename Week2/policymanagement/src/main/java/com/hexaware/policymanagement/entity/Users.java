package com.hexaware.policymanagement.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Users {
	@Id
	private int userId;
	private String eMail;
	private String contactNo;
	private String password;
	private String firstName;
	private String lastName;
	private LocalDate date;
	private String panNo;
	private String employerType;
	private String employerName;
	private double salary;
	private String userType;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressId")	
	private Address address;
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<UserPolicies> user_Policies;
	
	public Users() {
		super();
	}

	public Users(int userId, String eMail, String contactNo, String password, String firstName, String lastName,
			LocalDate date, String panNo, String employerType, String employerName, double salary, String userType,
			Address address, List<UserPolicies> user_Policies) {
		super();
		this.userId = userId;
		this.eMail = eMail;
		this.contactNo = contactNo;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.panNo = panNo;
		this.employerType = employerType;
		this.employerName = employerName;
		this.salary = salary;
		this.userType = userType;
		this.address = address;
		this.user_Policies = user_Policies;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getEmployerType() {
		return employerType;
	}

	public void setEmployerType(String employerType) {
		this.employerType = employerType;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<UserPolicies> getUser_Policies() {
		return user_Policies;
	}

	public void setUser_Policies(List<UserPolicies> user_Policies) {
		this.user_Policies = user_Policies;
	}
	
}
