package com.roytuts.forex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.forex.entity.ForexValue;

public interface ForexRepository extends JpaRepository<ForexValue, Integer> {

	ForexValue findByFromAndTo(String from, String to);

}
