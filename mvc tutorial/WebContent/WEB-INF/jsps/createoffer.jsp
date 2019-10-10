<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="post" action="${pageContext.request.contextPath }/docreate" modelAttribute="offer">

<table class="formtable">

<tr><td class="label">Name:</td><td><form:input path="name" name="name" type="text"/></td></tr>
<tr><td class="label">Email:</td><td><form:input path="email" name="email" type="text"/></td></tr>
<tr><td class="label">Your offer:</td><td><form:textarea path="text" name="text" rows="10" cols="10"></form:textarea></td></tr>
<tr><td></td><td><input value="Create advert" type="submit"/></td></tr>

</table>

</form:form>

</body>
</html>