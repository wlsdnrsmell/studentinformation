package com.oopsw.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;


public interface Action {
	//ControllerServlet.java에서 예외를 던저 준다.
	/**리턴티입 : 페이지 정보
	 * 입력타입 : request
	 * 무슨 request인지 알아보기 위해서 플레그 체크*/
	//메서드 이름은 역활이 중요하다.
	String request(HttpServletRequest request) throws ServletException, IOException;
}
