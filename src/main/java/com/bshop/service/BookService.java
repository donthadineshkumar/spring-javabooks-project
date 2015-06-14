package com.bshop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bshop.entity.Book;
import com.bshop.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	public void saveBook(Book book) {
		bookRepository.save(book);
	}

	public Book findOne(String bookname) {
		Book book = bookRepository.findByName(bookname);
		return book;
	}

	public List<Book> findAll() {
		List<Book> books = bookRepository.findAll();
		return books;
	}

	public void remove(Long id) {
		bookRepository.delete(id);
	}

	public Book findOne(Long id) {
		Book book = bookRepository.findOne(id);
		return book;
	}

	@Transactional
	public void updateBook(Book book) {
		System.out.println(book.getId()+" "+book.getPrice()+" "+book.getAuthorName());
		bookRepository.updateBook(book.getId(), book.getPrice(),
				book.getAuthorName());
	}

}
