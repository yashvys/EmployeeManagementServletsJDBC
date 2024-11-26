<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Welcome</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<h1>Welcome to the Employee Management System</h1>
	<button onclick="location.href='register.jsp'">Add Employee</button>
	<form action="displayEmployees">
		<button>Display Employee Data</button>
	</form>
</body>
</html>