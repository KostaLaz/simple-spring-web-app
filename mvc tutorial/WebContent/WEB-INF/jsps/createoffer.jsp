<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

.form {
width 400px;
padding: 10px;
border: 1px solid blue;
}

input[type=text]{
width: 200px;
}

textarea {
	width: 200px;
	height: 250px;
}

.label {
text-align: right;
vertical-align: top;
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form method="post" action="${pageContext.request.contextPath }/docreate">

<table class="form">

<tr><td class="label">Name:</td><td><input name="name" type="text"/></td></tr>
<tr><td class="label">Email:</td><td><input name="email" type="text"/></td></tr>
<tr><td class="label">Your offer:</td><td><textarea name="text" rows="10" cols="10"></textarea></td></tr>
<tr><td></td><td><input value="Create advert" type="submit"/></td></tr>

</table>

</form>



</body>
</html>