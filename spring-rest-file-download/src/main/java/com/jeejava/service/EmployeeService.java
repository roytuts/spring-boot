package com.jeejava.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jeejava.entity.Employee;
import com.jeejava.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Resource
	private EmployeeRepository employeeRepository;

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
}
