package com.springbook.biz.member.impl;

import java.util.List;

import com.springbook.biz.member.MemberService;
import com.springbook.biz.member.MemberVO;

public class MemberServiceImpl implements MemberService{
	
	MemberDAO dao;
	
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	@Override
	public void insertMember(MemberVO vo) {
		dao.insertMember(vo);
		
	}

	@Override
	public void updateMember(MemberVO vo) {
		dao.updateMember(vo);
		
	}

	@Override
	public void deleteMember(MemberVO vo) {
		dao.deleteMember(vo);
		
	}

	public MemberVO getMember(String id) {
		
		return dao.getMember(id);
	}

	@Override
	public List<MemberVO> getMemberList() {
		
		return dao.getMemberList();
	}
	
	
	
	
}
