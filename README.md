# 🔐 Spring Security Learning

This repository contains my hands-on learning journey with **Spring Security** and **Spring Boot**.

The goal of this project is to understand how Spring Security works internally and how to secure real-world Spring Boot applications.

---

## 🚀 Tech Stack

- Java
- Spring Boot
- Spring Security
- Maven
- IntelliJ IDEA

---

## 📚 What I Am Learning

### 1. Spring Security Basics
- What is Spring Security?
- Why do we need Spring Security?
- Spring Security architecture
- Security filter chain
- Default security configuration
- Authentication vs Authorization

### 2. Authentication
- Username and password authentication
- In-memory authentication
- Database authentication
- `UserDetails`
- `UserDetailsService`
- `PasswordEncoder`
- BCrypt password hashing

### 3. Authorization
- Roles
- Authorities
- Role-based access control
- Method-level security
- Securing specific endpoints

### 4. Security Configuration
- `SecurityFilterChain`
- `HttpSecurity`
- Configuring public endpoints
- Configuring protected endpoints
- Form login
- HTTP Basic authentication
- Logout

### 5. Database Security
- Storing users in a database
- Loading users using `UserDetailsService`
- Password hashing
- User roles and authorities

### 6. REST API Security
- Securing REST APIs
- Stateless authentication
- JWT authentication
- Bearer tokens
- Authentication filters

### 7. Advanced Topics
- CSRF
- CORS
- Session management
- OAuth2
- OpenID Connect
- JWT
- Exception handling
- Security best practices

---

## 🔑 Authentication vs Authorization

### Authentication

Authentication answers:

> "Who are you?"

Example:

```text
Username: lokesh
Password: ********
        ↓
   Authentication
        ↓
   User identified
