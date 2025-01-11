package com.demo.SampleLibrary.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "Library_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int memberId;
   private String memberName;
   private long memberContact;
   private boolean membershipStatus;
   @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn(name = "member_id",referencedColumnName = "memberId")
   private List<Book> books;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public long getMemberContact() {
        return memberContact;
    }

    public void setMemberContact(long memberContact) {
        this.memberContact = memberContact;
    }

    public boolean isMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(boolean membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Member(int memberId, String memberName, long memberContact, boolean membershipStatus, List<Book> books) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberContact = memberContact;
        this.membershipStatus = membershipStatus;
        this.books = books;
    }

    public Member() {
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", memberContact=" + memberContact +
                ", membershipStatus=" + membershipStatus +
                ", books=" + books +
                '}';
    }
}
