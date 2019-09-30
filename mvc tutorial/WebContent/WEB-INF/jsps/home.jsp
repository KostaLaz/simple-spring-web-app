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
	Hallo Request(using EL): ${name}
	</p>
	<c:out value="${name}"></c:out>

	<sql:query var="rs" dataSource="jdbc/spring">
select id, name, email, text from offers
</sql:query>

	<c:forEach var="row" items="${rs.rows}">
    Id ${row.id}<br />
    Name ${row.name}<br />
	</c:forEach>


</body>
</html>