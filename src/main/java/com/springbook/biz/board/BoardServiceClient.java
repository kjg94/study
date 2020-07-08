package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		BoardService boardService = ctx.getBean("boardService",BoardService.class);
		
		BoardVO vo = new BoardVO(1,"test","홍길동","잘되나....");
		boardService.insertBoard(vo);
		System.out.println("==========자료 입력후 =========");
		List<BoardVO> rtn = boardService.getBoardList();
		for(BoardVO board: rtn) {
			System.out.println(board.toString());
		}
	}

}
