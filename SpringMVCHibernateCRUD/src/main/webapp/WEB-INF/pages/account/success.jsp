<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Success Page</h3>
	Welcome ${sessionScope.username}

	<a href="${pageContext.request.contextPath}/account/logout">Logout</a>
</body>
</html>