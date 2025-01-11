package com.demo.SampleLibrary.controller;

import com.demo.SampleLibrary.entity.Book;
import com.demo.SampleLibrary.entity.Member;
import com.demo.SampleLibrary.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/saveMember")
    public Member setMember(@RequestBody Member member){
        return memberService.setMember(member);
    }

    @PutMapping("/issueBook/{memberId}")
    public List<Book>  issueBookToMember(@RequestBody List<Integer> bookIds, @PathVariable int memberId){
        return memberService.issueBook(bookIds, memberId);
    }



}
