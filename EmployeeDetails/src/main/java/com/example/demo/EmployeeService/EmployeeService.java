package com.example.demo.EmployeeService;

import java.util.List;

import com.example.demo.Entity.Employee;

	public interface EmployeeService {
	public abstract String addEmployee(Employee pro); 

	public abstract Employee getEmployeeDetails(int empid);

	public abstract String updateEmployee(Employee emp);

	public abstract String deleteById(int empid);
	
	public abstract List<Employee> getAllEmployees();
	
	public abstract List<Employee> getEmployeesBySalary(int salary1,int salary2);
	
	public abstract List<Employee> getEmployeesByDesg(String EmployeeDesg);

}
