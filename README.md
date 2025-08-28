# University Course Management System - Backend

This is the **Spring Boot backend** for the University Course Management System.  
It provides REST APIs for managing courses, students, and results.

## 🚀 Features
- Manage Courses (Add, Update, Delete, List)
- Manage Students
- Manage Results
- REST APIs with Spring Boot
- Integrated with MySQL (or in-memory H2 for testing)
- CORS enabled for frontend connection

## ⚙️ Tech Stack
- Java 17
- Spring Boot
- Maven
- MySQL / H2 (configurable)

## 📂 Project Structure
course-management/
├── src/main/java/com/example/course_management/
│ ├── controller/ # API Controllers
│ ├── model/ # Entity Classes
│ ├── repository/ # JPA Repositories
│ └── service/ # Business Logic
├── src/main/resources/
│ ├── application.properties
└── pom.xml


## ▶️ Run Locally
1. Clone repo  
   ```bash
   git clone <your-backend-repo-link>
   cd course-management

2. Build & run
   mvn spring-boot:run

3. API available at:
   http://localhost:8080/api/courses
   http://localhost:8080/api/students
   http://localhost:8080/api/results

🐳 Run with Docker
1. Build image
   docker build -t course-management-backend .
2. Run container
   docker run -p 8080:8080 course-management-backend

📌 Deployment

Deployed on Railway.
https://<backend-service>.railway.app/api/courses

👨‍💻 Author
Danushan Ganeshan
CT/2019/032

