package com.oopsw.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;


public interface Action {
	//ControllerServlet.java���� ���ܸ� ���� �ش�.
	/**����Ƽ�� : ������ ����
	 * �Է�Ÿ�� : request
	 * ���� request���� �˾ƺ��� ���ؼ� �÷��� üũ*/
	//�޼��� �̸��� ��Ȱ�� �߿��ϴ�.
	String request(HttpServletRequest request) throws ServletException, IOException;
}
