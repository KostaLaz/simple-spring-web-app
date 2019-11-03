<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<title>Login Page</title>

<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css" />


</head>
<body>
	
	<form:form modelAtribute="user1" method="post">
	
	<form:input path="username" type="text"/>
	<form:input path="password" type="password"/>
	<input type="submit" value="Submit"/>
	
	
	</form:form>
	
	
	
</body>
</html>
