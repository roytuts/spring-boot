package com.roytuts.spring.google.pie.chart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.roytuts.spring.google.pie.chart.dao.PieChartDao;
import com.roytuts.spring.google.pie.chart.dao.PieChartDao.KeyValue;

@Service
public class PieChartService {

	public List<KeyValue> getPieChartData() {
		return PieChartDao.getPieDataList();
	}

}
