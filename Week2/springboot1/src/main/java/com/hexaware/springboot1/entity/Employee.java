package com.hexaware.springboot1.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int eId;
	private String eName;
	private int salary;
	public Employee() {
		super();
	}
	public Employee(int eId, String eName, int salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + "]";
	}
	
}
