package com.demo.SampleLibrary.service;

import com.demo.SampleLibrary.entity.Book;
import com.demo.SampleLibrary.error.BookDoesNotExistException;
import com.demo.SampleLibrary.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BookRepository bookRepository;
    private static final Logger logger = LoggerFactory.getLogger(BooksServiceImpl.class);
    @Override
    public Book saveBook(Book book) {
        logger.info("Recieved object to store", book);
        return bookRepository.save(book);
    }
    @Override
    public Book fetchBookDetails(int bookId) throws BookDoesNotExistException {
        logger.info("Reached in Service");
        Optional<Book> fetchedBook=bookRepository.findById(bookId);
        if(fetchedBook.isPresent())
        return fetchedBook.get();
        else
            throw new BookDoesNotExistException("Book doesn't exist");
    }

    @Override
    public List<Book> fetchBookList() {
        logger.info("Reached in Service");
        return bookRepository.findAll();

    }

    @Override
    public String removeBook(int bookId) {
        bookRepository.deleteById(bookId);
        logger.info("Removed book");
        return "Book removed <3";
    }

    @Override
    public Book updateBook(Book book,int id) {
        Optional<Book> fetchedBook=bookRepository.findById(id);
        Book bookDB=fetchedBook.get();
        if(Objects.nonNull(book.getBookTitle()) && !"".equalsIgnoreCase(book.getBookTitle()))
            bookDB.setBookTitle(book.getBookTitle());
        if(Objects.nonNull(book.getBookAuthor()) && !"".equalsIgnoreCase(book.getBookAuthor()))
            bookDB.setBookAuthor(book.getBookAuthor());
        if(Objects.nonNull(book.getBookGenre()) && !"".equalsIgnoreCase(book.getBookGenre()))
            bookDB.setBookGenre(book.getBookGenre());
        if(Objects.nonNull(book.getBookPage()) && 0!=book.getBookPage())
            bookDB.setBookPage(book.getBookPage());

        return bookRepository.save(bookDB) ;
    }
}
