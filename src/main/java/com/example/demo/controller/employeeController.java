package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.employee;
import com.example.demo.repository.employeeRepo;

@RestController
public class employeeController {
	@Autowired
	private employeeRepo empRepo;
	
	@PostMapping("/saveEmployeesOneToOne")
	public String saveDetails(@RequestBody employee e)
	{
		empRepo.save(e);
		return "Data saved";
	}
	
	
}