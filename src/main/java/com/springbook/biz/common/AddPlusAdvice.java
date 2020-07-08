package com.springbook.biz.common;

import org.springframework.stereotype.Component;

@Component("addPlusAdvice")
public class AddPlusAdvice {
	public void addPlus() {
		System.out.println("이 내용은 추가로 메서드 실행전에 나타납니다.");
	}
}
