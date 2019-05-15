package com.jeejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeejava.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}