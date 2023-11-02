package com.roytuts.spring.google.orgchart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.google.orgchart.converter.EmpDtoEntityConverter;
import com.roytuts.spring.google.orgchart.dto.EmpDto;
import com.roytuts.spring.google.orgchart.entity.Employee;
import com.roytuts.spring.google.orgchart.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<EmpDto> getEmpList() {
		List<Employee> employees = employeeRepository.findAll();

		return EmpDtoEntityConverter.getEmpDtoList(employees);
	}

}
