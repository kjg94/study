package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectAroundExam {
	public Object aroundTest(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("앞쪽에(동그라미모양) 들어갈 내용이 여기에 들어감.");
		long startTime = System.currentTimeMillis();
		Object rtnObj = pjp.proceed();
		System.out.println("뒤쪽에(별모양) 들어갈 내용이 여기에 들어감.");
		System.out.println("이 메서드가 동작하는데 걸리는 시간은 :" + (System.currentTimeMillis()-startTime) + "ms");
		return rtnObj;
	}
}
