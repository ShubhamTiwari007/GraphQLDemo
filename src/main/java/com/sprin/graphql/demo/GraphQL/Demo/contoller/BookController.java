//package com.sprin.graphql.demo.GraphQL.Demo.contoller;
//
//import com.sprin.graphql.demo.GraphQL.Demo.entity.Book;
//import com.sprin.graphql.demo.GraphQL.Demo.service.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/v1/book/")
//public class BookController {
//
//    @Autowired
//    private BookService bookService;
//
//    @PostMapping("addBook")
//    public Book createBook(@RequestBody Book book){
//        return bookService.createBoo(book);
//    }
//
//    @GetMapping("getAllBook")
//    public List<Book> getAllBooks(){
//        return bookService.getAllBooks();
//    }
//
//    @GetMapping("getBookById/{bookId}")
//    public Book getBookById(@PathVariable("bookId") int id){
//        return bookService.getBookById(id);
//    }
//
//}
