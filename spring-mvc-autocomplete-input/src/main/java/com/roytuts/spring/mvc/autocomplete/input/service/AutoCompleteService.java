package com.roytuts.spring.mvc.autocomplete.input.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.roytuts.spring.mvc.autocomplete.input.dao.AutoCompleteDao;

@Service
public class AutoCompleteService {

	public List<String> doAutoComplete(final String input) {
		return AutoCompleteDao.getStrings(input);
	}

}
