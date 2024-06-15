package com.bookapp.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.bookapp.dao.BookDao;
import com.bookapp.bookapp.entity.Book;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public List<Book> getBook(){
        return bookDao.findAll();
    }


    
}
