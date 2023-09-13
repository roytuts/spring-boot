package com.roytuts.spring.google.pie.chart.dao;

import java.util.ArrayList;
import java.util.List;

public class PieChartDao {

	private static final List<KeyValue> pieDataList;

	static {
		pieDataList = new ArrayList<KeyValue>();
		pieDataList.add(new KeyValue("Russia", "17098242"));
		pieDataList.add(new KeyValue("Canada", "9984670"));
		pieDataList.add(new KeyValue("USA", "9826675"));
		pieDataList.add(new KeyValue("China", "9596961"));
		pieDataList.add(new KeyValue("Brazil", "8514877"));
		pieDataList.add(new KeyValue("Australia", "7741220"));
		pieDataList.add(new KeyValue("India", "3287263"));
	}

	public static List<KeyValue> getPieDataList() {
		return pieDataList;
	}

	public static class KeyValue {
		String key;
		String value;

		public KeyValue(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
	}

}
