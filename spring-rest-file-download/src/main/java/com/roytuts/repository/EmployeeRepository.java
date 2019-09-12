package com.roytuts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}