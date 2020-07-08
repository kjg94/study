package com.springbook.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

public class GetBoardListController implements Controller {
	@Autowired
	BoardService boardService;
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 목록 보기");
		
		List<BoardVO> boardlist = boardService.getBoardList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("boardList",boardlist);
		modelAndView.setViewName("getBoardList"); // /WEB-INF/board/getBoardList.jsp
		return modelAndView;
	}

}
