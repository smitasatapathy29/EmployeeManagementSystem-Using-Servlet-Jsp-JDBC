package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	int insertEmployee(Employee emp);
	Employee showEmployeebyId( Integer emp_id);
	Boolean deletEmployee(Integer emp_id);
	List<Employee> showAllEmp();
}
