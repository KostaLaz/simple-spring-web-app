<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<c:forEach var="row" items="${offers}">
    Id ${row.id}<br />
    Name ${row.name}<br />
    Email ${row.email}<br />
    Text ${row.text}<br />
   
	</c:forEach>


</body>
</html>