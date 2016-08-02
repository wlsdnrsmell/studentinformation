package com.oopsw.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class LogoutAction implements Action {

	@Override
	public String request(HttpServletRequest request) throws ServletException, IOException {
		
		return "index.html";
	}

}
