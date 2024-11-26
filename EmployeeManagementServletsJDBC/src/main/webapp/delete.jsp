<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Delete Employee</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<h2>Confirm Delete</h2>
	<form action="deleteEmployee" method="post">
		<p>
			Are you sure you want to delete the employee with ID: <b><%=request.getParameter("id")%></b>?
		</p>
		<input type="hidden" name="id"
			value="<%=request.getParameter("id")%>">
		<button type="submit">Yes, Delete</button>
		<a href="display.jsp">Cancel</a>
	</form>
</body>
</html>
