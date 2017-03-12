<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spittr</title>
</head>
<body>
	<h1>Register</h1>
	<sf:form method="POST" modelAttribute="spitter">
		First Name: <sf:input path="firstName"/><br/>
		Last Name: <sf:input path="lastName"/><br/>
		Email: <sf:input path="email"/><br/>
		Username: <sf:input path="username"/><br/>
		Password: <sf:password path="password"/><br/>
		<input type="submit" value="Register" />
	</sf:form>
</body>
</html>