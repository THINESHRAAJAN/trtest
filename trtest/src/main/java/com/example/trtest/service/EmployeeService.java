package com.example.trtest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trtest.model.Employee;
import com.example.trtest.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo LRepo;

	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		/*
		 * ArrayList<Employee> emp = new ArrayList(); emp.add(new Employee((long)
		 * 1,"one","nine","r@gmail.com")); emp.add(new Employee((long)
		 * 2,"two","eight","raa@gmail.com")); emp.add(new Employee((long)
		 * 3,"three","seven","raa@gmail.com")); emp.add(new Employee((long)
		 * 4,"four","six","raaj@gmail.com")); emp.add(new Employee((long)
		 * 5,"five","five","raaja@gmail.com")); emp.add(new Employee((long)
		 * 6,"six","four","raajan@gmail.com")); emp.add(new Employee((long)
		 * 7,"seven","three","raajant@gmail.com")); emp.add(new Employee((long)
		 * 8,"eight","two","raajanth@gmail.com")); emp.add(new Employee((long)
		 * 9,"nine","one","raajanthi@gmail.com"));
		 */
		return LRepo.findAll();
	}

	public Employee updateEmployee(Long id, Employee empDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		
	}

}
