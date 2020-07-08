package com.springbook.biz.member;

import java.util.List;


public interface MemberService {
	public void insertMember(MemberVO vo); // 글 등록
	public void updateMember(MemberVO vo); // 글 수정
	public void deleteMember(MemberVO vo); // 글 삭제
	public MemberVO getMember(String id);    // 글 상세 조회
	public List<MemberVO> getMemberList(); // 글 목록 조회
}
