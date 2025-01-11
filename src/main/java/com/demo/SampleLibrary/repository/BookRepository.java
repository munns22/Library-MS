package com.demo.SampleLibrary.repository;

import com.demo.SampleLibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findByBookIdIn(List<Integer> bookIds);
}
