package com.demo.SampleLibrary.service;

import com.demo.SampleLibrary.entity.Book;
import com.demo.SampleLibrary.entity.Member;
import com.demo.SampleLibrary.error.InvalidMembershipException;

import java.util.List;

public interface MemberService {

    Member setMember(Member member);

    List<Book> issueBook(List<Integer> bookIds, int memberId) throws InvalidMembershipException;
}
