package com.roytuts.spring.google.orgchart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.roytuts.spring.google.orgchart.dto.EmpDto;
import com.roytuts.spring.google.orgchart.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/orgChart")
	public String orgChartData(Model model) {
		List<EmpDto> empDtos = employeeService.getEmpList();

		model.addAttribute("orgChartDataList", empDtos);

		return "index";
	}

}
