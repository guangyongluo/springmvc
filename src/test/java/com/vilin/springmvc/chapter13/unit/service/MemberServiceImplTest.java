package com.vilin.springmvc.chapter13.unit.service;

import com.vilin.springmvc.chapter13.unit.dao.MemberDAO;
import com.vilin.springmvc.chapter13.unit.fake.MemberDAOFake;
import com.vilin.springmvc.chapter13.unit.model.Member;
import org.junit.Assert;
import org.junit.Test;

public class MemberServiceImplTest {

    @Test
    public void testAddMember() {
        MemberDAO memberDAO = new MemberDAOFake();
        memberDAO.add(new Member(1, "John Diet"));
        memberDAO.add(new Member(2, "Jane Biteman"));
        Assert.assertEquals(2, memberDAO.getMembers().size());
    }
}
