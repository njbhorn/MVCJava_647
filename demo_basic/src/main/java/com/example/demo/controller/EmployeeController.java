package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController	
public class EmployeeController {
	
	@RequestMapping("/")
	public List<Employee> getEmployees() {
	
		List<Employee> employeesList = new ArrayList<Employee>() ;
		
		employeesList.add ( new Employee( 1, "fred", "smith", "fred@qa.com"));
		
		return employeesList ;
	}
}
