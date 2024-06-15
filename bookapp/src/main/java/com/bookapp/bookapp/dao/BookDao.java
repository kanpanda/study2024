package com.bookapp.bookapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.bookapp.entity.Book;

@Repository
// JpaRepository<操作対象のEntity, 操作対象Entityの主キーの型>
public interface BookDao extends JpaRepository<Book, String>{
}