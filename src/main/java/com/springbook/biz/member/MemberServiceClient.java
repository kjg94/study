package com.springbook.biz.member;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class MemberServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		MemberService memberService = ctx.getBean("memberService",MemberService.class);
		
		MemberVO vo = new MemberVO("k강j강","k강j강g","강강준강구","ceo");
		memberService.insertMember(vo);
		
		List<MemberVO> memList = memberService.getMemberList();
		for(MemberVO memVO : memList) {
			System.out.println(memVO);
		}
	}

}
