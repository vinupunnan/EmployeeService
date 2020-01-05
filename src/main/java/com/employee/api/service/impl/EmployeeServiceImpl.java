package com.employee.api.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.api.dao.EmployeeDAO;
import com.employee.api.service.EmployeeService;
import com.empolyee.api.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private  List<Employee> employees= 
			Arrays.asList(new Employee("A001","Anu","Manager","1"),new Employee("A002","Anju","Clerk","1"),new Employee("A001","Amar","Senior dev","1"));
	@Autowired
	EmployeeDAO employeeDao;
	@Override
	public void insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertEmployees(List<Employee> employees) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeDao.getAllEmployees();
		
		
		
		
		
	}

	@Override
	public Employee getEmployeeById(String empid) {
		// TODO Auto-generated method stub
		return new Employee();
	}

}
