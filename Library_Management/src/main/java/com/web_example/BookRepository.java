package com.web_example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<book, Integer>
{
	
}
