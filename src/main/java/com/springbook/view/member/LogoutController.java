package com.springbook.view.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LogoutController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("로그아웃");
		HttpSession session = request.getSession();
		session.invalidate();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:login.jsp");
		return modelAndView;
	}

}
