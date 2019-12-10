package com.roytuts.spring.boot.ajax.crud.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.spring.boot.ajax.crud.entity.Company;
import com.roytuts.spring.boot.ajax.crud.service.CrudService;

@RestController
@CrossOrigin(origins = "*")
public class CrudRestController {

	@Autowired
	private CrudService crudService;

	@GetMapping("/companyList")
	public ResponseEntity<List<Company>> getCompanyList() {
		return new ResponseEntity<List<Company>>(crudService.getCompanyList(), HttpStatus.OK);
	}

	@GetMapping("/company/{id}")
	public ResponseEntity<Company> getCompany(@PathVariable Integer id) {
		return new ResponseEntity<Company>(crudService.getCompanyById(id), HttpStatus.OK);
	}

	@PostMapping("/company/save")
	public ResponseEntity<Void> saveOrUpdateCompany(@RequestBody Company company) {
		crudService.saveOrUpdateCompany(company);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/company/delete/{id}")
	public ResponseEntity<Void> deleteCompany(@PathVariable Integer id) {
		crudService.deleteCompany(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
