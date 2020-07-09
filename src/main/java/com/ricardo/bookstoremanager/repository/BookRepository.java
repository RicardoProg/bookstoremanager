package com.ricardo.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
		

}
