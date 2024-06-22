package com.bookapp.bookapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book { 
	@Id
    private String author;
    private String title;
	// private String publishedDate;
	// private String genre;
	// private String publicationType;

	// getterとsetterの設定
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
