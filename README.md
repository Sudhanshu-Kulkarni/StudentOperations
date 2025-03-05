# Student Management System

This repository contains a Java-based **Student Management System** that allows users to perform various operations on student records. The program uses a **command-line interface** and provides functionality for adding, displaying, searching, updating, and deleting student records.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Classes and Methods](#classes-and-methods)
- [How to Run](#how-to-run)

## Overview
The **Student Management System** allows users to store and manage student details such as **Name** and **PRN (Permanent Registration Number)**. The program provides options to **search, update, and delete student records** based on PRN, Name, or Position in the list.

The program consists of the following classes:
- **`Student`**: Represents an individual student with attributes **name** and **PRN**.
- **`StudentOperations`**: Handles all operations related to student records, including **adding, searching, updating, and deleting students**.
- **`Main`**: Serves as the entry point of the application, managing user interaction via a menu-driven interface.

## Features
- **Add Student**: Users can add new students with a **name** and **PRN**.
- **Display All Students**: Lists all students currently stored.
- **Search by PRN**: Finds and displays a student using their **PRN**.
- **Search by Name**: Finds and displays a student using their **name**.
- **Search by Position**: Displays student details at a specified position in the list.
- **Update Student**: Allows modifying a student's **name** using their **PRN**.
- **Delete Student**: Removes a student from the list using their **PRN**.

## Classes and Methods

### **Student Class**
Represents a student with **name** and **PRN**.

#### **Methods**
- `public Student(String name, long prn)`: Constructor to initialize student details.
- `public void setName(String name)`: Sets a student's name.
- `public String getName()`: Returns the student's name.
- `public void setPRN(long prn)`: Sets the PRN.
- `public long getPRN()`: Returns the PRN.
- `public void display()`: Displays student details.

---

### **StudentOperations Class**
Handles student-related operations.

#### **Methods**
- `public void addStudent(Student student)`: Adds a new student to the list.
- `public void displayStudents()`: Displays all students.
- `public void searchByPRN(long prn)`: Searches for a student by PRN.
- `public void searchByName(String name)`: Searches for a student by name.
- `public void searchByPosition(int position)`: Displays the student at a specified position.
- `public void updateStudent(long prn, String newName)`: Updates a student's name using their PRN.
- `public void deleteStudent(long prn)`: Removes a student from the list using PRN.

---

### **Main Class**
The main class that runs the program and manages user interactions.

#### **Workflow**
1. Displays a menu with options for different operations.
2. Takes user input and performs the corresponding action.
3. Repeats the menu until the user chooses to exit.

---

## **How to Run**
1. **Clone the repository** to your local machine:
   ```bash
   git clone https://github.com/Sudhanshu-Kulkarni/StudentOperations.git
