package com.roytuts.spring.google.pie.chart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.roytuts.spring.google.pie.chart.dao.PieChartDao.KeyValue;
import com.roytuts.spring.google.pie.chart.service.PieChartService;

@Controller
public class PieChartController {

	@Autowired
	private PieChartService pieChartService;

	@GetMapping("/piechart")
	public String pieChart(Model model) {
		List<KeyValue> pieDataList = pieChartService.getPieChartData();
		
		model.addAttribute("pieDataList", pieDataList);

		return "index";
	}

}
