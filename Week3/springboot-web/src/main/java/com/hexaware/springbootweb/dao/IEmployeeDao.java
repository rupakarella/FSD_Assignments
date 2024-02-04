package com.hexaware.springbootweb.dao;

import java.util.List;
import com.hexaware.springbootweb.entity.Employee;
public interface IEmployeeDao {
	public  String  addEmployee(Employee emp);
	public  String  updateEmployee(Employee emp);
	public  List<Employee>  getAll();
	public String deleteEmployee(int eid);
	public Employee getEmployee(int eid);
}
