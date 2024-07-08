package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Employee_Info")
public class Employee {
	@Id
	//@GeneratedValue
	
	@Min(value=1000, message="Employee Id Must be Greater Than 1000")
	
	@Column(name="Employee_Id")
	
	private int empid;
	@Size
	private String empName;
	private int empSalary;
	private String empDesg;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empName, int empSalary, String empDesg) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesg = empDesg;
	}
	
	
	

}
