<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.List, com.empmanagement.entity.Employee,com.empmanagement.controller.DisplayEmployeeServlet"%>
<!DOCTYPE html>
<html>
<head>
<title>Employee List</title>
<link rel="stylesheet" href="styles.css">
<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	border: 1px solid #ddd;
	padding: 8px;
	text-align: left;
}

th {
	background-color: #f2f2f2;
}

tr:hover {
	background-color: #f5f5f5;
}
</style>
</head>
<body>
	<h2>Employee List</h2>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Age</th>
			<th>Email</th>
			<th>Salary</th>
		</tr>
		<%
		@SuppressWarnings("unchecked")
		List<Employee> employees = (List<Employee>) request.getAttribute("employees");

		// Check if employees list is not null or empty
		if (employees != null && !employees.isEmpty()) {
			for (Employee employee : employees) {
		%>
		<tr>
			<td><%=employee.getId()%></td>
			<td><%=employee.getName()%></td>
			<td><%=employee.getAge()%></td>
			<td><%=employee.getEmail()%></td>
			<td><%=employee.getSalary()%></td>
			<td><a href="update.jsp?id=<%=employee.getId()%>">Edit</a></td>
			<td><a href="delete.jsp?id=<%=employee.getId()%>">Delete</a></td>

		</tr>
		<%
		}
		} else {
		%>
		<tr>
			<td colspan="5">No employees found.</td>
		</tr>
		<%
		}
		%>
	</table>
	<br>
	<a href="welcome.jsp">Back</a>
</body>
</html>