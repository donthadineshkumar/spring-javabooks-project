package com.bshop.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bshop.entity.Book;
import com.bshop.repository.BookRepository;


@Service
public class InitBooks {

	@Autowired
	BookRepository bookRepository;
	
	
	@PostConstruct
	public void init(){
		Book book = new Book("Lord of Rings","Dinesh",34.5F);
		bookRepository.save(book);
		
		Book book1 = new Book("The Universe","Stephen Hawking",100F);
		bookRepository.save(book1);
		
		Book book2 = new Book("Two States","Chetan Bhagath",99.5F);
		bookRepository.save(book2);		
	}
	
}
