package com.roytuts.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.roytuts.entity.Employee;
import com.roytuts.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Resource
	private EmployeeRepository employeeRepository;

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
}
