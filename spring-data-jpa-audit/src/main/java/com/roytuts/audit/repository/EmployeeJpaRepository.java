package com.roytuts.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.audit.entity.Employee;

public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer> {

	Employee findByEmpId(Integer id);

}
