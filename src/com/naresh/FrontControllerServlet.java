package com.naresh;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllerServlet
 */
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		System.out.println("RequestURI:" + requestURI);
		
		String contextPath = request.getContextPath();
		System.out.println("ContextPath:" + contextPath);
		
		String path = requestURI.substring(contextPath.length());
		System.out.println("path:" + path);

		switch (path) {
		case "/search.do":
			System.out.println("LoginServlet");
			UserController.search(request, response);
			break;

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		System.out.println("RequestURI:" + requestURI);
		
		String contextPath = request.getContextPath();
		System.out.println("ContextPath:" + contextPath);
		
		String path = requestURI.substring(contextPath.length());
		System.out.println("path:" + path);

		switch (path) {
		case "/login.do":
			System.out.println("LoginServlet");
			UserController.login(request, response);

			break;
		case "/register.do":
			System.out.println("RegisterServlet");
			UserController.register(request, response);
			break;
		}
	}

}
