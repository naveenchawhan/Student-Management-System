
# Student Management System

This is a console-based Student Management System developed using Java, JDBC and MySQL.

I built this project to improve my understanding of Java, JDBC connectivity and database operations. It allows users to register, log in and manage student information.

## Technologies Used
- Java
- JDBC
- MySQL
- Eclipse IDE

## Features
- Student Registration
- Student Login
- View Student Profile
- Update Student Details
- Delete Student Records
- Search Students using Phone Number and Email
- View All Registered Students

## Project Structure

- **DTO:** Stores student information.
- **DAO:** Handles database operations.
- **Connectivity:** Establishes the connection with MySQL.
- **User:** Contains the classes for user interactions.

## Database Setup

1. Create a MySQL database:

   ```sql
   CREATE DATABASE studentapp;
   ```

2. Create the `STUDENT` table with the required columns:

   ```sql
   CREATE TABLE STUDENT (
       SID INT PRIMARY KEY AUTO_INCREMENT,
       SNAME VARCHAR(100),
       PHONE BIGINT,
       EMAIL VARCHAR(100),
       BRANCH VARCHAR(50),
       LOCATION VARCHAR(100),
       PASSWORD VARCHAR(100),
       DATE DATE
   );
   ```

3. Update your MySQL username and password in `Connect.java`.
4. Add the MySQL Connector/J library to the project.
5. Run `Test.java` to start the application.

## How It Works

When the application starts, users can choose to register or log in. After successful login, they can view their profile, update or delete their details, search for other students and view all registered student records.

Student information is stored and managed in a MySQL database using JDBC.

## Note

This project was developed as part of my learning journey in Java and database development.
