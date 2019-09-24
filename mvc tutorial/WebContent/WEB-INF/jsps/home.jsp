<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hallo World

Session: <%= session.getAttribute("name") %> </p>
Request: <%= request.getAttribute("name") %> </p>
Request(using EL): ${name} </p>

</body>
</html>