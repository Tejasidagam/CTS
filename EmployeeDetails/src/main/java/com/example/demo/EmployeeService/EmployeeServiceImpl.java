package com.example.demo.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.EmployeeDao;
import com.example.demo.Entity.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao dao;
	@Override
	public String addEmployee(Employee pro) {
		// TODO Auto-generated method stub
		return dao.addEmployee(pro);
	}

	@Override
	public Employee getEmployeeDetails(int empid) {
		// TODO Auto-generated method stub
		return dao.getEmployeeDetails(empid);
	}
	@Override
	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(emp);
	}

	@Override
	public String deleteById(int empid) {
		// TODO Auto-generated method stub
		return dao.deleteById(empid);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

	@Override
	public List<Employee> getEmployeesBySalary(int salary1, int salary2) {
		// TODO Auto-generated method stub
		return dao.getEmployeesBySalary(salary1, salary2);
	}

	@Override
	public List<Employee> getEmployeesByDesg(String EmployeeDesg) {
		// TODO Auto-generated method stub
		return dao.getEmployeesByDesg(EmployeeDesg);
	}

}
