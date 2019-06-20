package com.naresh;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController {

	public static void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Login" );
		response.getWriter().append("UserController-login");
	}
	
	public static void register(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("register");
		response.getWriter().append("UserController-register");
	}

	public static void search(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
}
