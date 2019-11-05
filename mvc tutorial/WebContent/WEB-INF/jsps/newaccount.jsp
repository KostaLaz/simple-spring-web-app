<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
 <link href="${pageContext.request.contextPath }/resources/css/main.css" rel="stylesheet" type="text/css"/>
<title>Create new account</title>
</head>
<body>
<div class="formtable">
<form:form method="post" action="${pageContext.request.contextPath }/createaccount" modelAttribute="user">

<table class="formtable">

<tr><td class="label">Userame:</td><td><form:input path="username" name="username" type="text"/><br/><div cssClass="error"><form:errors path="username"> </form:errors></div></td></tr>
<tr><td class="label">Email:</td><td><form:input path="email" name="email" type="text"/><br/><div cssClass="error"></div><form:errors path="email"></div></form:errors></td></tr>
<tr><td class="label">Password:</td><td><form:input path="password" name="password" type="text"/><br/><div cssClass="error"><form:errors path="password"></form:errors></div></td></tr>
<tr><td class="label">Confirm password:</td><td><input name="confirmpassword" type="text"/><br/></td></tr>
<tr><td></td><td><input class="btn btn-lg btn-primary btn-block" value="Create accaunt" type="submit"/></td></tr>

</table>

</form:form>
</div>
</body>
</html>