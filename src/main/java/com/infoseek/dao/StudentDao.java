package com.infoseek.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.infoseek.model.Student;
import com.infoseek.util.JDBCUtil;



public class StudentDao {
	public int registerStudent(Student student) throws SQLException{
		Connection connection = null;
		PreparedStatement preStat = null;
		
		String insertSQL = "INSERT INTO student(firstname,lastname,age,username,password,education,marital_status,higher_education)VALUES(?,?,?,?,?,?,?,?)";
		int result = 0;
		
		try {
			connection = JDBCUtil.getConnection();
			preStat = connection.prepareStatement(insertSQL);
			preStat.setString(1, student.getFirstName());
			preStat.setString(2, student.getLastName());
			preStat.setString(3, student.getAge());
			preStat.setString(4, student.getUsername());
			preStat.setString(5, student.getPassword());
			preStat.setString(6, student.getEducation());
			preStat.setString(7, student.getMaritalStatus());
			preStat.setString(8, student.getHigherEducation());
			System.out.println(preStat);
			
			result = preStat.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}
	
	public static List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		String selectSQL = "SELECT * FROM student";
		try {
			Connection connection = null;
			PreparedStatement preStat = null;
			ResultSet rs = null;
			
			preStat = connection.prepareStatement(selectSQL);
			System.out.println(preStat);
			
			rs = preStat.executeQuery();
			
			while(rs.next()) {
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastname");
				String age = rs.getString("age");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String education = rs.getString("education");
				String maritalStatus = rs.getString("marital_status");
				String higherEducation = rs.getString("higher_education");
				students.add(new Student(firstName,lastName,age,username,password,education,maritalStatus,higherEducation));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return students;
	}
	

}
