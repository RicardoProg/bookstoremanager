package com.ricardo.bookstoremanager.service;

import org.springframework.stereotype.Service;
import com.ricardo.bookstoremanager.dto.MessageResponseDTO;
import com.ricardo.bookstoremanager.entity.Book;
import com.ricardo.bookstoremanager.repository.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
public MessageResponseDTO create(Book book) {
		
		Book savedBook = bookRepository.save(book);
		return MessageResponseDTO.builder().message("Livro criado com ID " + savedBook.getId()).build();
		
	}

}
