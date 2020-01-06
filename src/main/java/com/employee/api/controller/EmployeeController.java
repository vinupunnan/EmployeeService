package com.employee.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.api.service.EmployeeService;
import com.empolyee.api.model.Employee;
import com.empolyee.api.model.EmployeeList;
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employService;

	
	@RequestMapping("/employees")
	public EmployeeList getEmployees() {
		return new EmployeeList( employService.getAllEmployees());
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value ="/employees")
	public String addEmployee(@RequestBody Employee emp) {
		 employService.insertEmployee(emp);
		return "Success";
		
	}
	
	

}
