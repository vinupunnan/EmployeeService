package com.empolyee.api.model;

public class Employee {

	public Employee(String employeeId, String empName, String empDesignation, String depId) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.depId = depId;
	}

	public Employee() {
		
		
	}
	private  String employeeId;
	private String empName;

	private String empDesignation;

	private String depId;


	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	
	
}
