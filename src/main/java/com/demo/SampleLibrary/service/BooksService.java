package com.demo.SampleLibrary.service;

import com.demo.SampleLibrary.entity.Book;

import java.util.List;

public interface BooksService {
    Book saveBook(Book book);

    Book fetchBookDetails(int bookId);

    List<Book> fetchBookList();

    String removeBook(int bookId);

    Book updateBook(Book book,int id);
}
