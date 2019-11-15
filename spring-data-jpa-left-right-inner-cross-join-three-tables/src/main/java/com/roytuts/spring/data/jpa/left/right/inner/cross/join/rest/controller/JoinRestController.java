package com.roytuts.spring.data.jpa.left.right.inner.cross.join.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto;
import com.roytuts.spring.data.jpa.left.right.inner.cross.join.service.JoinService;

@RestController
public class JoinRestController {

	@Autowired
	private JoinService joinService;

	@GetMapping("/join/left")
	public ResponseEntity<List<JoinDto>> getLeftJoinData() {
		return new ResponseEntity<List<JoinDto>>(joinService.leftJoinData(), HttpStatus.OK);
	}

	@GetMapping("/join/right")
	public ResponseEntity<List<JoinDto>> getRightJoinData() {
		return new ResponseEntity<List<JoinDto>>(joinService.rightJoinData(), HttpStatus.OK);
	}

	@GetMapping("/join/inner")
	public ResponseEntity<List<JoinDto>> getLeftInnerData() {
		return new ResponseEntity<List<JoinDto>>(joinService.innerJoinData(), HttpStatus.OK);
	}

	@GetMapping("/join/cross")
	public ResponseEntity<List<JoinDto>> getLeftCrossData() {
		return new ResponseEntity<List<JoinDto>>(joinService.crossJoinData(), HttpStatus.OK);
	}

}
