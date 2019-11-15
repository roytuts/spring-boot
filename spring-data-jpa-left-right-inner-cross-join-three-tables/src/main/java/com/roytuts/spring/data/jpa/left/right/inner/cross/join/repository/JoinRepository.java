package com.roytuts.spring.data.jpa.left.right.inner.cross.join.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto;
import com.roytuts.spring.data.jpa.left.right.inner.cross.join.entity.Company;

public interface JoinRepository extends JpaRepository<Company, Integer> {

	@Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto(s.id, f.name, c.name, s.amount) "
			+ "FROM Sale s LEFT JOIN s.food f LEFT JOIN f.company c")
	List<JoinDto> fetchDataLeftJoin();

	@Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto(s.id, f.name, c.name, s.amount) "
			+ "FROM Sale s RIGHT JOIN s.food f RIGHT JOIN f.company c")
	List<JoinDto> fetchDataRightJoin();

	@Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto(s.id, f.name, c.name, s.amount) "
			+ "FROM Sale s INNER JOIN s.food f INNER JOIN f.company c")
	List<JoinDto> fetchDataInnerJoin();

	@Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto(s.id, f.name, c.name, s.amount) "
			+ "FROM Sale s, Food f, Company c WHERE s.food.id = f.id AND f.company.id = c.id")
	List<JoinDto> fetchDataCrossJoin();

}
