package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeService.EmployeeService;
import com.example.demo.Entity.Employee;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
		@Autowired
		EmployeeService es;
		
		@PostMapping("/addEmployee")
		public  String addEmployee(@RequestBody Employee emp) {
			
			return es.addEmployee(emp);
			
		}
		@GetMapping("/getEmployee/{empid}")
		@ResponseBody
		public  Employee getEmployeeDetails(@PathVariable("empid") int empid){
			
			// find
			return es.getEmployeeDetails(empid);
		}
		@PutMapping("/updateEmployee")
		
		public  String updateEmployee(@RequestBody Employee emp){
			return es.updateEmployee(emp);
			
		}
		@DeleteMapping("/deleteEmployee/{empid}")
		public  String deleteById(@PathVariable("empid") int empid) {
			return es.deleteById(empid);
			
		}
		
		@GetMapping("/getEmployees")
		@ResponseBody
		public  List<Employee> getAllEmployees(){
			
			return es.getAllEmployees();
			
		}
		@GetMapping("/getEmployeesbetween/{p1}/{p2}")
		@ResponseBody
		public  List<Employee> getEmployeesBySalary(@PathVariable("p1") int salary1,@PathVariable("p2") int salary2){
			
			return es.getEmployeesBySalary(salary1 ,salary2);
			
		}
		@GetMapping("/getEmployeesByDesg/{EmployeeDesg}")
		@ResponseBody
		public  List<Employee> getEmployeesByDesg(@PathVariable("EmployeeDesg") String EmployeeDesg){
			return es.getEmployeesByDesg(EmployeeDesg);
			
			
		}

}
