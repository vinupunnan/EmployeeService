package com.employee.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.api.service.EmployeeService;
import com.employee.api.service.impl.EmployeeServiceImpl;
import com.empolyee.api.model.Employee;
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employService;

	
	@RequestMapping("/employee")
	public List<Employee> getEmployees() {
		return employService.getAllEmployees();
	}
	
	public Employee getEmployee(String id) {
		return employService.getEmployeeById(id);
		
	}
	
}
