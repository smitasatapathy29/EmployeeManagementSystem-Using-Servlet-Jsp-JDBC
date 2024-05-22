package com.model;

public class Employee {
	private String name;
	private Integer emp_Id;
	private String email_Id;
	private Long mob_No;
	private String gender;
	private String city;

		
	
	public Employee(String name, Integer empId, String emailId, Long mobNo, String gender, String city) {
		super();
		this.name = name;
		this.emp_Id = empId;
		this.email_Id = emailId;
		this.mob_No = mobNo;
		this.gender = gender;
		this.city = city;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(Integer empId) {
		this.emp_Id = empId;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String emailId) {
		this.email_Id = emailId;
	}
	public Long getMob_No() {
		return mob_No;
	}
	public void setMob_No(Long mobNo) {
		this.mob_No = mobNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
		@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + emp_Id + ", emailId=" + email_Id + ", mobNo=" + mob_No + ", gender="
				+ gender + ", city=" + city + "]";
}
}