package com.vilin.springmvc.chapter13.unit.dao;

import com.vilin.springmvc.chapter13.unit.model.Member;

import java.util.List;

public interface MemberDAO {
    void add(Member member);
    List<Member> getMembers();
}
