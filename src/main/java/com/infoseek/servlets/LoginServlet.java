package com.infoseek.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.infoseek.dao.StudentDao;
import com.infoseek.model.Student;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username =  request.getParameter("username");
		String password =  request.getParameter("password");
		
		Student student = new Student();
		student.setUsername(username);
		student.setPassword(password);
		
		StudentDao studentDao = new StudentDao();
		if (studentDao.validate(student)) {
			response.sendRedirect("students.jsp");
		}else {
			response.sendRedirect("index.html");
			
		}  
	}

}
