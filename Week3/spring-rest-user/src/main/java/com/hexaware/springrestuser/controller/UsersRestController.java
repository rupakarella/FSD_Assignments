package com.hexaware.springrestuser.controller;

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

import com.hexaware.springrestuser.entities.Users;
import com.hexaware.springrestuser.service.IUsersService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UsersRestController {
	@Autowired
	IUsersService service;
	@PostMapping("/add")
	public Users addUser(@RequestBody @Valid Users user)
	{
		return service.addUser(user);
	}
	@PutMapping("/update")
	public Users updateUser(@RequestBody @Valid Users user)
	{
		return service.updateUser(user);
	}
	@DeleteMapping("/delete/{userId}")
	public String deleteUser(@PathVariable @Valid long userId)
	{
		return service.deleteUser(userId);
	}
	@GetMapping("/get/{userId}")
	public Users getById(@PathVariable @Valid long userId)
	{
		return service.getById(userId);
	}
	@GetMapping("/getAll")
	public List<Users> getAll()
	{
		return service.getAll();
	}
	@GetMapping("/getbysalarylt/{salary}")
	public List<Users> getBySalaryLT(@PathVariable double salary)
	{
		return service.findBySalaryLT(salary);
	}
	@GetMapping("/bysalrange/{min}/{max}")
	public List<Users> BySalRange(@PathVariable double  min, @PathVariable double max)
	{
		return service.BySalRange(min, max);
	}
	@DeleteMapping("/deletebyusername/{userName}")
	public String deleteByUsername(@PathVariable String userName)
	{
		return service.deleteByEname(userName);
	}
	

}
