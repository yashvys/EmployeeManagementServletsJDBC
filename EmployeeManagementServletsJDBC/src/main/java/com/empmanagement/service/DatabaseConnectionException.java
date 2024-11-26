package com.empmanagement.service;

/**
 * Custom exception class for database connection errors.
 */
public class DatabaseConnectionException extends RuntimeException {

	/**
	 * Constructs a new DatabaseConnectionException with the specified detail
	 * message.
	 *
	 * @param message The detail message.
	 */
	public DatabaseConnectionException(String message) {
		super(message);
	}

	/**
	 * Constructs a new DatabaseConnectionException with the specified detail
	 * message and cause.
	 *
	 * @param message The detail message.
	 * @param cause   The cause of the exception.
	 */
	public DatabaseConnectionException(String message, Throwable cause) {
		super(message, cause);
	}
}
