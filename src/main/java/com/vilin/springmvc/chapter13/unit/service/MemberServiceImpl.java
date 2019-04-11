package com.vilin.springmvc.chapter13.unit.service;

import com.vilin.springmvc.chapter13.unit.dao.MemberDAO;
import com.vilin.springmvc.chapter13.unit.model.Member;

import java.util.List;

public class MemberServiceImpl implements MemberService {

    private MemberDAO memberDAO;

    public void setMemberDAO(MemberDAO memberDAOArg) {
        this.memberDAO = memberDAOArg;
    }

    @Override
    public void add(Member member) {
        memberDAO.add(member);
    }

    @Override
    public List<Member> getMembers() {
        return memberDAO.getMembers();
    }

}