package com.demo.SampleLibrary.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Book_Details")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    @NonNull
    private String bookTitle;
    private String bookAuthor;
    private int bookPage;
    @Column(name = "category")
    private String bookGenre;

    public int getBookId() {
        return bookId;
    }

    public @NonNull String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookPage() {
        return bookPage;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookTitle(@NonNull String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public Book() {
    }

    public Book(int bookId, @NonNull String bookTitle, String bookAuthor, int bookPage, String bookGenre) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPage = bookPage;
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPage=" + bookPage +
                ", bookGenre='" + bookGenre + '\'' +
                '}';
    }
}
