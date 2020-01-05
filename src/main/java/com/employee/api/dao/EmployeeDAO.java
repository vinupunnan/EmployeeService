package com.employee.api.dao;

import java.util.List;

import com.empolyee.api.model.Employee;

public interface EmployeeDAO {
	
	void insertEmployee(Employee cus);
	void insertEmployees(List<Employee> employees);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(String empId);

}
