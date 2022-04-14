<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#stud {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#stud td, #stud th {
  border: 1px solid #ddd;
  padding: 8px;
}

#stud tr:nth-child(even){background-color: #f2f2f2;}

#stud tr:hover {background-color: #ddd;}

#stud th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #ff6347;
  color: white;
}
</style>
</head>
<body>
	<div align="center">
	<h1>Student Registered Successfully..!</h1>
	<table id="stud">
		<tr>
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Age</th>
		<th>User Name</th>
		<th>Password</th>
		<th>Education</th>
		<th>Marital Status</th>
		<th>Higher Education</th>
		</tr>
		
		
		
		<%
		
		try{
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/infoseek","postgres","root");
			String selectSQL = "SELECT * FROM student";
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(selectSQL);
			while(rs.next()){
				%>
					<tr>
					<td><%=rs.getString("id") %></td>
					<td><%=rs.getString("firstname") %></td>
					<td><%=rs.getString("lastname") %></td>
					<td><%=rs.getString("age") %></td>
					<td><%=rs.getString("username") %></td>
					<td><%=rs.getString("password") %></td>
					<td><%=rs.getString("education") %></td>
					<td><%=rs.getString("marital_status") %></td>
					<td><%=rs.getString("higher_education") %></td>
					</tr>
				<%
			}
		}catch(Exception ex){
			out.println(ex.getMessage());
			ex.printStackTrace();
		}
		%>
		
	</table>
	
	</div>
</body>
</html>