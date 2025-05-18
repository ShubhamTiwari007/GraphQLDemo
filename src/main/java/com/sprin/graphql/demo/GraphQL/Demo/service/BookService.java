package com.sprin.graphql.demo.GraphQL.Demo.service;

import com.sprin.graphql.demo.GraphQL.Demo.entity.Book;

import java.util.List;

public interface BookService {

    Book createBoo(Book book);

    List<Book> getAllBooks();

    Book getBookById(int bookId);

}
