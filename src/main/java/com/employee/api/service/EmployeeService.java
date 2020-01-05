package com.employee.api.service;

import java.util.List;

import com.empolyee.api.model.Employee;

public interface EmployeeService {
	
	void insertEmployee(Employee emp);
	void insertEmployees(List<Employee> employees);
	public List<Employee>  getAllEmployees();
	public Employee getEmployeeById(String empid);

}
