package com.jeejava.audit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jeejava.audit.service.EmployeeService;
import com.jeejava.audit.vo.EmployeeVo;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee/save")
	public ResponseEntity<Void> saveOrUpdateEmployee(@RequestBody EmployeeVo employee) {
		employeeService.saveOrUpdateEmployee(employee);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeVo>> getEmployees() {
		List<EmployeeVo> employees = employeeService.getEmployees();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}

}
