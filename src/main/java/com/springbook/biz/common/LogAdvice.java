package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
	
	@Pointcut
	("execution(public * com.springbook.biz..*Impl.*(..) )")
	public void allPointcut() {}
	
	@Pointcut
	("execution(public * com.springbook.biz..*Impl.get*(..) )")
	public void getPointcut() {}
	
	
	// 실제 적용될 내용(어드바이스)
	@Before/*앞쪽에 아래 내용을 삽입시키겠다.*/("allPointcut()"/*포인트컷으로 설정한 메서드를 대상으로 */)
	public void printLog() {
		System.out.println("[공통로그] 비지니스 로직 수행 전 동작 ");
	}
	@After("getPointcut()")
	public void printResult(JoinPoint jp) {
		String messageInfo = jp.getSignature().toShortString();
		System.out.println(messageInfo + "가 정상적으로 처리되었습니다.");
	}
	
	
}
