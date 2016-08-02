package com.oopsw.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.oopsw.model.Student;

public class InsertAction implements Action {

	@Override
	public String request(HttpServletRequest request) throws ServletException, IOException {
		Student stu = new Student(request.getParameter("studentNumber"),request.getParameter("password"),request.getParameter("phoneNumber"));
		//System.out.println(stu);
		//1. 입력 받은 내용 DBMS 입력
		//2. 목록 페이지에서 게시물 리스트
		return "member.jsp";
	}

}
