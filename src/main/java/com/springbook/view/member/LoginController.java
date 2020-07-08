package com.springbook.view.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.member.MemberService;
import com.springbook.biz.member.MemberVO;

public class LoginController implements org.springframework.web.servlet.mvc.Controller {
	@Autowired
	MemberService memberService;
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("로그인 처리");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		
		MemberVO member = memberService.getMember(id);
		
		ModelAndView modelAndView = new ModelAndView();
		
		if(member != null &&  member.getPassword().equals(password) ){
			modelAndView.setViewName("redirect:getBoardList.do");
			//추후에 이곳에 세션을 생성시키거나, 쿠키를 이용해서 연결상태를 유지시키는 방법을 구현.
		}else {
			modelAndView.setViewName("redirect:login.jsp");
		}
		return modelAndView;
	}

}
