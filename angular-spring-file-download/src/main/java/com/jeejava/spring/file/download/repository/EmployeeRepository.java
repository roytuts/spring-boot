package com.jeejava.spring.file.download.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeejava.spring.file.download.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
