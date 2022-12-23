package com.nagarro.dao;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.domain.Authors;
public interface AuthorsDao extends CrudRepository<Authors, Integer> {

}
