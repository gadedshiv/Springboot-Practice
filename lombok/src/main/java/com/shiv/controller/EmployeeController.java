package com.shiv.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiv.pojo.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/getEmployee")
	public ResponseEntity<Employee> getEmployee() {
		Employee employee=new Employee("Shiv","Gaded","gadedshiv@gmail.com","Senior Software Engineer");
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}

}
