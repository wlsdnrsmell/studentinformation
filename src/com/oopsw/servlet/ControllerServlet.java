package com.oopsw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/controller")
public class ControllerServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. request 를 전달받아 처리
			String cmd= request.getParameter("cmd");
			System.out.println(cmd);
			Action a = null;		//선언
		//jdk 1.7버전 부터 switch에서 string 사용 가능
		//업무 늘어나면 switch문만 늘리면 된다.
		//login, insert 공통점 Action 상속
			//switch ==> Factory 패턴
			switch (cmd){
			case "login":
				a = new LoginAction();	//생성
				break;
			case "studentInsert":
				a = new InsertAction();
				break;
			case "logout":
				a = new LogoutAction();
				break;
			
			}
			String page = a.request(request);  //초기화
			//2. 결과페이지를 브라우저에 전달
			response.sendRedirect(page);
		
		
		
	}
}
