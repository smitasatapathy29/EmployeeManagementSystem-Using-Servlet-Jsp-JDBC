package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.EmployeeDAO;
import com.model.Employee;
import com.util.JavaUtil;

public class DAOImpl implements EmployeeDAO{

	@Override
	public int insertEmployee(Employee emp) {
		try {
			Connection con = JavaUtil.getDbConnection();
			String query= "INSERT INTO employee( emp_id, name, email_id, mob_no, gender, city)VALUES (?,?,?,?,?,?)";
			PreparedStatement stm = con.prepareStatement(query);
	        stm.setInt(1, emp.getEmp_Id()); // Set the ID
	        stm.setString(2, emp.getName()); 
	        stm.setString(3, emp.getEmail_Id());
	        stm.setLong(4, emp.getMob_No()); 
	        stm.setString(5, emp.getGender()); 
	        stm.setString(6, emp.getCity()); 
	       	return stm.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
		return -1;
				
	}

	@Override
	public Employee showEmployeebyId(Integer id) {
					Employee emp = null;
			try {
				   Connection con = JavaUtil.getDbConnection();
		           String query = "SELECT * FROM employee WHERE emp_id = ?";
		           PreparedStatement stm = con.prepareStatement(query);
		           stm.setInt(1, id);
		           ResultSet result = stm.executeQuery();
		           if (result.next()) {
		               emp = new Employee();
		               emp.setEmp_Id(result.getInt("emp_id"));
		               emp.setName(result.getString("name"));
		               emp.setEmail_Id(result.getString("email_id"));
		               emp.setMob_No(result.getLong("mob_no"));
		               emp.setGender(result.getString("gender"));
		               emp.setCity(result.getString("city"));
		               
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return emp;
		
	}

	@Override
	public Boolean deletEmployee( Integer emp_id) {
		try {
			Connection con = JavaUtil.getDbConnection();
			String query = "DELETE FROM employee WHERE emp_id = ?";
			PreparedStatement stm = con.prepareStatement(query);
		    stm.setInt(1, emp_id); 
		    return stm.executeUpdate() > 0; 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;

	}
	public List<Employee> showAllEmp(){
		List<Employee>empList = new ArrayList<Employee>();
		try {
			Connection con = JavaUtil.getDbConnection();
			String query="SELECT * FROM employee";
			PreparedStatement stm = con.prepareStatement(query);
			ResultSet result = stm.executeQuery();
			while(result.next()) {
				Employee emp =new Employee();
				emp.setName(result.getString("name"));
				emp.setEmp_Id(result.getInt("emp_id"));
				emp.setEmail_Id(result.getString("email_id"));
				emp.setMob_No(result.getLong("mob_no"));
				emp.setGender(result.getString("gender"));
				emp.setCity(result.getString("city"));
				empList.add(emp);
			}
		}
		catch(Exception e) {
			
		}
		return empList;
		
	}

}
