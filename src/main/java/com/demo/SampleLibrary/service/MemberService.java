package com.demo.SampleLibrary.service;

import com.demo.SampleLibrary.entity.Book;
import com.demo.SampleLibrary.entity.Member;

import java.util.List;

public interface MemberService {

    Member setMember(Member member);

    List<Book> issueBook(List<Integer> bookIds, int memberId);
}
