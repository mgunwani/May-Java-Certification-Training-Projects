<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">

		<h2>Add New Employee</h2>

		<form action="<%=request.getContextPath()%>/insertEmployee">

			<div class="form-group">
				<label for="id">Employee Id</label> <input type="text" name="id" class="form-control" />
			</div>
			<br/>
			<div class="form-group">
				<label for="id">Employee Name</label> <input type="text" name="name" class="form-control" />
			</div>
			<br/>
			<div class="form-group">
				<label for="id">Employee Salary</label> <input type="text" name="salary" class="form-control" />
			</div>
			<br/>
			<input type="Submit" value="Add" class="btn btn-secondary" />

		</form>


	</div>

	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>

</body>
</html>