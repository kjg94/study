package com.springbook.biz.board;

import java.util.List;

public interface BoardService {
	public void insertBoard(BoardVO vo); // 제품 등록
	public void updateBoard(BoardVO vo); // 제품 수정
	public void deleteBoard(BoardVO vo); // 제품 삭제
	public BoardVO getBoard(int seq);    // 제품 상세 조회
	public List<BoardVO> getBoardList(); // 제품 목록 조회
}
