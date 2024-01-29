package com.hexaware.hibernate;
import java.util.List;

import com.hexaware.hibernate.entity.Employee;
public class NamedQueryTest {
	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		List<Employee> list= dao.getAllEmployees();
		System.out.println(list);
		Employee emp= dao.getEmployeeByName();
		System.out.println(emp);
	}
}