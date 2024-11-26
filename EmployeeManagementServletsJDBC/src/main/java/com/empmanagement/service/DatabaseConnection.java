package com.empmanagement.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Utility class to manage database connections.
 */
public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/EmployeeDB";
    private static final String USER = "root"; // Replace with your MySQL username
    private static final String PASSWORD = "root"; // Replace with your MySQL password

    // Private constructor to prevent instantiation
    private DatabaseConnection() {
        throw new UnsupportedOperationException("Utility class; cannot be instantiated");
    }

    /**
     * Establishes and returns a database connection.
     *
     * @return Connection object
     * @throws DatabaseConnectionException if there is an error connecting to the database
     */
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new DatabaseConnectionException("Failed to connect to the database", e);
        }
    }
}
