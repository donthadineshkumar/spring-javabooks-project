package com.bshop.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bshop.entity.Book;
import com.bshop.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping
	public String books(Model model){
		model.addAttribute("books", bookService.findAll());
		return "show-book";
	}

	@RequestMapping(value = "/book", method = GET)
	public String store(Model model) {
		model.addAttribute(new Book());
		return "store-book";
	}

	@RequestMapping(value = "/book", method = POST)
	public String store(@Valid Book book, Errors errors) {
		if (errors.hasErrors()) {
			return "store-book";
		}

		bookService.saveBook(book);
		return "redirect:/books";
	}	
	
	@RequestMapping(value = "/book/{id}")
	public String bookById(@PathVariable Long id,Model model) {
		System.out.println("id "+ id);
		Book book = bookService.findOne(id);
		System.out.println("**"+book.getId());
		model.addAttribute("book",book);
		return "update-book";
	}
	
	@RequestMapping(value = "/update", method = POST)
	public String update(@Valid Book book, Errors errors) {
		System.out.println("In controller "+book.getId());
		if (errors.hasErrors()) {
			return "redirect:/update-book";
		}
		System.out.println("In update");
		bookService.updateBook(book);
		return "redirect:/books";
	}	
	
	@RequestMapping("/remove/{id}")
	public String store(@PathVariable Long id) {
		bookService.remove(id);
		return "redirect:/books";
	}
	
/*	@RequestMapping("/update")
	public String store(Model model) {
		
	}*/
		
	@RequestMapping("/account")
	public String showBook() {
		return "show-book";
	}

	@RequestMapping("/available")
	@ResponseBody
	public String checkBookAvail(@RequestParam String bookname){
		Boolean exists = bookService.findOne(bookname) == null;
		System.out.println("Book exists "+exists);
		return exists.toString();
	}
	
}
