<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
 <link href="${pageContext.request.contextPath }/resources/css/main.css" rel="stylesheet" type="text/css"/>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table class="formtable">
	<tr><td>Username</td><td>Email</td><td>Authority</td><td>Enabled</td></tr>

    <c:forEach var="user" items="${users}">
    
    	<tr><td><c:out value="${user.username }"></c:out></td></tr>
    	<tr><td><c:out value="${user.email }"></c:out></td></tr>
    	<tr><td><c:out value="${user.authority }"></c:out></td></tr>
    	<tr><td><c:out value="${user.enabled }"></c:out></td></tr>
    
    </c:forEach>

	</table>
</body>
</html>