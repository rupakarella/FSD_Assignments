package com.hexaware.springrestdemo.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestdemo.entity.Employee;

@Repository
public class EmployeeRepositoryImp implements IEmployeeRepository{
	JdbcTemplate jdbcTemplate;
	public EmployeeRepositoryImp() {
	}
	@Autowired
	public EmployeeRepositoryImp(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
		System.out.println(jdbcTemplate);
	}
	@Override
	public Employee addEmployee(Employee emp) {
		Employee emp1=null;
		String insertEmp = "insert into employee_table values(?,?,?)";
		int count=jdbcTemplate.update(insertEmp, emp.getEid(), emp.getEname(), emp.getSalary());
		if(count>0)
		{
			emp1=emp;
		}
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		Employee emp1=null;
		String update = "update employee_table set ename=?,salary=? where eid=?";
		int count = jdbcTemplate.update(update,  emp.getEname(), emp.getSalary(), emp.getEid());
		if(count>0)
		{
			emp1=emp;
		}
		return emp;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		String select="select eid, ename, salary from employee_table where eid=?";
		return jdbcTemplate.queryForObject(select, new EmployeeMapper(),eid);
		
	}

	@Override
	public String deleteEmployeeById(int eid) {
		String delete="delete from employee_table where eid=?";
		jdbcTemplate.update(delete,eid);
		return eid+" record deleted";
	}

	@Override
	public List<Employee> getAllEmployees() {
		String selectAll="select eid,ename,salary from employee_table";
		List<Employee> list=jdbcTemplate.query(selectAll,new EmployeeMapper());
		return list;
		
	}

}
