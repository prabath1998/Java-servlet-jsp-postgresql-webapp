package com.infoseek.model;

public class Student {
	private String firstName;
	private String lastName;
	private String age;
	private String username;
	private String password;
	private String education;
	private String maritalStatus;
	private String higherEducation;
	
	public Student() {}
	
	public Student(String firstName, String lastName, String age, String username, String password, String education,
			String maritalStatus, String higherEducation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.username = username;
		this.password = password;
		this.education = education;
		this.maritalStatus = maritalStatus;
		this.higherEducation = higherEducation;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getHigherEducation() {
		return higherEducation;
	}
	public void setHigherEducation(String higherEducation) {
		this.higherEducation = higherEducation;
	}
	
	
}
