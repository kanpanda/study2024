package com.bookapp.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookapp.bookapp.entity.Book;
import com.bookapp.bookapp.service.BookService;
// import com.bookapp.bookapp.entity;

@Controller
public class BookController{
	@Autowired
	private BookService bookservice;
	@GetMapping("/book")
	@ResponseBody
	public List<Book> getBook(){
		List<Book> books = bookservice.getBook();
		return books;
	}

}