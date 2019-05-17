package com.jeejava.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeejava.audit.entity.Employee;

public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer> {

	Employee findByEmpId(Integer id);

}
