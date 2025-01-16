package com.demo.SampleLibrary.service;

import com.demo.SampleLibrary.entity.Book;
import com.demo.SampleLibrary.repository.BookRepository;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class BooksServiceImplTest {
    @Mock
    private BooksService booksService;
    @Mock
    private BookRepository bookRepository;
//    @Override
//    public Book fetchBookDetails(int bookId) {
//        logger.info("Reached in Service");
//        Optional<Book> fetchedBook=bookRepository.findById(bookId);
//        return fetchedBook.get();
//    }
    public List<Book> getBookDetail(){
        List<Book> bookList= new ArrayList<>();
        Book book=new Book();
        book.setBookId(1);
        book.setBookTitle("The Maze Runner");
        book.setBookPage(850);
        book.setBookGenre("Fiction");
        book.setBookAuthor("Suzane Collins");
        bookList.add(book);
        return bookList;
    }
    @Test
    public void fetchBookDetailsTest(){
        when(bookRepository.findAll()).thenReturn(getBookDetail());
        List<Book> book = booksService.fetchBookList();
        assertNotNull(book);

    }

}