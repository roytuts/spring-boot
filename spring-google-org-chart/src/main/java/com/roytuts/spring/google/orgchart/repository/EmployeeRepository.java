package com.roytuts.spring.google.orgchart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.google.orgchart.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
