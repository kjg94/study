package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

public class DeleteBoardController implements Controller {
	@Autowired
	BoardService boardService;
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 삭제");
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(request.getParameter("seq")));
	
		boardService.deleteBoard(vo);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:getBoardList.do");
		return modelAndView;
	}

}
