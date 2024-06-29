package com.bookapp.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.bookapp.dao.BookDao;
import com.bookapp.bookapp.entity.Book;


@RestController
@RequestMapping("/api")
public class BookController{
	// BookDaoのインスタンスをBookControllerに自動的にインジェクションするために、Autowiredアノテーションをつける
	private final BookDao bookDao;
	@Autowired
	public BookController(BookDao bookDao){
		this.bookDao = bookDao;
	}

	@PostMapping("/submit")
	// @PostMapping は主に新しいデータの作成や既存データの更新に使用されます。
	// POST リクエストは冪等ではなく、同じリクエストを複数回送信すると異なる結果になる可能性があります。
	// 新しいデータを登録する役割を果たす
	public ResponseEntity<String> handleSubmit(@RequestBody Book book){
		System.out.println("aaaa");
		// 受け取ったデータを処理する
		 System.out.println("Received data: " + book.getAuthor() + ", " + book.getTitle());
        // 成功した場合は200 OKを返す
        return ResponseEntity.ok("Data received successfully");
	} 
	@GetMapping("/hello")
	public String sayHello(@RequestParam String name) {
		return "Hello," + name;
	}
	@GetMapping("/books")
	public List<Book> findAll() {
        return bookDao.findAll();
	}
}