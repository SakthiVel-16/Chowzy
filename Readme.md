# Chowzy - Food Cart Web Application

## 🌐 Overview

**Chowzy** is a full-stack Food Cart Web Application designed to offer a seamless and user-friendly online ordering experience. Built using **Java Servlets, JSP, and MySQL**, the platform enables users to browse menus from various restaurants, manage their cart, and place orders efficiently. It also features an admin module for backend management.

---

## 🎯 Objective

The goal of this application is to replicate a real-world food ordering system where users can:

- Browse food items categorized by restaurant
- Add items to a cart
- Update quantities or remove items
- Checkout and place orders
- Admins can manage food items, prices, and monitor orders

---

## 🚀 Features

### 1. User Authentication
- Secure registration and login system
- Session-based user tracking

### 2. Restaurant and Food Management
- Dynamic listing of restaurants
- Menu generation from database entries

### 3. Cart Functionality
- Add, update, or remove food items
- Automatically clear cart when switching restaurants

### 4. Checkout Process
- Detailed cart summary with quantities and pricing
- Order placement and data persistence
- Automatic cart clearance after successful checkout

### 5. Admin Module
- Secure admin login
- Add, update, or delete food items
- Manage restaurants and their data
- View all user orders with complete breakdowns

---

## 🧩 Modules

| Module         | Description |
|----------------|-------------|
| **User Module** | Manages registration, login, and sessions |
| **Restaurant Module** | Displays restaurants and corresponding food items |
| **Cart Module** | Handles cart operations: add, update, remove, and display |
| **Order Module** | Manages checkout, order storage, and cart clearance |
| **Admin Module** | Admin interface for food and restaurant management, and order monitoring |

---

## 🛠️ Technology Stack

- **Frontend:** JSP, HTML, CSS
- **Backend:** Java Servlets, JDBC
- **Database:** MySQL
- **Server:** Apache Tomcat

---

## 🗃️ Database Design

### Tables

| Table Name | Description |
|------------|-------------|
| `users` | Stores user details (`user_id`, `name`, `email`, `password`) |
| `admins` | Stores admin credentials (`admin_id`, `username`, `password`) |
| `restaurants` | Restaurant info (`restaurant_id`, `name`, `location`) |
| `food` | Menu items (`food_id`, `food_name`, `price`, `restaurant_id`) |
| `cart` | User cart (`user_id`, `food_id`, `quantity`) |
| `orders` | Order summary (`order_id`, `user_id`, `total_amount`, `order_date`) |
| `order_details` | Itemized order data (`order_id`, `food_id`, `quantity`, `price`) |

---

## 🔑 Key Functionalities

### Dynamic Food Menu
- Real-time display based on selected restaurant

### Cart Management
- Add/remove/update cart items with live feedback

### Order Management
- Store and retrieve orders from the database
- Clear cart post-order placement

### Admin Management
- Manage menu items and pricing
- Restaurant add/edit/remove capabilities
- View and track all user orders

---

## 🔄 Workflow

1. User logs in or registers
2. User selects a restaurant to view its menu
3. User adds food items to the cart
4. User reviews and modifies cart if needed
5. User proceeds to checkout and places an order
6. Admin logs in to manage items, restaurants, and orders

---
