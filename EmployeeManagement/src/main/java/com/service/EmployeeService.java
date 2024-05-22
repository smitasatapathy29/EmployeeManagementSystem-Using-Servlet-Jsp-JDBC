package com.service;

import java.util.List;

import com.dao.EmployeeDAO;
import com.daoimpl.DAOImpl;
import com.model.Employee;

public class EmployeeService {
	private EmployeeDAO objDao = new DAOImpl();
	
	public int insertEmployee(Employee emp ) {
		return objDao.insertEmployee(emp);
		}
	public Employee showEmployee( Integer emp_id) {
		
		return objDao.showEmployeebyId(emp_id);
		}
	public Boolean deletEmployee(Integer emp_id) {
		return objDao.deletEmployee(emp_id);
	}
	public List<Employee> showAllEmp(Employee emp){
		return objDao.showAllEmp();
		
	}
	}


