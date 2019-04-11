package com.vilin.springmvc.chapter13.unit.fake;
import com.vilin.springmvc.chapter13.unit.dao.MemberDAO;
import com.vilin.springmvc.chapter13.unit.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOFake implements MemberDAO {
    private List<Member> members = new ArrayList<>();
        
    @Override
    public void add(Member member) {
        members.add(member);
    }

    @Override
    public List<Member> getMembers() {
        return members;
    }
}