package com.bookapp.bookapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.bookapp.entity.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Long> {

    // 全ての書籍を表示するメソッド
    List<Book> findAll();
    
    // タイトルで書籍を検索するメソッド
    List<Book> findByTitle(String title);

    // 著者で書籍を検索するメソッド
    List<Book> findByAuthor(String author);

    // その他、必要に応じて他の検索メソッドを追加できます
}
