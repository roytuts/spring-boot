package com.roytuts.spring.boot.ajax.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.boot.ajax.crud.entity.Company;

public interface CrudRepository extends JpaRepository<Company, Integer> {

}
