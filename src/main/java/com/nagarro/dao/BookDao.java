package com.nagarro.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.domain.Books;

public interface BookDao extends JpaRepository<Books, Integer> {

}
