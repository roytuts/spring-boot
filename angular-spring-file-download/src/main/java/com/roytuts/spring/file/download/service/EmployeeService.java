package com.roytuts.spring.file.download.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.file.download.entity.Employee;
import com.roytuts.spring.file.download.repository.EmployeeRepository;
import com.roytuts.spring.file.download.vo.EmployeeVo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<EmployeeVo> getEmployeeList() {
		List<Employee> list = employeeRepository.findAll();
		return list.stream().map(emp -> {
			EmployeeVo vo = new EmployeeVo();
			vo.setId(emp.getId());
			vo.setName(emp.getName());
			vo.setEmail(emp.getEmail());
			return vo;
		}).collect(Collectors.toList());
	}

}
