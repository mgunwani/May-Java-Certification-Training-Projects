<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
</head>
<body>
	
	<div class="container">
	<br/><br/>
	<h2>Index Page</h2>
	<br/>
	<a class="btn btn-success" href="<%=request.getContextPath()%>/newEmployee">Add New Employee</a>
	<br/><br/>
	<table class="table">
		<thead>
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee Salary</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${employees}">
				<tr>
					<td><c:out value="${emp.id}" /></td>
					<td><c:out value="${emp.name}" /></td>
					<td><c:out value="${emp.salary}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
	</div>
	
	
	
	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>
</body>
</html>