<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p><a href="${pageContext.request.contextPath }/offers">Show current offers</a></p>
<p><a href="${pageContext.request.contextPath }/createoffer">Create new offer</a></p>
<p><a href="${pageContext.request.contextPath }/newaccount">Create new account</a></p>



<sec:authorize access="isAuthenticated()">
<p><a href="${pageContext.request.contextPath }/login">Log in</a></p>
</sec:authorize>


<sec:authorize access="hasRole(admin)">
<p><a href="${pageContext.request.contextPath }/admin">Admin</a></p>
</sec:authorize>

<sec:authorize access="isAuthenticated()">
<p><a href="${pageContext.request.contextPath }/logout">Log out</a></p>
</sec:authorize>



</body>
</html>