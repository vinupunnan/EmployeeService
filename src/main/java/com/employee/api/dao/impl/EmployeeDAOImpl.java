package com.employee.api.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.employee.api.dao.EmployeeDAO;
import com.empolyee.api.model.Employee;

@Repository
public class EmployeeDAOImpl extends  JdbcDaoSupport implements EmployeeDAO {

	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	@Override
	public void insertEmployee(Employee cus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertEmployees(List<Employee> employees) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
			String sql = "SELECT * FROM employee";
			List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
			
			List<Employee> result = new ArrayList<Employee>();
			for(Map<String, Object> row:rows){
				Employee emp = new Employee();
				emp.setEmployeeId((String)row.get("emp_Id"));
				emp.setEmpName((String)row.get("emp_name"));
				emp.setEmpDesignation((String)row.get("emp_desig"));
				emp.setDepId((String)row.get("dept_id"));
				result.add(emp);
			}
			
			return result;
		}

		


	@Override
	public Employee getEmployeeById(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
