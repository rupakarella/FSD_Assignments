package com.hexaware.userspringjdbc.model;

public class Users {
	private int userId;
	private String name;
	private int age;
	private int salary;
	public Users(int userId, String name, int age, int salary) {
		super();
		this.userId=userId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Users() {
		super();
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Users [id="+ userId +", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
