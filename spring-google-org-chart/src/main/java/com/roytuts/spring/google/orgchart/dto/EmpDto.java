package com.roytuts.spring.google.orgchart.dto;

public class EmpDto {

	private Integer id;

	private String name;

	private String designation;

	private String manager;

	public EmpDto() {
	}

	public EmpDto(Integer id, String name, String designation, String manager) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.manager = manager;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

}
