package com.example.demo.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public String addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		em.persist(emp);
		return "Employee Added successfully";
	}

	@Override
	public Employee getEmployeeDetails(int empid) {
		// TODO Auto-generated method stub
		Employee emp = em.find(Employee.class, empid);
		return emp;
		
	}

	@Override
	public String updateEmployee( Employee emp) {
		// TODO Auto-generated method stub
		
		em.merge(emp);
		
		return "Updated Succesfully";
	}

	@Override
	public String deleteById(int empid) {
		// TODO Auto-generated method stub
		em.remove(getEmployeeDetails(empid));
		return "deleted Successfully";
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		TypedQuery<Employee> emp= em.createQuery("select e from Employee e",Employee.class);
		return emp.getResultList();
	}

	@Override
	public List<Employee> getEmployeesBySalary(int salary1, int salary2) {
		// TODO Auto-generated method stub
		TypedQuery<Employee> emp= em.createQuery("select e from Employee e where empSalary between ?1 and ?2 ",Employee.class);
		emp.setParameter(1,salary1);
		emp.setParameter(2,salary2);
		return emp.getResultList();
	}

	@Override
	public List<Employee> getEmployeesByDesg(String EmployeeDesg) {
		// TODO Auto-generated method stub
		TypedQuery<Employee> emp= em.createQuery("select e from Employee e where empDesg=?1",Employee.class);
		emp.setParameter(1,EmployeeDesg);
		return emp.getResultList();
		
	}

}
