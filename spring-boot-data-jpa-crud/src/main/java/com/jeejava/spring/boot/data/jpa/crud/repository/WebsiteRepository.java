package com.jeejava.spring.boot.data.jpa.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeejava.spring.boot.data.jpa.crud.entity.Website;

public interface WebsiteRepository extends JpaRepository<Website, Integer> {

}
