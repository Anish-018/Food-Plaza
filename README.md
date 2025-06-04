🍽️ Food Plaza – Java Desktop Application for Food Ordering & Management

Food Plaza is a Java-based desktop application designed to simulate a real-world food ordering and restaurant management system. Built using core Java, Swing for GUI, JDBC for database interaction, and MySQL for backend storage, this application serves as an ideal learning project for mastering CRUD operations and Model View Controller architecture in Java.

---

📋 Project Objective

The purpose of the Food Plaza project is to:

Enable restaurant staff/admin to manage food menus and customer records

Allow customers to register, log in, and place orders

Automate the billing process for placed orders

Provide a user-friendly graphical interface for both customers and staff

---

🔧 Key Features

🧑‍🍳 Admin Functionalities:

Secure login system for admin

Menu Management (CRUD): Add, update, delete, and view food items

Customer Management: Add, delete, and view customer data

Order Management: View, update, or delete orders

Billing System: Automatically generate and view bills

---

🍽️ Customer Functionalities:

User registration and login

View food menu and place orders

Billing view after order confirmation

Profile management and past order history

---

🛠️ Tech Stack

Layer	Technology Used

Programming Language	Java
GUI Framework	Swing (Java Toolkit)
Database	MySQL
Database Access	JDBC
Architecture	MVC (Model-View-Controller)

---

📂 Project Structure

Food-Plaza/
├── dao/       → Database operations (CRUD)
├── model/     → POJO classes (Food, Customer, Order, etc.)
├── service/   → Business logic implementations
├── ui/        → Swing GUI components
├── database/  → SQL scripts and config files

---

🗄️ MySQL Database Integration

The Food Plaza application uses MySQL as the relational database management system to store and manage data such as food items, customers, orders, and admin credentials. The Java application interacts with MySQL using JDBC (Java Database Connectivity).

---

🧱 Database Schema Overview

Create a database named (for example):

CREATE DATABASE foodplaza;
USE foodplaza;

1. Admin Table

Stores login credentials for admin users.

CREATE TABLE admin (
    adminId INT PRIMARY KEY AUTO_INCREMENT,
    adminName VARCHAR(50),
    adminPassword VARCHAR(50)
);

2. Customer Table

Stores registered customers' details.

CREATE TABLE customer (
    customerId INT PRIMARY KEY AUTO_INCREMENT,
    customerName VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(15),
    address TEXT,
    password VARCHAR(50)
);

3. Food Table

Stores menu items available for ordering.

CREATE TABLE food (
    foodId INT PRIMARY KEY AUTO_INCREMENT,
    foodName VARCHAR(100),
    foodCategory VARCHAR(50),
    foodType VARCHAR(50), -- e.g., Veg/Non-Veg
    foodPrice DOUBLE
);

4. Order Table

Stores customer orders.

CREATE TABLE order_detail (
    orderId INT PRIMARY KEY AUTO_INCREMENT,
    customerId INT,
    foodId INT,
    quantity INT,
    totalAmount DOUBLE,
    FOREIGN KEY (customerId) REFERENCES customer(customerId),
    FOREIGN KEY (foodId) REFERENCES food(foodId)
);

> ✅ Note: The order_detail table links customers and food items using foreign keys, supporting a many-to-one relationship.
