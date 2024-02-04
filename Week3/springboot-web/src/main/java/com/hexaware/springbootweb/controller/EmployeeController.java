package com.hexaware.springbootweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springbootweb.dao.IEmployeeDao;
import com.hexaware.springbootweb.entity.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/employees")
public class EmployeeController { // SERVLET
	@Autowired
	IEmployeeDao dao;
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String addEmployee(HttpServletRequest request, HttpServletResponse response) {
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double salary = Double.parseDouble(request.getParameter("salary"));
		Employee emp = new Employee(eid, ename, salary);
		return dao.addEmployee(emp);
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String updateEmployee(HttpServletRequest request, HttpServletResponse response) {
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double salary = Double.parseDouble(request.getParameter("salary"));
		Employee emp = new Employee(eid, ename, salary);
		return dao.updateEmployee(emp);
	}
	
	@RequestMapping("/getall")
	//@ResponseBody
	public String    getAllEmployees(HttpSession session) {
		List<Employee> list=dao.getAll();
		session.setAttribute("empList", list);	
		return "displayAll";
	}
	@RequestMapping("/get")
	
	public String get()
	{
		return "success";
	}
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(HttpServletRequest request)
	{
		int eid=Integer.parseInt(request.getParameter("eid"));
		return dao.deleteEmployee(eid);
	}
	@RequestMapping("/getbyid")
	@ResponseBody
	public Employee select(HttpServletRequest request)
	{
		int eid=Integer.parseInt(request.getParameter("eid"));
		return dao.getEmployee(eid);
	}
}
