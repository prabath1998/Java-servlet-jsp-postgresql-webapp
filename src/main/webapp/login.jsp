<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./style.css">
</head>
<body>
	<div class="login-page">
  		<div class="form">    
		    <form class="login-form" method="post" action="login">
		      <input type="text" name="username" placeholder="username"/>
		      <input type="password" name="password" placeholder="password"/>
		      <button type="submit" value="Login">login</button>
		      <p class="message">Not registered? <a href="register.html">Create an account</a></p>
		    </form>
  		</div>
	</div>
</body>
</html>