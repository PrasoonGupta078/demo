# Student Management System API

A secure RESTful Student Management System built using Spring Boot, Spring Security, JWT Authentication, Spring Data JPA, MySQL, Swagger, and Docker.

## Features

* User Registration and Login
* JWT-based Authentication and Authorization
* Secure REST APIs
* Student CRUD Operations
* Global Exception Handling
* MySQL Database Integration
* Swagger API Documentation
* Docker Support
* Layered Architecture (Controller, Service, Repository)

## Tech Stack

* Java 17
* Spring Boot
* Spring Security
* JWT (JSON Web Token)
* Spring Data JPA
* MySQL
* Maven
* Swagger/OpenAPI
* Docker

## Project Structure

```text
src/main/java/com/example/demo
│
├── AuthController.java
├── StudentController.java
├── StudentService.java
├── StudentRepository.java
├── Student.java
│
├── AppUser.java
├── AppUserRepository.java
│
├── JwtUtil.java
├── JwtFilter.java
├── SecurityConfig.java
│
├── GlobalExceptionHandler.java
├── StudentNotFoundException.java
│
├── SwaggerConfig.java
└── DemoApplication.java
```

## API Endpoints

### Authentication

| Method | Endpoint       | Description                 |
| ------ | -------------- | --------------------------- |
| POST   | /auth/register | Register a new user         |
| POST   | /auth/login    | Login and receive JWT token |

### Student Management

| Method | Endpoint       | Description          |
| ------ | -------------- | -------------------- |
| GET    | /students      | Get all students     |
| GET    | /students/{id} | Get student by ID    |
| POST   | /students      | Create a new student |
| PUT    | /students/{id} | Update student       |
| DELETE | /students/{id} | Delete student       |

> Student endpoints require a valid JWT token.

## Running the Application

### Clone the Repository

```bash
git clone https://github.com/PrasoonGupta078/demo.git
cd demo
```

### Configure Database

Update the `application.properties` file with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Run Using Maven

```bash
mvn spring-boot:run
```

Application will start at:

```text
http://localhost:8080
```

## Swagger Documentation

After starting the application, access Swagger UI:

```text
http://localhost:8080/swagger-ui/index.html
```

## Docker

Build Docker Image:

```bash
docker build -t student-management-api .
```

Run Container:

```bash
docker run -p 8080:8080 student-management-api
```

## Learning Outcomes

This project demonstrates:

* REST API Development
* Spring Security Configuration
* JWT Authentication
* Database Integration with JPA
* Exception Handling
* API Documentation
* Docker Containerization
* Layered Backend Architecture

## Author

Prasoon Gupta

GitHub: https://github.com/PrasoonGupta078
