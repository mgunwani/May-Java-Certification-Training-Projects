<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hey ${student.name} , you are successfully registered.
	<br> You have chosen the below courses:
	<br>
	<c:forEach var="course" items="${student.courses}">
		<c:out value="${course}" />
		<br>
	</c:forEach>
	<br> You have chosen the below batches:
	<br>
	<c:forEach var="batch" items="${student.batches}">
		<c:out value="${batch}" />
		<br>
	</c:forEach>
	<br> Your hidden name is ${student.hiddenMsg}
</body>
</html>