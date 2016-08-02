package com.oopsw.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.oopsw.model.Teacher;

public class LoginAction implements Action {

	@Override
	public String request(HttpServletRequest request) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//Teacher t = new Teacher(request.getParameter("id"),request.getParameter("pw"));
		//System.out.println(id + " - "+ pw);
		//DBMS select
		String page = "login.html";
		if(id.equals("jin")& pw.equals("1234")){
			//메모리에 로그인 상태를 관리하는 옵션 추가
			
			page = "member.jsp";
		}
		return page;
	}

}
