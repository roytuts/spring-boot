package com.roytuts.spring.google.orgchart.converter;

import java.util.List;
import java.util.stream.Collectors;

import com.roytuts.spring.google.orgchart.dto.EmpDto;
import com.roytuts.spring.google.orgchart.entity.Employee;

public final class EmpDtoEntityConverter {

	public static EmpDto getEmpDto(Employee employee) {
		return new EmpDto(employee.getId(), employee.getName(), employee.getDesignation(), employee.getManager());
	}

	public static List<EmpDto> getEmpDtoList(List<Employee> employees) {
		return employees.stream().map(e -> getEmpDto(e)).collect(Collectors.toList());
	}

}
