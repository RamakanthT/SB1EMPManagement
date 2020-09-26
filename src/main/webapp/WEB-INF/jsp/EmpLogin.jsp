<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="container">
		<h2>Login page</h2>
		<form:form action="/main/empLogin" method="post" modelAttribute="empLoginTo">
			<label for="username">Username</label> 
			<form:input type="text" id="username" name="username" path="username" autofocus="autofocus" /> 
			<label for="password">Password</label> 
			<form:input type="password" id="password" name="password" path="password" /> 
			<form:button id="submit" type="submit" value="Login" name="submit" >Login</form:button>
		</form:form>
	</div>
</body>
</html>

