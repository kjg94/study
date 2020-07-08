package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

public class GetBoardController implements Controller {
	@Autowired
	BoardService boardService;
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 상세 보기 ");
		
		
		int seq = Integer.parseInt(request.getParameter("seq"));
		BoardVO vo = boardService.getBoard(seq);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("vo",vo);
		modelAndView.setViewName("getBoard");
		return modelAndView;
	}

}
