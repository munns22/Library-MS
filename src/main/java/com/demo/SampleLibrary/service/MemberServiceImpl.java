package com.demo.SampleLibrary.service;

import com.demo.SampleLibrary.entity.Book;
import com.demo.SampleLibrary.entity.Member;
import com.demo.SampleLibrary.error.InvalidMembershipException;
import com.demo.SampleLibrary.repository.BookRepository;
import com.demo.SampleLibrary.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Member setMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public List<Book> issueBook(List<Integer> bookIds, int memberId) throws InvalidMembershipException {
        Member member =memberRepository.findById(memberId).get();
        List<Book>books =bookRepository.findByBookIdIn(bookIds);
        if(member.isMembershipStatus()) {
            member.setBooks(books);
            memberRepository.save(member);
            return books;
        }else{
            throw new InvalidMembershipException("Membership is Deactive");
        }
    }
}
