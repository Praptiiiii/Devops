package com.nagarro.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.dao.AuthorsDao;
import com.nagarro.domain.Authors;

@Service
public class AuthorsService {

	@Autowired
	private AuthorsDao authorsDao;  

	public List<Authors> getAllAuthors() {
		List<Authors> authors = new ArrayList<>();
		authorsDao.findAll().forEach(authors::add);
		return authors;
	}

	public Optional<Authors> getAuthors(int id) {
		return authorsDao.findById(id);
	}

}
