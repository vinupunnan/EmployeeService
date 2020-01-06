package com.employee.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.api.service.EmployeeService;
import com.employee.api.service.impl.EmployeeServiceImpl;
import com.empolyee.api.model.Employee;
import com.empolyee.api.model.EmployeeList;
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employService;

	
	@RequestMapping("/employee")
	public EmployeeList getEmployees() {
		return new EmployeeList( employService.getAllEmployees());
		
	}
	
//	public EmployeeList getEmployee(String id) {
//		return new EmployeeList( employService.getEmployeeById(id));
//		
//	}
	
}
