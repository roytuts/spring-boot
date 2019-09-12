package com.roytuts.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.roytuts.dto.DeptEmpDto;
import com.roytuts.repository.DepartmentRepository;
import com.roytuts.repository.EmployeeRepository;

@Service
public class JoinQueryService {

	@Resource
	private DepartmentRepository departmentRepository;
	@Resource
	private EmployeeRepository employeeRepository;

	public List<DeptEmpDto> getDeptEmployeesLeftJoin() {
		List<DeptEmpDto> list = departmentRepository.fetchEmpDeptDataLeftJoin();
		list.forEach(l -> System.out.println(l));
		return list;
	}

	public List<DeptEmpDto> getDeptEmployeesRightJoin() {
		List<DeptEmpDto> list = departmentRepository.fetchEmpDeptDataRightJoin();
		list.forEach(l -> System.out.println(l));
		return list;
	}

	public List<DeptEmpDto> getDeptEmployeesInnerJoin() {
		List<DeptEmpDto> list = employeeRepository.fetchEmpDeptDataInnerJoin();
		list.forEach(l -> System.out.println(l));
		return list;
	}

	public List<DeptEmpDto> getDeptEmployeesCrossJoin() {
		List<DeptEmpDto> list = employeeRepository.fetchEmpDeptDataCrossJoin();
		list.forEach(l -> System.out.println(l));
		return list;
	}

}
