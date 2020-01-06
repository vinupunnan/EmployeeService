package com.empolyee.api.model;

import java.util.List;

public class EmployeeList {
	public EmployeeList(List<Employee> employees) {
		super();
		this.employees = employees;
	}

public EmployeeList() {
		
	}
	
	private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
}
