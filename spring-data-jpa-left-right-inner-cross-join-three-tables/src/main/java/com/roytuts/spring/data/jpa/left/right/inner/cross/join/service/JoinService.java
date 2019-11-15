package com.roytuts.spring.data.jpa.left.right.inner.cross.join.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto;
import com.roytuts.spring.data.jpa.left.right.inner.cross.join.repository.JoinRepository;

@Service
public class JoinService {

	@Autowired
	private JoinRepository joinRepository;

	public List<JoinDto> leftJoinData() {
		return joinRepository.fetchDataLeftJoin();
	}

	public List<JoinDto> rightJoinData() {
		return joinRepository.fetchDataRightJoin();
	}

	public List<JoinDto> innerJoinData() {
		return joinRepository.fetchDataInnerJoin();
	}

	public List<JoinDto> crossJoinData() {
		return joinRepository.fetchDataCrossJoin();
	}
}
