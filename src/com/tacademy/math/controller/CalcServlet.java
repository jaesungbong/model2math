package com.tacademy.math.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.tacademy.math.common.Calc;
import com.tacademy.math.vo.Data;

public class CalcServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String su1 = request.getParameter("num1");
		String su2 = request.getParameter("num2");
		String opt = request.getParameter("opt");
		
		Data data = new Data();
		data.setNum1(Integer.parseInt(su1));
		data.setNum2(Integer.parseInt(su2));
		data.setOpt(opt);
		
		Calc calc = new Calc();
		calc.doCalc(data);
		
		Gson gson = new Gson();
		String result = gson.toJson(data);
		
		request.setAttribute("result", result);  //모바일용
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/result1.jsp");
		
//		request.setAttribute("data", data);  웹용
//		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/result.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
