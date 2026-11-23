# Student Management System

This is a console-based Student Management System developed using Java, JDBC and MySQL.

I created this project to practise Java programming, database connectivity and CRUD operations. It allows users to register, log in and manage student details.

## Technologies Used
- Java
- JDBC
- MySQL
- Eclipse IDE

## Features
- Student registration
- Student login using email and password
- View student profile
- Update student details
- Delete student records
- Search students using phone number and email
- View all registered students

## Project Structure

- **DTO:** Stores student information.
- **DAO:** Handles database operations.
- **Connectivity:** Establishes the connection with MySQL.
- **User:** Contains the classes responsible for user interactions.

## Database Setup

1. Create a MySQL database named `studentapp`.
2. Create a table named `STUDENT` with the required columns.
3. Update your MySQL username and password in `Connect.java`.
4. Add the MySQL Connector/J library to the project.
5. Run the `Test.java` file to start the application.

## How It Works

The application starts with a menu where users can register or log in. After successful login, users can view, update, delete and search student records. All student information is stored in a MySQL database using JDBC.

---

**Note:** This project was developed as part of my learning journey in Java and database development.
