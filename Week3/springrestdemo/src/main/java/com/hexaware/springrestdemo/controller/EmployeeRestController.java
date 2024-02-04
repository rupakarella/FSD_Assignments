package com.hexaware.springrestdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestdemo.entity.Employee;
import com.hexaware.springrestdemo.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	@Autowired
	IEmployeeService service;
	@PostMapping("/add")
	public Employee insertEmployee(@RequestBody Employee emp)
	{
		return service.addEmployee(emp);
	}
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		return service.updateEmployee(emp);
	}
	@DeleteMapping("/delete/{eid}")
	public String deleteEmployeeById(@PathVariable int eid)
	{
		return service.deleteEmployeeById(eid);
	}
	@GetMapping("/get/{eid}")
	public Employee getEmployeeById(@PathVariable int eid)
	{
		return service.getEmployeeById(eid);
	}
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployees();
	}
}
