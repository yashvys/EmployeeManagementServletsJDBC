<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Register Employee</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<h2>Register Employee</h2>
	<form action="addEmployee" method="post">
		<input type="text" name="id" placeholder="Employee ID" required /> <input
			type="text" name="name" placeholder="Employee Name" required /> <input
			type="number" name="age" placeholder="Age" required /> <input
			type="email" name="email" placeholder="Email" required /> <input
			type="number" name="salary" placeholder="Salary" required />
		<button type="submit">Add Employee</button>
	</form>

	<a href="welcome.jsp">Back</a>
</body>
</html>
