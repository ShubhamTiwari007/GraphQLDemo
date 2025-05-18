package com.sprin.graphql.demo.GraphQL.Demo.contoller;

import com.sprin.graphql.demo.GraphQL.Demo.entity.Book;
import com.sprin.graphql.demo.GraphQL.Demo.entity.BookInput;
import com.sprin.graphql.demo.GraphQL.Demo.service.BookMapper;
import com.sprin.graphql.demo.GraphQL.Demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class GraphQLBookController {


    @Autowired
    private BookService bookService;

    @Autowired
    private BookMapper mapper;

    @MutationMapping("createBook")
    public Book createBook(@Argument("book") BookInput bookInput){
        return bookService.createBoo(mapper.toBookEntity(bookInput));
    }

    @QueryMapping("allBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @QueryMapping("getBook")
    public Book getBookById(@Argument("bookId") int id){
        return bookService.getBookById(id);
    }
}
