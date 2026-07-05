# 🔐 Secure Notes

Secure Notes is a full-stack web application designed for securely creating, managing, and organizing personal notes. It features JWT-based authentication, OAuth2 social login, Multi-Factor Authentication (MFA), and role-based authorization.

## 🌐 Live Demo

**Live Application:** https://secure-notes-ui.vercel.app/

**Backend API:** https://secure-notes-qang.onrender.com/

> Note: The backend is hosted on Render's free tier, so the first request may take some time if the service is inactive.

## ✨ Features

- 🔑 JWT-Based Authentication
- 🌐 OAuth2 Login with Google and GitHub
- 📲 Multi-Factor Authentication (MFA)
- 👤 Role-Based Authorization
- 📝 Create, Read, Update, and Delete Notes
- 🔍 Search Notes
- 🛡️ Secure API Access with Spring Security
- ⚡ RESTful API Architecture
- 🎨 Responsive React Frontend
- ☁️ Full-Stack Cloud Deployment

## 🛠️ Tech Stack

### Backend

- Java
- Spring Boot
- Spring Security
- JWT Authentication
- OAuth2
- Spring Data JPA
- Maven
- PostgreSQL

### Frontend

- React.js
- Tailwind CSS
- Axios

### Deployment

- Vercel — Frontend
- Render — Backend
- Render PostgreSQL — Database
- Docker — Backend Containerization

### Development Tools

- Git
- GitHub
- Postman
- IntelliJ IDEA
- Visual Studio Code

## 🏗️ Architecture

Frontend (React + Vercel)
        │
        │ HTTPS / REST API
        ▼
Backend (Spring Boot + Render)
        │
        │ JPA / Hibernate
        ▼
Database (PostgreSQL + Render)

## 🔐 Authentication

Secure Notes supports multiple authentication methods:

- Username and password authentication
- JWT-based session management
- Google OAuth2 login
- GitHub OAuth2 login
- Multi-Factor Authentication (MFA)

Protected API endpoints require valid authentication and authorization.

## 🚀 Deployment

The application is deployed using a cloud-based architecture:

- The React frontend is hosted on Vercel.
- The Spring Boot REST API is containerized with Docker and deployed on Render.
- Application data is stored in a PostgreSQL database hosted on Render.

## 📌 Project Status

The application is deployed and accessible online. Core authentication, OAuth2 login, MFA, authorization, and note management functionality are implemented.

