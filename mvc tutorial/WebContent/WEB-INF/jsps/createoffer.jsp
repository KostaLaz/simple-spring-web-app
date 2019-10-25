<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
 <link href="${pageContext.request.contextPath }/resources/css/main.css" rel="stylesheet" type="text/css"/>
<title>Insert title here</title>
</head>
<body>
<div class="formtable">
<form:form method="post" action="${pageContext.request.contextPath }/docreate" modelAttribute="offer">

<table class="formtable">

<tr><td class="label">Name:</td><td><form:input path="name" name="name" type="text"/><br/><form:errors path="name" cssClass="error"></form:errors></td></tr>
<tr><td class="label">Email:</td><td><form:input path="email" name="email" type="text"/><br/><form:errors path="email" cssClass="error"></form:errors></td></tr>
<tr><td class="label">Your offer:</td><td><form:textarea path="text" name="text" rows="10" cols="10"></form:textarea><br/><form:errors path="text" cssClass="error"></form:errors></td></tr>
<tr><td></td><td><input class="btn btn-lg btn-primary btn-block" value="Create advert" type="submit"/></td></tr>

</table>

</form:form>
</div>
</body>
</html>