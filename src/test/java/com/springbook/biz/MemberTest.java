package com.springbook.biz;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springbook.biz.member.MemberService;
import com.springbook.biz.member.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext")
public class MemberTest {
	@Autowired
	MemberService memberService;
	
	MemberVO mem1, mem2, mem3;
	@Before
	public void init() {
		mem1 = new MemberVO();
		mem2 = new MemberVO();
		mem3 = new MemberVO();
	}
	
}
