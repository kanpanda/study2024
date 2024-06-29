package com.bookapp.bookapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book { 
	@Id
	private int bookId;
    private String author;
    private String title;

	// getterとsetterの設定
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
    public String getAuthor() {
		return author;
	}
	public void setAuthor(String Author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
