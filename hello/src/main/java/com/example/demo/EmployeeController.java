package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/employee-details")
	public Employee employeeDetails() {
		return new Employee("sai","Vignesh");
	}
	@GetMapping("/employee-list")
	public List<Employee> employers(){
	List<Employee> list=new ArrayList<>();
	list.add(new Employee("Manisha","Dhamerla"));
	list.add(new Employee("Akhira","suvidha"));
	list.add(new Employee("lavanya","thripatu"));
	return list;
	}

}
