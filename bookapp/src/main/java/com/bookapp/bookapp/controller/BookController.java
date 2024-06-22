package com.bookapp.bookapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.bookapp.entity.Book;

@RestController
@RequestMapping("/api")
public class BookController{
	@PostMapping("/submit")
	public ResponseEntity<String> handleSubmit(@RequestBody Book book){
		System.out.println("aaaa");
		// 受け取ったデータを処理する
		 System.out.println("Received data: " + book.getAuthor() + ", " + book.getTitle());
        // 成功した場合は200 OKを返す
        return ResponseEntity.ok("Data received successfully");
	} 
}