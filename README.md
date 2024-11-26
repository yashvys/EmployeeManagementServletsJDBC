
# Employee Management System

## Description

This is a simple **Employee Management System** built using **Java**, **JSP**, and **Servlets**. The system allows users to:

- View a list of employees
- Add, edit, and delete employee records
- Update employee details such as name, age, email, and salary

This project demonstrates how to integrate a backend with a frontend for managing employee data in a company.

## Features

- **Employee List**: View all employees with details such as ID, Name, Age, Email, and Salary.
- **CRUD Operations**: 
  - Add new employees
  - Edit employee details
  - Delete employees from the list
- **User-Friendly Interface**: Simple and easy-to-navigate interface to perform tasks like viewing and managing employees.

## Technologies Used

- **Backend**: Java, JSP (Java Server Pages), Servlets
- **Frontend**: HTML, CSS
- **Database**: MySQL (for storing employee records)
- **Development Tools**: GitHub, GitHub Desktop, MySQL Workbench

## Installation Instructions

### Prerequisites

Before running this project, you need to have the following installed on your system:

1. **JDK 8 or higher** (Java Development Kit)
2. **Apache Tomcat** (for running the servlet)
3. **MySQL** (or any other relational database) for managing employee data

### Steps to Run Locally:

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/your-username/employee-management-system.git
   ```

2. Set up your MySQL database. Create a new database and import the schema for employee data. You can use the following SQL command to create a simple table:

   ```sql
   CREATE TABLE employees (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(100),
       age INT,
       email VARCHAR(100),
       salary DECIMAL(10, 2)
   );
   ```

3. Configure the database connection in the project by updating the **database configuration file** with your MySQL credentials (username, password, etc.).

4. Build the project using your IDE (like Eclipse or IntelliJ IDEA).

5. Deploy the project on **Apache Tomcat** server.

6. Access the project in your browser at:

   ```bash
   http://localhost:8080/employee-management-system
   ```

### Running the Application

Once the application is up and running, navigate to the **Employee List** page to view the employees. You can:

- Add a new employee
- Edit or delete an existing employee
- View employee details in a table format


