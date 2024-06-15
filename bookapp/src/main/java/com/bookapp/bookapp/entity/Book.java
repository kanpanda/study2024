package com.bookapp.bookapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book { 
	@Id
    private String bookId;
    private String author;
    // private String title;
    // private String publisher;

    public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


    
}
