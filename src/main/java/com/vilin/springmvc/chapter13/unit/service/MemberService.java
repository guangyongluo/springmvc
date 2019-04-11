package com.vilin.springmvc.chapter13.unit.service;


import com.vilin.springmvc.chapter13.unit.model.Member;

import java.util.List;

public interface MemberService {
    public void add(Member member);

    public List<Member> getMembers();

}