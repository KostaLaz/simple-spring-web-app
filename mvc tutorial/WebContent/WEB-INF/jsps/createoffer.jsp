<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form method="post" action="${pageContext.request.contextPath }/docreate">

<table>

<tr><td>Name:</td><td><input name="name" type="text"/></td></tr>
<tr><td>Email:</td><td><input name="email" type="text"/></td></tr>
<tr><td>Your offer:</td><td><textarea name="text" rows="10" cols="10"></textarea></td></tr>
<tr><td></td><td><input value="Create advert" type="submit"/></td></tr>

</table>

</form>



</body>
</html>