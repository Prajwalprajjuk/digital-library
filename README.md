Digital Library Management System
Project Description

This is a Command Line Interface (CLI) based Digital Library Management System developed using Core Java, JDBC, and MySQL.

The application follows a layered architecture:

DAO (Interface)

DTO

DAOImpl (Database connection inside this class)

Service

Main (Menu-driven execution)

The system allows users to perform basic CRUD operations on books stored in a MySQL database.

Features

Add new book

View all books

Update book price

Delete book

Menu-driven interface

JDBC database connectivity

Clean layered architecture

Technologies Used

Java (Core Java)

JDBC

MySQL

Eclipse IDE

Git & GitHub

Database Setup

Run the following SQL commands in MySQL:

CREATE DATABASE digital_library;
USE digital_library;

CREATE TABLE books (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    author VARCHAR(100),
    category VARCHAR(50),
    price DOUBLE,
    status VARCHAR(20)
);
How to Run

Create the database in MySQL.

Update MySQL username and password inside BookDAOImpl.java.

Add MySQL Connector JAR file to your project build path.

Run MainApp.java.
