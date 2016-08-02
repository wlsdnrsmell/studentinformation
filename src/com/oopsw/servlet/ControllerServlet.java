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
		//1. request �� ���޹޾� ó��
			String cmd= request.getParameter("cmd");
			System.out.println(cmd);
			Action a = null;		//����
		//jdk 1.7���� ���� switch���� string ��� ����
		//���� �þ�� switch���� �ø��� �ȴ�.
		//login, insert ������ Action ���
			//switch ==> Factory ����
			switch (cmd){
			case "login":
				a = new LoginAction();	//����
				break;
			case "studentInsert":
				a = new InsertAction();
				break;
			case "logout":
				a = new LogoutAction();
				break;
			
			}
			String page = a.request(request);  //�ʱ�ȭ
			//2. ����������� �������� ����
			response.sendRedirect(page);
		
		
		
	}
}
