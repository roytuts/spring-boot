package com.jeejava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jeejava.dto.DeptEmpDto;
import com.jeejava.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT new com.jeejava.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d INNER JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataInnerJoin();

	@Query("SELECT new com.jeejava.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d, Employee e")
	List<DeptEmpDto> fetchEmpDeptDataCrossJoin();

}
