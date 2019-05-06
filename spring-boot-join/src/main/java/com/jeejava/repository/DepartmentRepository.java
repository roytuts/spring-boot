package com.jeejava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jeejava.dto.DeptEmpDto;
import com.jeejava.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	@Query("SELECT new com.jeejava.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d LEFT JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataLeftJoin();

	@Query("SELECT new com.jeejava.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d RIGHT JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataRightJoin();

}
