package com.infoseek.servlets;

import jakarta.servlet.RequestDispatcher;



import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.infoseek.dao.StudentDao;
import com.infoseek.model.Student;

//@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentDao studentDao = new StudentDao();

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Do get..!");
		RequestDispatcher dispatcher = request.getRequestDispatcher("studentdetails.html");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Do Post..!");
//		doGet(request, response);
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String age = request.getParameter("age");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		String education = request.getParameter("education");
		String maritalStatus = request.getParameter("marital");
		String higherEducation = request.getParameter("qualification");
		
		Student student = new Student();
		student.setFirstName(fname);
		student.setLastName(lname);
		student.setAge(age);
		student.setUsername(uname);
		student.setPassword(password);
		student.setEducation(education);
		student.setMaritalStatus(maritalStatus);
		student.setHigherEducation(higherEducation);
		
		try {
			studentDao.registerStudent(student);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
		dispatcher.forward(request, response);
		
	}

}
