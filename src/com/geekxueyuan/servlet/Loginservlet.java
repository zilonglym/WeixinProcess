package com.geekxueyuan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Loginservlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=================����DoGet����=================");
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=================����DoPost����=================");
		String userName = req.getParameter("uname");
		String password = req.getParameter("upwd");
		
		System.out.println("�û���  ==> "+userName);
		System.out.println("����  ====>"+password);
		String forward = null;
		
		if (userName.equalsIgnoreCase("lzhao") && password.equals("lym")) {
			//����ת��
			forward = "/14/success.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, resp);
			
			//�����ض���
			//resp.sendRedirect(req.getContextPath()+"/14/success.jsp");
		}else{
			//����ת��
			forward = "/14/error.jsp";
			//����ĵ���������װ��ת���Ĳ������������Կͻ��˵�����Ȼ����ת����ָ������Դ��ȥ
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, resp);
			
			//resp.sendRedirect(req.getContextPath()+"/14/error.jsp");
		}
	}

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String userName = req.getParameter("uname");
//		String password = req.getParameter("upwd");
//		
//		System.out.println("�û���  ==> "+userName);
//		System.out.println("����  ====>"+password);
//		
//	}

}
