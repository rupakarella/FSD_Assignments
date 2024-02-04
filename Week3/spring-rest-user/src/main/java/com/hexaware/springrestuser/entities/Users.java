package com.hexaware.springrestuser.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="users_info")
public class Users {
	@Id
	@Min(100)
	private long userId;
	@Pattern(regexp="[a-z]{5,10}")
	private String userName;
	@Min(1000)
	@Max(100000)
	private double salary;
	@Email
	private String email;
	public Users() {
		super();
	}
	public Users(@Min(100) long userId, @Pattern(regexp = "[a-z]{5,10}") String userName,
			@Min(1000) @Max(100000) double salary, @Email String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.salary = salary;
		this.email = email;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", salary=" + salary + ", email=" + email + "]";
	}
	
}