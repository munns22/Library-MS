package com.demo.SampleLibrary.repository;

import com.demo.SampleLibrary.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {
}
