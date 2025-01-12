package com.demo.SampleLibrary.controller;

import com.demo.SampleLibrary.entity.Book;
import com.demo.SampleLibrary.error.BookDoesNotExistException;
import com.demo.SampleLibrary.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BooksController {
    @Autowired
    private BooksService booksService;

    @PostMapping("/save")
    public Book saveBook(@RequestBody Book book){
        return booksService.saveBook(book);
    }

    @GetMapping("/find/{bookId}")
    public Book findBook(@PathVariable int bookId) throws BookDoesNotExistException {
        return booksService.fetchBookDetails(bookId);
    }
    @GetMapping("/findAll")
    public List<Book> findBooks(){
        return booksService.fetchBookList();
    }
    @DeleteMapping("/remove/{bookId}")
    public String removeBook(@PathVariable int bookId) {
        return booksService.removeBook(bookId);
    }
    @PutMapping("/update/{bookId}")
    public Book updateBook(@RequestBody Book book,@PathVariable int bookId){
        return booksService.updateBook(book,bookId);
    }

}
