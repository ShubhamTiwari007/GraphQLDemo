package com.sprin.graphql.demo.GraphQL.Demo.service.impl;

import com.sprin.graphql.demo.GraphQL.Demo.entity.Book;
import com.sprin.graphql.demo.GraphQL.Demo.repo.BookRepo;
import com.sprin.graphql.demo.GraphQL.Demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book createBoo(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book getBookById(int bookId) {
        return bookRepo.findById(bookId).orElseThrow(()->new RuntimeException("No Book with id: "+bookId+" found"));
    }
}
