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
		//1. �Է� ���� ���� DBMS �Է�
		//2. ��� ���������� �Խù� ����Ʈ
		return "member.jsp";
	}

}
