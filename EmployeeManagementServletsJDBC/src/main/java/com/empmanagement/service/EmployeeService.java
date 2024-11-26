package com.empmanagement.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.empmanagement.controller.EmployeeServiceException;
import com.empmanagement.entity.Employee;

public class EmployeeService {
	public void addEmployee(Employee employee) throws EmployeeServiceException {
		String query = "INSERT INTO Employees (id, name, age, email, salary) VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setInt(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setInt(3, employee.getAge());
			pstmt.setString(4, employee.getEmail());
			pstmt.setDouble(5, employee.getSalary());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new EmployeeServiceException("Failed to add employee", e);
		}
	}

	public List<Employee> getAllEmployees() {
		String query = "SELECT id, name, age, email, salary FROM Employees"; // Avoid SELECT *
		List<Employee> employees = new ArrayList<>();
		try (Connection conn = DatabaseConnection.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				employees.add(new Employee(rs.getInt("id"), rs.getString("name"), rs.getInt("age"),
						rs.getString("email"), rs.getDouble("salary")));
			}
		} catch (SQLException e) {
			throw new EmployeeServiceException("Failed to retrieve employees", e);
		}
		return employees;
	}

	public void updateEmployee(Employee employee) {
		String query = "UPDATE Employees SET name = ?, age = ?, email = ?, salary = ? WHERE id = ?";
		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setString(1, employee.getName());
			pstmt.setInt(2, employee.getAge());
			pstmt.setString(3, employee.getEmail());
			pstmt.setDouble(4, employee.getSalary());
			pstmt.setInt(5, employee.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new EmployeeServiceException("Failed to update employee", e);
		}
	}

	public void deleteEmployee(int id) {
		String query = "DELETE FROM Employees WHERE id = ?";
		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new EmployeeServiceException("Failed to delete employee", e);
		}
	}
}
